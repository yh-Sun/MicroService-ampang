package com.ampang.policy.controller;

import com.ampang.order.api.OrderService;
import com.ampang.order.api.OrderVo;
import com.nepxion.discovery.common.constant.DiscoveryConstant;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/policy")
@Api(value = "policy", tags = "测试Order Feign是否通了")
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "policy")
public class PolicyController {

    @Autowired
    OrderService orderService;

    /**
     * http://localhost:6000/policy/policy/getOrderNo
     *
     * @author  Sun
     * @date    2020/1/9 9:50
     * @return 模拟的订单号
     **/
    @GetMapping("/getOrderNo")
    public String getName() {
        OrderVo orderVo = orderService.getName("1234");
        return orderVo.getOrderNo();
    }


}
