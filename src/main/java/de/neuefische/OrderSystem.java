package de.neuefische;

import java.util.HashMap;
import java.util.Map;

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

    public void addMenu(Menu menu) {
        menuMap.put(menu.getId(), menu);
    }

    public Menu getOrderById(String id) throws OrderNotFoundException {
        if (!menuMap.containsKey(id)) {
            throw new OrderNotFoundException("Order with id " + id + " not found");
        }
        return menuMap.get(id);
    }

    public void placeOrder(String id) {
        try {
            Menu menu = menuMap.get(id);
            System.out.println("You ordered: " + menu.getName() + " for " + menu.getPrice() + "€");
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }

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
