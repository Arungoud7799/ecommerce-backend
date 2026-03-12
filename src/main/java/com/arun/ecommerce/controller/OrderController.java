package com.arun.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arun.ecommerce.entity.Order;
import com.arun.ecommerce.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/user/{userId}")
    public List<Order> getUserOrders(@PathVariable Long userId) {

        return orderService.getOrdersByUser(userId);
    }
}