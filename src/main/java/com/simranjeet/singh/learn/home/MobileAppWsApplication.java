package com.simranjeet.singh.learn.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.simranjeet.singh.learn.home.io.repository.UsersRepository")
@ComponentScan(basePackages = {"com.simranjeet.singh.learn.home.io.repository.UsersRepository"})
public class MobileAppWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppWsApplication.class, args);
	}

}

