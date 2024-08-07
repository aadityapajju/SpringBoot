package com.explore.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AppApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.build();

	}

}
