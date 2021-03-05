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
public class Dricka extends Automat implements Handla {
     //Take parameter from base class 
    public Dricka (int productid, String name, String description, int cost){
         //Call constructor from base class
         super (productid, name, description, cost);
    }

    //Implements method from interface class    
    //This method must be included in the Class because implementation is unique to this class
    @Override
    public String Use() {        
         return "Product for drinking. Drink it and enjoy!";
    }

    @Override
    public void Buy() {
        System.out.println("Drink product sold!");
    }
}
       
        
        
    
    
 
