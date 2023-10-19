package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;

    private Phone phone;

    private final List<Menu> menu;

    private List<Order> order;

    public Restaurant(String name, Phone phone, Menu menu) {
        this.name = name;
        this.phone = phone;
        this.menu  = new ArrayList<>();
        this.menu.add(menu);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Menu getMenu(int  index) {

        return menu.get(index);
    }

    public void addMenu(Menu menu) {
        this.menu.add(menu);
    }

    public Order getOrder(int index) {
        return order.get(index);
    }

    public void addOrder(Order order) {
        this.order.add(order);
    }
}
