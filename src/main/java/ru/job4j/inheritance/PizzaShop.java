package ru.job4j.inheritance;

public class PizzaShop {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("Carbonara");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("Pepperony");

        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
