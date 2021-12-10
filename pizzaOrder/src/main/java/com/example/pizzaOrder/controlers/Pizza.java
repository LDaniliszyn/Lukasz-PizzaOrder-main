package com.example.pizzaOrder.controlers;


public class Pizza {
    private int id;
    private String name;
    private String ingredients;
    private double price;
    private String image;
    // todo interfejs, enum, daty, git, html, css, bootstrap


    public Pizza(){

    }
    public Pizza(int id,String name,String ingredients,double price,String image){
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients='" + ingredients + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
