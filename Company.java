//Sample program for Upcasting and Downcasting
import java.io.*;
class Employee
{
 public void display()
 {
  System.out.println("I am an employee"); 
 }
 public void display1()
 {
  System.out.println("I am an employee1");
 }
}

class Manager extends Employee
{

 public void display()
 {
 super.display();
  System.out.println("I am an manager"); 
 }
 public void display2()
 {
  System.out.println("I am an manager2");
 }
}

public class Company
{
 public static void main(String args[])
 {
  Employee e=new Manager();
  e.display();
  e.display1();
  Manager m=new Manager();
  m.display();
  m.display2();
 Manager ma=(Manager)e;
 e.display();
  }
}
