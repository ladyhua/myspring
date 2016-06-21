package com.spring.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void personTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Person p=(Person) ac.getBean("person");
		
		p.useAxe();
		
	}
}
