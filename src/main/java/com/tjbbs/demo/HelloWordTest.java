package com.tjbbs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWordTest {
	
	public static void main(String[] args) {
		HelloWordContrller he = new HelloWordContrller();
		he.sayHello();
		SpringApplication.run(HelloWordTest.class, args);
	}
}
