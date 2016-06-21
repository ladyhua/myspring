package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Person p=ctx.getBean("person",Person.class);
		p.useAxe();
	}
}
