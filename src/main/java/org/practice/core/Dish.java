package org.practice.core;

public class Dish {

    private String description;
    private boolean delivered = false;

    public Dish(String description) {
        this.description = description;
    }

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    public String getDescription(){
        return  description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean isDelivered() {
        return delivered;
    }
}
