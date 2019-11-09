/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;
import java.util.*;
/**
 *
 * @author up824217
 */
public class OrderManager {
    
    public ArrayList<Order> orderList;
    
    public OrderManager() {
        orderList = new ArrayList<>();
    }
    
    public void addOrder(Pipe pipe, int amount) {
        Order order = new Order(pipe, amount);
        orderList.add(order);
    }
    
    public double calculateAll() {
        orderList.stream().forEach((_item) -> {
            System.out.println("test");
        });
        return 1;
    }
    
}
