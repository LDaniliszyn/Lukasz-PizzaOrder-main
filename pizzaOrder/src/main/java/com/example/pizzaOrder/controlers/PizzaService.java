package com.example.pizzaOrder.controlers;

import com.example.pizzaOrder.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    Basket basket;
    @Autowired
    public PizzaService(Basket basket){
        this.basket = basket;
    }
    public List<Pizza> getBasketList(){
        return basket.getClientBasket();
    }
    public void removePizzaFromBasket(int id){
        Pizza element = getElement(id);
        getBasketList().remove(element);

    }
    public Pizza getElement(int id) {
        Optional<Pizza> pizza = basket.getClientBasket().stream().filter(element -> element.getId() == id).findFirst();
        if (pizza.isPresent()){
            return pizza.get();
        }
        System.out.println("pizza not found");
        return null;
    }

    public List<Pizza> getPizzaList(){
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza(0,"Prosciutto e funghi","z sosem pomidorowym, oliwą extra virgin, pieczarkami, pomidorami i bazylią",20,"pizza1"));
        pizzaList.add(new Pizza(1,"Capricciosa","z sosem pomidorowym, oliwą extra virgin, serem grana padano d.o.p, oliwkami, salami i bazylią",28,"pizza2"));
        pizzaList.add(new Pizza(2,"Diavola","z sosem pomidorowym, oliwą extra virgin i salami",22,"pizza3"));
        pizzaList.add(new Pizza(3,"Italia","z sosem pomidorowym, oliwą extra virgin, oliwkami, papryką pepperoni i salami",24,"pizza4"));
        pizzaList.add(new Pizza(4,"Max","z sosem pomidorowym, oliwą extra virgin, serem grana padano d.o.p, mozzarellą fior di latte, pieczarkami, pomidorem, oliwkami i bazylią",32,"pizza5"));
        return pizzaList;
    }
}
