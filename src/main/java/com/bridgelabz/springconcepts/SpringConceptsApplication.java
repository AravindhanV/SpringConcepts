package com.bridgelabz.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Boot Demo");
		SpringApplication.run(SpringConceptsApplication.class, args);
	}

}
