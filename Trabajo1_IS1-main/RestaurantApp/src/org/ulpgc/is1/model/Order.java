package org.ulpgc.is1.model;


import java.util.Arrays;
public class Order {
    private Restaurant restaurant;
    private static int NEXT_ID = 0;
    private final int id;

    private OrderItem[] orderitem = new OrderItem[0];

    private Customer customer;


    public Order(Restaurant restaurant, Customer customer) {
        this.restaurant = restaurant;
        this.id = NEXT_ID++;
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }



    public int getId() {
        return id;
    }

    public OrderItem[] getOrderitem() {
        return orderitem;
    }

    public void addOrderItem(int quantity, Dish dish) {
        this.orderitem = Arrays.copyOf(this.orderitem, this.orderitem.length + 1 );
        this.orderitem[this.orderitem.length - 1] = new OrderItem(quantity, dish);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int price() {
        int price = 0;
        for (int i = 0; i < this.orderitem.length; i++) {
            price += orderitem[i].getQuantity()*  orderitem[i].getDish().getPrice();
        }
        return price;
    }
}
