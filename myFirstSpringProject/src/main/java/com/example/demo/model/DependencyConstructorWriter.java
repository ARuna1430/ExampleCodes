package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyConstructorWriter {
	private Iwriter writer;

	
	
	
    public DependencyConstructorWriter(Iwriter writer) {
		super();
		this.writer = writer;
	}

	/*
	 * @Autowired public void setWriter(Iwriter writer) { this.writer = writer; }
	 */

    public void run() {
        String s = "This is my test";
        writer.display(s);
    }
	
	

}
