package com.tkn.simplespringcloud.service.user.feign;

import com.google.common.collect.Lists;
import com.tkn.simplespringcloud.service.order.common.Rest;
import com.tkn.simplespringcloud.service.order.model.Order;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description: 调用订单客户端接口
 * @author: lz
 * @time: 2022/4/15 22:04
 */
@FeignClient("service-order")
public interface OrderFeignClient {

    @PostMapping("/user/list")
    Rest<List<Order>> list();

    @GetMapping("/user/queryById")
     Rest<Order> queryById(@RequestParam(value = "id") String id);
}
