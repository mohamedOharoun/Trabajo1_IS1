package org.ulpgc.is1.model;

import java.util.List;
import java.util.ArrayList;

public class OrderManager {
    final private List<Customer> customers;
    final private List<Restaurant> restaurants;
    final private List<Dish> dishes;

    public OrderManager() {
        this.customers = new ArrayList<>();
        this.restaurants = new ArrayList<>();
        this.dishes = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city) {
        customers.add(new Customer(name, surname, street, number, postalCode, city));
    }

    public void addRestaurant(String name, Phone phone, Menu menu) {
        restaurants.add(new Restaurant(name, phone, menu));
    }

    public void addDish(String name, String description, int price) {
        dishes.add(new Dish(name, description, price));
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public Restaurant getRestaurant(int index) {
        return restaurants.get(index);
    }

    public Dish getDish(int index) {
        return dishes.get(index);
    }

    public void Order(int index, Order order) {
        getRestaurant(index).addOrder(order);
    }
}

