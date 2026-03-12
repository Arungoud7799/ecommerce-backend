package com.arun.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arun.ecommerce.entity.CartItem;
import com.arun.ecommerce.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public CartItem addToCart(@RequestParam Long cartId,
                              @RequestParam Long productId,
                              @RequestParam int quantity) {

        return cartService.addToCart(cartId, productId, quantity);
    }

    @GetMapping("/{cartId}")
    public List<CartItem> getCartItems(@PathVariable Long cartId) {

        return cartService.getCartItems(cartId);

    }

    @DeleteMapping("/item/{cartItemId}")
    public void removeCartItem(@PathVariable Long cartItemId) {

        cartService.removeCartItem(cartItemId);

    }
}