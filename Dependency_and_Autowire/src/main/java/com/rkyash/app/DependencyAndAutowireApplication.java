package com.rkyash.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyAndAutowireApplication {

	public String name;
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DependencyAndAutowireApplication.class, args);
		
		//Dependency Injection 
		Student s=context.getBean(Student.class);
		s.show();
		
		
//		Student s1=context.getBean(Student.class);
//		s1.show();
	}
}