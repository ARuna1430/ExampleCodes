package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.model.DependencyConstructorWriter;
import com.example.demo.model.dependencyinterface;

@SpringBootApplication
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringProjectApplication.class, args);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.demo");
        appContext.refresh();
         
        dependencyinterface client = (dependencyinterface) appContext.getBean("bean1");
        client.display();
       // DependencyConstructorWriter dcw = appContext.getBean(DependencyConstructorWriter.class);
        //dcw.run();
        appContext.close();
	}

}
