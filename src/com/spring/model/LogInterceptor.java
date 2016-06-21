package com.spring.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogInterceptor {
	@Before("execution(public void com.spring.model.Person.useAxe())")
	public void before(){
		System.out.println("这是一个日志");
	}
}
