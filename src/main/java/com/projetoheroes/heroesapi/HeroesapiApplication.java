package com.projetoheroes.heroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroesapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(HeroesapiApplication.class, args);
		System.out.println("Welcome to the hero management application, showing the powers of WebFlux");
	}

}
