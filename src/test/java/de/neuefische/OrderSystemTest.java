package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    Menu order1 = new Menu("1","Pizza",5.99,"Funghi", "Salad", "Coke");
    Map<String,Menu> testOrderMap = new HashMap<>(
            Map.of(
                    order1.getId(),order1
            )
    );

    OrderSystem testOrderDB = new OrderSystem(testOrderMap);

    @Test
    void whenGetOrderById_withNotValidId_thenThrowOrderNotFoundException(){

        try{
            testOrderDB.getOrderById("2");
            fail();
        } catch (OrderNotFoundException e){
            assertEquals("Order with id 2 not found",e.getMessage());
        }
    }

    @Test
    void whenGetOrderById_ReturnOrder(){
        Menu expected = order1;
        Menu actual = testOrderDB.getOrderById("1");
        assertEquals(expected,actual);
    }

    @Test
    void whenAddOrder_OrderGetsAddedAndReturned(){
        Menu order1 = new Menu("1","Pizza",5.99,"Funghi", "Salad", "Coke");
        OrderSystem testDB = new OrderSystem();

        Menu actual = testDB.addMenu(order1);

        assertEquals(order1, actual);
    }

}