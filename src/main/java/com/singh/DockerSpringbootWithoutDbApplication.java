package com.singh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootWithoutDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootWithoutDbApplication.class, args);
	}

	@GetMapping("/")
	public String getWelcomeMessage() {
		return "Welcome to Docker with Spring Boot Without Db Project";
	}
}
