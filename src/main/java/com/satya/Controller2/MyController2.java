package com.satya.Controller2;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/app2")
public class MyController2 {

	@Autowired
	@Qualifier("mybean2")
	String beannnn;
	
	@Autowired
	RestTemplate Rt;
	
	@Value("${my.name}")
	String name;
	
	//@Autowired
	//DiscoveryClient Dc;
	
	@RequestMapping("/hello")
	public String hello()
	{
		//return "helloooo";
		
	//URI uri=Dc.getInstances("second-service").get(0).getUri().resolve("/greetings");
	//return Rt.getForObject(uri, String.class);
	
		//return Rt.getForObject("http://localhost:8100/greetings", String.class); //simple
		return "hi";
	}
	
	@Bean
	public String beans(ApplicationContext AC)
	{
		for(String k : AC.getBeanDefinitionNames())
			System.out.println(k);
		
		System.out.println("my-----strignbean "+beannnn);
		
		System.out.println("My value name " + name);
		
		return "heeeee";		
	}
	
	@Bean
	public RestTemplate temp() {
		return new RestTemplate();
	}
}
