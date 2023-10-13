package org.ulpgc.is1.model;


import java.util.Arrays;
public class Restaurant {
    private String name;

    private Phone phone;

    private Menu[] menu;

    private Order[] order = new Order[0];

    public Restaurant(String name, Phone phone, Menu menu) {
        this.name = name;
        this.phone = phone;
        this.menu = new Menu[] {menu};
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

    public Menu[] getMenu() {
        return menu;
    }

    public void addMenu(Menu menu) {
        this.menu = Arrays.copyOf(this.menu, this.menu.length + 1);
        this.menu[this.menu.length - 1] = menu;
    }

    public Order[] getOrder() {
        return order;
    }

    public void addOrder(Order order) {
        this.order = Arrays.copyOf(this.order, this.order.length + 1);
        this.order[this.order.length - 1] = order;
    }
}
