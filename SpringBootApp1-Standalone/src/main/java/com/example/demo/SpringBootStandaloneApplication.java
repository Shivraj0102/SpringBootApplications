package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootStandaloneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootStandaloneApplication.class, args);
		
		System.out.println("Hello");
		Person p  = context.getBean(Person.class);
		p.show();
	}

}
