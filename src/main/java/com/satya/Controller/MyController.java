package com.satya.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration
@ComponentScan(basePackages = "com.satya.Controller2")
@RestController
@RequestMapping("/app1")
public class MyController {	

	
	@RequestMapping("/hello")
	public String hello()
	{
		return "helloooo";	 	
	}
	
	@Bean
	public String mybean() {
		return "sattttya";
	}

	
	@Bean
	public String mybean2() {
		return "satya sai ram";
	}
}
