package com.coupon.coupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.coupon.model.Coupon;
import com.coupon.coupon.service.CouponService;
@RestController
@RequestMapping("/coupons/api")
public class CouponController {

	@Autowired
	private CouponService couponService;
	@PostMapping
	public Coupon saveCoupon(@RequestBody Coupon coupon)
	{
		return couponService.createCoupon(coupon);
	}
	@GetMapping
	
	public Coupon getCouponByCouponCode(@RequestParam("couponCode") String couponCode)
	{
		return couponService.fetchCouponByCouponId(couponCode);
	}
}
