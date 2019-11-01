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
public class buss
{
   private passenger[] seats;
   public buss()
        {
           seats = new passenger[15];
        }
   public boolean addPassenger(passenger pass)
   {
       for(int i=0; i<seats.length; i++)
       {
           if(seats[i] ==null)
           {
               seats[i] = pass;
               return true;
           }
       }
       return false;
   }
   public boolean removePassenger(int id)
    {
     for(int i=0; i<seats.length; i++)
     {
      if(seats[i] ==null)
      {
          if(seats[i].getId() == id)
          {
              seats[i] = null;
              return true;
          }
      }   
     }
     return false;
    }
    public passenger getPassenger(int id)
    {
      for(int i=0; i<seats.length; i++)
      {
       if(seats[i].getId() == id) 
       {
           return seats[i];
       }  
      }  
        return null;
    }

    }

