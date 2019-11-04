package com.example.FirstExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.FirstExample")
@SpringBootApplication
public class FirstExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstExampleApplication.class, args);
	}

}
