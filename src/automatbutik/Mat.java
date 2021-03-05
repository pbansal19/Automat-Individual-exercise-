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
public class Mat extends Automat implements Handla {
    //Attribute
    
    //Take parameter from base class 
    public Mat(int productid, String name, String description, int cost ){
            //Call constructor from base class
            super(productid, name, description, cost);
         
    }

    
    //Implements method from interface class    
    //This method must be included in the Class because implementation is unique to this class
    @Override
    public String Use() {              
        return "Product is to eat. Have it and Enjoy!";
    }      

    @Override
    public void Buy() {
        System.out.println("Food product sold!");
    }
}
    
      
 
