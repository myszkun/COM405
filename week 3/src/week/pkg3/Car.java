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
public class Car {

 private int currentSpeed =0;
 private int maxSpeed = 0;
 private int fuelLevel =0;

    public int getCurrentSpeed() {
        return currentSpeed;    
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void refuel(){
      fuelLevel = 100;
    }
    
    public void brake(int changeBy){
    currentSpeed=changeBy;
    }
    
    public void accelarete(int changeBy) {
     if(currentSpeed+changeBy<=maxSpeed) {
         currentSpeed+=changeBy;
     } 
     else 
     { 
        currentSpeed=maxSpeed;
     }
     fuelLevel+=changeBy;
    }
       
}