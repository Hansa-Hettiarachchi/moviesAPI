package com.movieapi.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// This annotation is used to tell Spring that this is the main class
public class MoviesApplication {

	// This method is used to run the application
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
