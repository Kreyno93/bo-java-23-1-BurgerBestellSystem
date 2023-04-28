package de.neuefische;

import java.math.BigDecimal;
import java.util.Objects;

public class Menu {

    private String id;
    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;


    public Menu(String id, String name, double price, String mainDish, String sideDish, String beverage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(name, menu.name) && Objects.equals(price, menu.price) && Objects.equals(mainDish, menu.mainDish) && Objects.equals(sideDish, menu.sideDish) && Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, mainDish, sideDish, beverage);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }
}
