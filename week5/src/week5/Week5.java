/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author 4lesnk72
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Bus b1 = new Bus();
     b1.addPassenger(new passenger(1, "meg", 28, 5.00));
      b1.addPassenger(new passenger(2, "meh", 25, 5.00));
      b1.addPassenger(new passenger(3, "met", 75, 5.00));
      
     if( b1.addPassenger(new passenger(4, "lala", 85, 5.00)));
     {
     System.out.println("Added");
     }
     else
     {
     System.out.println("Bus is full");
     }
     if(b1.removePassanger(4))
     {
     System.out.println("Bye");
     }
     else
     {
     System.out.println("Passenger not exist");
     }
     Passenger pass = b1.getPassenger(4);
     if(pass != null)
     {
     System.out.println("name: " + pass.getName());
     System.out.println("age: "+ pass.getAge());
     } 
     else
     {
     System.out.println("Passenger does not exist") ;       
     }
    }
    
}
