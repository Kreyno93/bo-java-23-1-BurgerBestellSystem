package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {

    private Map<String, Menu> menuMap = new HashMap<>(
            Map.of(
                    "123", new Menu("123", "Currywurst", 4.50, "Currywurst", "Pommes", "Cola"),
                    "456", new Menu("456", "Döner", 3.50, "Döner", "Pommes", "Ayran"),
                    "789", new Menu("789", "Pizza", 5.50, "Pizza", "Salat", "Fanta")
            )
    );

    public OrderSystem() {
    }

    public Menu addMenu(Menu menu) {
        menuMap.put(menu.getId(), menu);
        return menuMap.get(menu.getId());
    }

    public Menu getOrderById(String id) throws OrderNotFoundException {
        if (!menuMap.containsKey(id)) {
            throw new OrderNotFoundException("Order with id " + id + " not found");
        }
        return menuMap.get(id);
    }

    public void placeOrder() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the id of the menu you want to order: ");
        String id = sc.nextLine();
        System.out.println("You have ordered: " +
                getOrderById(id).getMainDish() +
                " with " +
                getOrderById(id).getSideDish() +
                " and " +
                getOrderById(id).getBeverage() +
                " for " +
                getOrderById(id).getPrice()
                + "€");
    }

    public OrderSystem(Map<String, Menu> menuMap) {
        this.menuMap = menuMap;
    }

    public void setMenuMap(Map<String, Menu> menuMap) {
        this.menuMap = menuMap;
    }

    public Map<String, Menu> getMenuMap() {
        return menuMap;
    }

    @Override
    public String toString() {
        return "OrderSystem{" +
                "menuMap=" + menuMap +
                '}';
    }
}
