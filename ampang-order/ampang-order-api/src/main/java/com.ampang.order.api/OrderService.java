package com.ampang.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(contextId = "orderService", value = "order")
public interface OrderService {

    @GetMapping("/order/{policyNo}")
    OrderVo getName(@PathVariable("policyNo") String policyNo);

}
