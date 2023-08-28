package com.accenture;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    //@Before("execution(void com.accenture.GreetingService.greeting())")
    public void beforeMethod() {
        System.out.println("Before: Calling greeting() method");
    }

    //@After("execution(void com.accenture.GreetingService.greeting())")
    public void afterMethod() {
        System.out.println("After: Calling greeting() method");
    }

    @Around("execution(void com.accenture.GreetingService.greeting())")
    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Around: Calling greeting() method");
        Object retValue = joinPoint.proceed();
        System.out.println("After Around: Calling greeting() method");
    }
}
