/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignpattern;

/**
 *
 * @author localadmin
 */
public class CommandDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock stock = new Stock();
        
        BuyOrder buyOrder = new BuyOrder(stock);
        SellOrder sellOrder = new SellOrder(stock);
        
        StockBroker stockBroker = new StockBroker();
        stockBroker.placeOrder(buyOrder);
        stockBroker.placeOrder(sellOrder);
        
        stockBroker.executeOrders();
                ;
        
        // TODO code application logic here
    }
    
}
