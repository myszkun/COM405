/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author 4lesnk72
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int age = 25;
       String name = "kris";
   System.out.println(age);
   System.out.println("Hello world!");
   System.out.println("my name is kris");
   System.out.println("________");
   System.out.println("| o o |");
   System.out.println("| ----- | < Hello!" + name);
   System.out.println("------------ ");
   System.out.println("my name is " + name + " i am " + age + " years old");
   boolean isbirthday = true;
    System.out.println("you are " + age + " years old");
    if(isbirthday == true){
     age=age + 1; 
      System.out.println("It’s your birthday! Now you are " + age + " years old");
    }
    if(age>= 18){
       System.out.println("That means you’re old enough to drink!");
       
    }
    if(age>=20 || age<=39){
        
    }
    int speed = 65;
    int speedlimit = 50;
    if (speed>speedlimit){
     System.out.println(" You’re speed is " + speed +" the speed limit is " + speedlimit + " You’re Speeding! Ticket for you!");
    }
    else{
     System.out.println("Please continue to drive safely");  
    }
    if(speed>=speedlimit + 10){
        int exide = speed-speedlimit;
     System.out.println("you were going " + speed + " the limit is " + speedlimit +" you were exiding this by " + exide);
    }
    }
}
