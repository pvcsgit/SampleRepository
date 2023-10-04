package com.example.SpringBootFirstApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstAppApplication implements CommandLineRunner {

	public static Logger logger = LoggerFactory.getLogger(SpringBootFirstAppApplication.class);
	public static void main(String[] args) {
		logger.info("Its a continuous Integration Job..");
		SpringApplication.run(SpringBootFirstAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its a Second continuous Integration Job..");
	}

}
