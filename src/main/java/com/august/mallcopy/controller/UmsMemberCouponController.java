package com.august.mallcopy.controller;

import com.august.mallcopy.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UmsMemberCouponService;

@Controller
@Api(tags = "UmsMemberCouponController", description = "Member coupon management")
@RequestMapping("/member/coupon")
public class UmsMemberCouponController {
    @Autowired
    private UmsMemberCouponService memberCouponService;

     //improved before
//    @ApiOperation("领取指定优惠券")
//    @RequestMapping(value = "/add/{couponId}", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult add(@PathVariable Long couponId) {
//        return memberCouponService.add(couponId);
//    }

    //improve later
    @ApiOperation("领取指定优惠券")
    @RequestMapping(value = "/add/{couponId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@PathVariable Long couponId) {
        memberCouponService.add(couponId);
        return CommonResult.success(null,"Received coupon successfully");
    }

}
