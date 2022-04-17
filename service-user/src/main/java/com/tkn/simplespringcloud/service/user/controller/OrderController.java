/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.tkn.simplespringcloud.service.user.controller;

import com.tkn.simplespringcloud.service.order.common.Rest;
import com.tkn.simplespringcloud.service.order.model.Order;
import com.tkn.simplespringcloud.service.user.feign.OrderFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 *
 * @since:swagger-bootstrap-ui 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2019/05/04 11:26
 */
@Api(tags = "订单模块")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @ApiOperation(value = "查询订单列表")
    @PostMapping(value = "/list")
    public Rest<List<Order>> list(){
        return orderFeignClient.list();
    }

    @ApiOperation(value = "根据订单id查询订单详情")
    @GetMapping("/queryById")
    public Rest<Order> queryById(@RequestParam(value = "id") String id){
        return orderFeignClient.queryById(id);
    }





}
