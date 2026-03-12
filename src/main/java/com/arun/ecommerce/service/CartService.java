package com.arun.ecommerce.service;


import com.arun.ecommerce.entity.Cart;
import com.arun.ecommerce.entity.CartItem;
import com.arun.ecommerce.entity.Product;
import com.arun.ecommerce.repository.CartItemRepository;
import com.arun.ecommerce.repository.CartRepository;
import com.arun.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;

    public CartService(CartRepository cartRepository,
                       CartItemRepository cartItemRepository,
                       ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.productRepository = productRepository;
    }

    public CartItem addToCart(Long cartId, Long productId, int quantity) {

        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);

        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getCartItems(Long cartId) {

        return cartItemRepository.findByCartId(cartId);

    }

    public void removeCartItem(Long cartItemId) {

        cartItemRepository.deleteById(cartItemId);

    }
}
