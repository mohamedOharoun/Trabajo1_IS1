package org.ulpgc.is1.model;


import java.util.Arrays;
public class Menu {
    private String name;
    private  Dish[] dishes = new Dish[0];

    private MenuType menuType;

    public Menu(String name, MenuType menuType) {
        this.name = name;
        this.menuType = menuType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void addDish(Dish dishes) {
        this.dishes = Arrays.copyOf(this.dishes, this.dishes.length + 1);
        this.dishes[this.dishes.length - 1] = dishes;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }
}
