package dev.kovalen.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
	1. When first running the program, a socket error occurs due to their being a declaration for mongodb in the pom.xml
	   file, but no actual credentials are being used to connect to it. Simply comment it out
	2. After reloading the project in pom.xml -> right-click -> maven -> reload project, running the application will host
	   on port 8080 but will display a White Label error which just means we are not hitting any endpoints at the moment

*/

@SpringBootApplication
@RestController // Lets the Spring framework know that this class is a rest api controller, and not just another class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// The root endpoint
	@GetMapping("/") // Lets the Spring framework known at apiRoot is a GET endpoint
	public String apiRoot() {
		return "Hello World";
	}
}
