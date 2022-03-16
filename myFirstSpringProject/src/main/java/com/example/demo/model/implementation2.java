package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component("bean2")

public class implementation2 implements dependencyinterface2{

	public String getinfo() {
		return "from implementarion2 class";
	}

}
