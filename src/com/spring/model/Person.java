package com.spring.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component("person")
public class Person {
	private Axe axe;

	public Axe getAxe() {
		return axe;
	}
	@Resource(name="axe")
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
	public void useAxe(){
		System.out.println("我打算去砍点柴");
		System.out.println(axe.chop());
	}
}
