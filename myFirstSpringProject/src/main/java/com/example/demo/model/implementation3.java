package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component("bean3")


public class implementation3 implements dependencyinterface2{

	@Override
	public String getinfo() {
		// TODO Auto-generated method stub
		return "Response from implementation3";
	}

}
