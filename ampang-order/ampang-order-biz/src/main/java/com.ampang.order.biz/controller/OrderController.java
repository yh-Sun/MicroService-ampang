package com.ampang.order.biz.controller;

import com.ampang.order.api.OrderService;
import com.ampang.order.api.OrderVo;
import com.nepxion.discovery.common.constant.DiscoveryConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "order")
@Api(value = "order", tags = "订单")
public class OrderController implements OrderService {

    /**
     * http://localhost:6000/order/order/1234
     *
     * @author  Sun
     * @date    2020/1/9 9:50
     * @param	policyNo: policy请求过来的参数
     * @return  模拟的订单对象
     **/
    @Override
    @GetMapping("{policyNo}")
    @ApiOperation(notes = "根据保单号查响应的订单信息", value = "订单详情查询", httpMethod = "GET")
    public OrderVo getName(@PathVariable("policyNo") String policyNo) {
        System.out.println(policyNo);
        OrderVo orderVo = new OrderVo();
        orderVo.setPolicyNo(policyNo);
        orderVo.setOrderNo("O1000000020200108210301");
        orderVo.setTime("孙大帅");
        return orderVo;
    }

}
