package com.example.pizzaOrder.controlers;

import com.example.pizzaOrder.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    PizzaService pizzaService;

    @Autowired
    public MainController(PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }
    @GetMapping("/menu")
    public String menu(Model model){
        model.addAttribute("menuList",pizzaService.getPizzaList());
        return "menu";
    }
    @RequestMapping("/basket")
        public String basket(Model model){
        model.addAttribute("basketList",pizzaService.getBasketList());
        return "Basket";
    }


    @RequestMapping(value = {"/","/home","/index"})
    public String getHome(){
        return "home";
    }
    @PostMapping("/add-pizza/{id}")
    public String addPizza(@PathVariable int id){
        pizzaService.basket.addPizzaToBasket(pizzaService.getPizzaList().get(id));
        return "redirect:/menu";
    }

    @PostMapping("/remove-pizza/{id}")
    public String removePizza(@PathVariable int id){
        System.out.println(id);
        pizzaService.removePizzaFromBasket(id);
        //System.out.println(pizzaService.getBasketList().indexOf(id));
        return "redirect:/basket";

    }


}
