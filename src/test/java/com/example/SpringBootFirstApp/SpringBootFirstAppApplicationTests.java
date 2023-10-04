package com.example.SpringBootFirstApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootFirstAppApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringBootFirstAppApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Its a Test Class continuous Integration Job..");
		assertEquals(true, true);
	}

}
