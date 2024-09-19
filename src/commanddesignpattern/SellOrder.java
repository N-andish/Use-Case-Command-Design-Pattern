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
public class SellOrder implements Order {
    private Stock stock;
    
    public SellOrder(Stock stock){
        this.stock = stock;
    }

    
    public void execute(){
        stock.sellStock();
    }
    
}
