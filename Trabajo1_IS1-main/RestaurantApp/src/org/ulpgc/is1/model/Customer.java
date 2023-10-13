package org.ulpgc.is1.model;


import java.util.Arrays;
public class Customer {
    private String name;
    private String surname;
    private Order[] order = new Order[0];

    private Address address;


    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Order[] getOrder() {
        return order;
    }

    public void addOrder(Order order) {
        this.order = Arrays.copyOf(this.order, this.order.length + 1);
        this.order[this.order.length - 1] = order;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String surname, String street, int number, int postalCode, String city) {
        this.address = new Address(street, number, postalCode, city);
    }
}
