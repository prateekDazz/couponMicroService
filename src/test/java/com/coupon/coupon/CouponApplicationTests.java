package com.coupon.coupon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponApplicationTests {
	Logger logger = LoggerFactory.getLogger(CouponApplicationTests.class);


	@Test
	void contextLoads() {
	}
	
	@Test
	@DisplayName("sample Test Method")
	void sample()
	{
		logger.info("executing Test");
		assertEquals(true, true);
	}

}
