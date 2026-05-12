package com.subodh.sprintboot90days.springbootPlacement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbokPlacementApplication implements CommandLineRunner {

	@Autowired
	DBservice dBservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringbokPlacementApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(dBservice.getData());

//		obj.eatApple();
	}
}
