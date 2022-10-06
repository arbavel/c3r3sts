package com.usa.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.usa.ciclo3.model"})
@SpringBootApplication
public class C3r3Application {

	public static void main(String[] args) {
		SpringApplication.run(C3r3Application.class, args);
	}

}
