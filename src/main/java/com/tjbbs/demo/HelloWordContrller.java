package com.tjbbs.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordContrller {
	 
	    @RequestMapping("/")
	    public String sayHello() {
	    
	        return "Hello,World!";
	    }
}
