package com.coupon.coupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CouponApplication {
	Logger logger = LoggerFactory.getLogger(CouponApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
	}
	@PostConstruct
	
	public void init()
	{
		logger.info("started the application and create the bean");
		
		logger.info("the 2nd commit");
	}

}
