/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;
import java.util.Scanner;
/**
 *
 * @author 4lesnk72
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int state =0;
      int count = 10;
      while(count >=1)
      {
          System.out.println(count);
          count-=1;
      }
      for(int i = 10; i<=1; i--)
      {    
        System.out.println(i);  
      }
      do
      {
      System.out.println("a – Calculate the area of a rectangle");
      System.out.println("b – Display a multiplication table");
      System.out.println("c – Add two numbers");
      Scanner scanIn = new Scanner(System.in);

      String input = scanIn.nextLine();
if (input.equals("a")){
   System.out.println("width=1 hight=2"); 
}
if (input.equals("b")){
  System.out.println("width=5 hight=10");  
}
if (input.equals("c")){
 System.out.println("width=3 hight=4");  
}
else if (input.equals("x")){
  state =1;  
}       
    }while(state==0);
      for(int j = 1; j<=40; j++){
          
      for(int i = 1; i<=j; i++)
      {
     System.out.print("*"); 
    
      }
      System.out.println(""); 
      }
      System.out.println(""); 
      }
}
