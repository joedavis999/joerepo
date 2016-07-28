//sample program for interface
import java.io.*;    
interface Bike
{  
  public void colour();  
  public void wheel();  
}  
      
class Honda implements Bike
{  
 public void colour()
 {
 System.out.println("Colour is red");
 } 
 public void wheel()
 {
  System.out.println("I have 2 wheels");
 } 
} 
class Yamaha implements Bike
 {
  public void colour()
  {
   System.out.println("Colour is blue");
  }
  public void wheel()
 {
  System.out.println("I have 2 wheels");
 } 
 }
class Main2
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
