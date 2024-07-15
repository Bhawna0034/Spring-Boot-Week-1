package com.bhawna.SpringBoot.Week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWeek1Application implements CommandLineRunner {

	@Autowired
	DBService dbService;
//	Dog dog;


	public static void main(String[] args) {

		SpringApplication.run(SpringBootWeek1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//dog.eating();
		System.out.println(dbService.getData());
	}
}
