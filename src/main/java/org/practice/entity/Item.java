package org.practice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Item {


    private @Id String id;
    private String name;
    private double price;

    private Item( ){}

     public Item(String name, double price){

        this.name = name;
        this.price = price;

    }

}
