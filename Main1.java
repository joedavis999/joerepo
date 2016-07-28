//sample program for abstract
import java.io.*;    
abstract class Bike
{  
 abstract public void colour();  
 void wheel()
 {
  System.out.println("I have 2 wheels");
 }   
}  
      
class Honda extends Bike
{  
 public void colour()
 {
 System.out.println("Colour is red");
 } 
} 
class Yamaha extends Bike
 {
  public void colour()
  {
   System.out.println("Colour is blue");
  }
 }
class Main1
{      
  public static void main(String args[])
 {  
     Bike b1=new Yamaha();
     Bike obj = new Honda();  
     obj.colour();
     obj.wheel();  
     b1.colour();
 }  
}  
