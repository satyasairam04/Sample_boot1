package com.satya.Sample_boot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.satya.Controller")
@SpringBootApplication
public class SampleBoot1Application {
	
	@Value("${my.name}")
	public static String name;
	
	public static void main(String[] args) {
		ApplicationContext AC=	SpringApplication.run(SampleBoot1Application.class, args);	
	
		for(String k : AC.getBeanDefinitionNames())
			System.out.println(k);
		
		System.out.println("my name====" + name);	
}
}
