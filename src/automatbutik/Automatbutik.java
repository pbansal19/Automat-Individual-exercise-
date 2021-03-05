/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatbutik;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pooja
 */
public class Automatbutik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a local ArrayList for the Kläder class
        ArrayList<Kläder> listOfClothes = new ArrayList<>();
        //Fill ArrayList with object
        listOfClothes.add(new Kläder(111,"Shirt","Medium",100,"White"));
        listOfClothes.add(new Kläder(112,"T-shirt","small",80,"Blue"));
        listOfClothes.add(new Kläder(113,"Jeans","Medium",120,"Black"));
        
        //Create a local ArrayList for the Dricka class
        ArrayList<Dricka> listOfDrinks = new ArrayList<>();
        //Fill ArrayList with object
        listOfDrinks.add(new Dricka(221,"Pepsi","1Litre",20));
        listOfDrinks.add(new Dricka(222,"Fanta","750ml",15));
        listOfDrinks.add(new Dricka(223,"Coca Cola ","500ml",10));  
           
        //Create a local ArrayList for the Mat class
        ArrayList<Mat> listOfFood = new ArrayList<>();
        //Fill ArrayList with object
        listOfFood.add(new Mat(331,"Cheesy doodle","225g",10)); 
        listOfFood.add(new Mat(332,"Lays","400g",15)); 
        listOfFood.add(new Mat(333,"Popcorn","225g",10)); 
     
        //Create a scaaner object. That use in diffrent places as requirment
        Scanner scan = new Scanner(System.in);
        
        //Create a while loop for providing an option to come back in product menu
        while(true){
            
            System.out.println("Press 1 to see product and press any other number to exit");
            int userchoice = scan.nextInt();
            if (userchoice == 1)
            {
        //Function to choose category of product       
        System.out.println("1-Clothes, 2-Drink, 3-Food");
        System.out.println("Please choose product category: ");
        //Enter console value to choose product category
        
        int category = scan.nextInt();
        //SwithCase for product category1+
        switch(category){
        case 1 -> {
           //Create a for loop in order to provide clothes product list and its detail
           for (Kläder i: listOfClothes) {
            i.Description(); }
            System.out.println("Choose a Productid of your product: ");
            //Enter your choice as productid
            int category1 = scan.nextInt();
            boolean t = false;           
            for (Kläder i: listOfClothes) {
                 //If enter right productid so apply Use funktion
                 if(i.GetProductId() == category1)
                 {System.out.println(i.Use()); 
                 //User can enter choice to buy product or not
                 System.out.println("Do you want to buy the product: Y/N");
                 String userbuy = scan.next();
                    //If user choice yes. User will get product
                     if ("y".equals(userbuy) || "Y".equals(userbuy))
                     i.Buy();
                     else if ("n".equals(userbuy) || "N".equals(userbuy))
                         System.out.println("Ok, Hope you will come again!");
                     else
                     break;
                 t = true;
                 break;
                }                
            }
               //If enter wrong productid so get error message
                if (t == false) 
                System.out.println("Sorry! somthing went wrong. Please try again!");
        }                        
            
        case 2 -> {
         //Create a for loop in order to provide drink product list and its detail        
         for (Dricka i: listOfDrinks) {
         i.Description(); } 
         System.out.println("Choose a Productid of your product:" );
         //Enter your choice as productid
         int category2 = scan.nextInt();
         boolean t = false;
         for (Dricka i: listOfDrinks) { 
             //If enter right productid so apply Use funktion
             if(i.GetProductId() == category2)
             {System.out.println(i.Use()); 
                 //User can enter choice to buy product or not
                 System.out.println("Do you want to buy the product: Y/N");
                 String userbuy = scan.next();
                    //If user choice yes. User will get product
                     if ("y".equals(userbuy) || "Y".equals(userbuy))
                     i.Buy();
                     else if ("n".equals(userbuy) || "N".equals(userbuy))
                         System.out.println("Ok, Hope you will come again!");
                     else
                     break;
                 t = true;
                 break;
                }                
            }
               //If enter wrong productid so get error message
                if (t == false) 
                System.out.println("Sorry! somthing went wrong. Please try again!");
        }                        
            
               
        case 3 -> {
         //Create a for loop in order to provide food product list and its detail        
         for (Mat i: listOfFood) {
         i.Description(); } 
         System.out.println("Choose a Productid of your product:" );
         //Enter your choice as productid
         int category3 = scan.nextInt();
         boolean t = false;
         for (Mat i: listOfFood) { 
             //If enter right productid so apply Use funktion
             if(i.GetProductId() == category3)
             {System.out.println(i.Use()); 
                 //User can enter choice to buy product or not
                 System.out.println("Do you want to buy the product: Y/N");
                 String userbuy = scan.next();
                    //If user choice yes. User will get product
                     if ("y".equals(userbuy) || "Y".equals(userbuy))
                     i.Buy();
                     else if ("n".equals(userbuy) || "N".equals(userbuy))
                         System.out.println("Ok, Hope you will come again!");
                     else 
                     break;
                 t = true;
                 break;
                }                
            }
               //If enter wrong productid so get error message
                if (t == false) 
                System.out.println("Sorry! somthing went wrong. Please try again!");
        }                           
              
        default ->  {
        System.out.println("You have chosen wrong value");
        break;               
        }
        }
            }
            else {
                System.out.println("You are Exit from program. Welcome back!");
                break;}
        }
    }
}
  
