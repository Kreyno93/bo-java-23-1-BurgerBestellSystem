package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderSystem orderSystem = new OrderSystem();
        System.out.println(orderSystem.getMenuMap());
        System.out.println("Please enter the id of the menu you want to order: ");
        String id = sc.nextLine();
        orderSystem.placeOrder(id);
        try{
            System.out.println(orderSystem.getOrderById(id));
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}