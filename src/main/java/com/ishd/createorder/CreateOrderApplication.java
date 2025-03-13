package com.ishd.createorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CreateOrderApplication {

	

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CreateOrderApplication.class, args);
		
	}
}