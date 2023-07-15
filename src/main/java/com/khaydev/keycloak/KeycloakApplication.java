package com.khaydev.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class KeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakApplication.class, args);
	}

}
