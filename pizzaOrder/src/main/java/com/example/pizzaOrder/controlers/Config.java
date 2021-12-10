package com.example.pizzaOrder.controlers;

import com.example.pizzaOrder.Basket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class Config {
    @Bean
    @SessionScope
    public Basket getBasket(){
        return new Basket();
    }

}
