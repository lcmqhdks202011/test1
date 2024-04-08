package org.practice.controller;

import org.practice.core.Dish;
import org.practice.entity.Item;
import org.practice.service.KitchenService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
public class ServerController {

    private final KitchenService kitchen;

    public ServerController(KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> serveDishes() {
        return this.kitchen.getDishes();
    }

    @GetMapping(value = "/served-dishes", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> deliverDishes() {
        return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));
    }

    @PostMapping(value = "/save-item")
    Flux<?> saveItem(@RequestBody Map<String, Object> item){
        Item i = new Item((String) item.get("name"), Double.parseDouble(item.get("price").toString()));

        return this.kitchen.save(i);
    }

}
