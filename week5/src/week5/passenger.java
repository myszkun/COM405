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
public class passenger 
    {
     private int id;
     private String name;
     private int age;
     private double farePaid;
     
     public passenger(int idIn, String nameIn, int ageIn, double fareIn)
     {
         id = idIn;
         name = nameIn;
         age = ageIn;
         farePaid = fareIn;
     }
    
    public int getId()
            {
            return id; 
            }
    public String getName()
            {
                return name;
            }
    public int getAge()
            {
                return age;
            }
    public double getfarePaid()
            {
        return farePaid;
        }
    }

    