package com.coupon.coupon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupon.coupon.model.Coupon;
import com.coupon.coupon.repository.CouponRepository;
@Service
public class CouponServiceImpl implements CouponService {
@Autowired
	private CouponRepository couponRepository;
	@Override
	public Coupon createCoupon(Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon fetchCouponByCouponId(String  couponCode) {
		return couponRepository.findByCode(couponCode);
	}

}
