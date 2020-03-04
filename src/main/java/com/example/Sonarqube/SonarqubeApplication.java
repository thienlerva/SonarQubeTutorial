package com.example.Sonarqube;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarqubeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sonarqube");
	}

}
