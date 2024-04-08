package org.practice.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cart {

    private @Id String id;

    private List<CartItem> cartItems;

    private Cart() {

    }

    public Cart(String id, List<CartItem> cartItems) {
        this.id = id;
        this.cartItems = cartItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
