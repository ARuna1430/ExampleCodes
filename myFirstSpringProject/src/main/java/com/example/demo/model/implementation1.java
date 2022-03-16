package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bean1")
public class implementation1 implements dependencyinterface{

	//@Override
	//@Autowired()
	private dependencyinterface2 bean2;
	
	    public implementation1(dependencyinterface2 bean2) {
		super();
		this.bean2 = bean2;
	}

	/*public void setBean2(dependencyinterface2 bean2) {
		this.bean2 = bean2;
		
	}*/
	public void display() {
		// TODO Auto-generated method stub
		
		String s = bean2.getinfo();
		System.out.println("++++"+s);
	}

}
