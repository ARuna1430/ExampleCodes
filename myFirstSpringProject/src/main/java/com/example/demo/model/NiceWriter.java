package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class NiceWriter implements Iwriter{

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		System.out.println("From NiceWriter class"+s);
		
	}

	
	

}
