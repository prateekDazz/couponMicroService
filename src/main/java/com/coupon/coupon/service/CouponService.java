package com.coupon.coupon.service;

import com.coupon.coupon.model.Coupon;

public interface CouponService {
public Coupon createCoupon(Coupon coupon);

public Coupon fetchCouponByCouponId(String  couponCode);
}
