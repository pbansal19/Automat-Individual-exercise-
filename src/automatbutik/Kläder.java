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
public class Kläder extends Automat implements Handla {
    
    //Attribute    
    public String color;
    //Take parameter from Automat(base)class as well as has its own attribute
    public Kläder (int productid, String name, String description, int cost, String color){
        //Call constructor from base class        
        super (productid, name, description, cost);
        //Constructor
        this.color = color;
        }

   
    //This method is override from base class
    //It contains unique discribtion as color attribute, so overrride here
    @Override
    public void Description() {
        System.out.println("Product id:" + this.productid + ", Product name:" + this.name + ", Description:" + this.description + ", Cost:" + this.cost + ", Color:" + this.color);
    }

    
    //Implement both methods from interface class    
    //These methods must be included in the Class because implementation is unique to this class
    @Override
    public String Use() {
        return "Product to wear on. Enjoy!";
    }

    @Override
    public void Buy() {
       System.out.println("Cloth product sold!");
    }
}  
           
     
