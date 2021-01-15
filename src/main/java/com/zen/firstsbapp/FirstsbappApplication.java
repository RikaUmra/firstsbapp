package com.zen.firstsbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstsbappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FirstsbappApplication.class, args);

		GreetingService gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
	}

	@Bean
	public GreetingService greetingService() {
		return new GreetingService();
	}
}