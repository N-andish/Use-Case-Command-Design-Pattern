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
public class Stock {
    private String stockName = "Google Share";
    private int stockQuantity = 20;
    
    public void buyStock(){
        System.out.println("Stock Name:" + stockName + " and Quantity: " + stockQuantity + "bought");
    }
    public void sellStock(){
        System.out.println("Stock Name: "+ stockName + ",and Quantity: " + stockQuantity + " sold ");
    }
}
