package com.arun.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arun.ecommerce.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}