package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        System.out.println(orderSystem.getMenuMap());
        orderSystem.placeOrder();
    }
}