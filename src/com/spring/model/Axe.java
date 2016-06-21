package com.spring.model;

import org.springframework.stereotype.Component;

@Component("axe")
public class Axe {
	public String chop(){
		return "使用斧头砍柴";
	}
}
