/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignpattern;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author localadmin
 */
public class StockBroker {
    private List<Order> orderList = new ArrayList<Order>();
    
    public void placeOrder(Order order){
        orderList.add(order);
    }
    public void executeOrders(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
