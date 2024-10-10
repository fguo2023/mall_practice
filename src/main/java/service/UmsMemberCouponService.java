package service;

import com.august.mallcopy.common.api.CommonResult;
import com.august.mallcopy.mbg.model.CartPromotionItem;
import com.august.mallcopy.mbg.model.SmsCoupon;
import com.august.mallcopy.mbg.model.SmsCouponHistory;
import com.august.mallcopy.mbg.model.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    // before improved
//    @Transactional
//    CommonResult add(Long couponId);

    @Transactional
    void add(Long couponId);

    /**
     * 获取优惠券历史列表
     */
    List<SmsCouponHistory> listHistory(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);

    /**
     * 获取当前商品相关优惠券
     */
    List<SmsCoupon> listByProduct(Long productId);

    /**
     * 获取用户优惠券列表
     */
    List<SmsCoupon> list(Integer useStatus);
}
