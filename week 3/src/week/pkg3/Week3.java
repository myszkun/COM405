/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3;

/**
 *
 * @author 4lesnk72
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car car1 = new Car();
        Car car2 = new Car();
       car1.setMaxSpeed(100) ;
       car1.setCurrentSpeed(5);
        System.out.println("car1 current speed="+car1.getCurrentSpeed());
        car1.setFuelLevel(60);
        System.out.println("car1 fuelLevel="+car1.getFuelLevel());
    }

    
    
}

