/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatbutik;

/**
 *
 * @author Pooja
 */
abstract public class Automat {
    //Attributs
    public int productid;
    public String name;
    public String description;
    public int cost;
    
    public Automat(int productid, String name, String description, int cost ) {
        //Constructor
        this.productid = productid;
        this.name = name;
        this.description = description;
        this.cost = cost;
        }
        
        //All inherit class has access of following methods
        //Create method to use productid 
        public int GetProductId(){
        return productid;
        }
                        
        
        //If any inherit class has unique attribute only in that case need to override method to that perticular class
        public void Description() {
        System.out.println("Product id:" + this.productid + ", Product name:" + this.name + ", Description:" + this.description + ", Cost:" + this.cost);
        }      
                 
}