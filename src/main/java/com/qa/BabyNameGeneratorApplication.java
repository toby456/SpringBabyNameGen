package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.qa.rest.BabyNameEndpoint;

@SpringBootApplication
public class BabyNameGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyNameGeneratorApplication.class, args);
	}
}
