package com.example.pizzaOrder;

import com.example.pizzaOrder.controlers.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Basket {
    private List<Pizza> clientBasket;
    private double totalPrice;

    public Basket() {
        clientBasket = new ArrayList<>();
        totalPrice = 0;
    }

    public void addPizzaToBasket(Pizza pizza) {
        clientBasket.add(pizza);
        totalPrice += pizza.getPrice();
    }

    public void clearBasket() {
        totalPrice = 0;
        clientBasket.clear();
    }

    public List<Pizza> getClientBasket() {
        return clientBasket;
    }

    public void setClientBasket(List<Pizza> clientBasket) {
        this.clientBasket = clientBasket;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "clientBasket=" + clientBasket +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
