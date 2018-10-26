package com.lina02.gmall.service;

import com.lina02.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     */
    public List<UserAddress> initOrder(String userId);

}