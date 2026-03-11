package com.arun.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arun.ecommerce.entity.CartItem;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCartId(Long cartId);;
}