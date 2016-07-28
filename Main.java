//sample program for multilevel inheritance
import java.io.*;

class Vehicle
{
 public void vehicle()
 {
  System.out.println("I am Vehicle");
 }
}

class Cycle extends Vehicle
{
 public void cycle()
 {
 super.vehicle(); 
 System.out.println("I am cycle");
   
 }
 public void wheel()
 {
  System.out.println("I have 2 wheel");
 }
}

class Bsa extends Cycle
{
 public void Bsa()
 {
 System.out.println("I am Bsa");
 }
 public void wheel()
 {
 System.out.println("I have 2 wheel");
 }
}

public class Main
{
public static void main (String args[])
{
Vehicle v=new Vehicle();
Cycle c=new Cycle();
Bsa b=new Bsa();
b.vehicle();
b.cycle();
b.wheel();
}
}
