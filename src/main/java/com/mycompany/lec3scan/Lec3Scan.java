/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lec3scan;
import java.util.Scanner; 

/**
 *
 * @author Hunter
 */
public class Lec3Scan {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    Scanner scan = new Scanner(System.in);
    
    //prompt user for data entries
    System.out.print("Enter Customer Name");
    String strCustomer = scan.nextLine();
    
     System.out.print("Enter Product name");
    String strProduct = scan.nextLine();
    
    System.out.print("Enter Address");
    String strAddress = scan.nextLine();
    
    //Code to print out delivery report
    System.out.println("DELIVERY REPORT");
     System.out.println("----------------");
      System.out.println("CUSTOMER:\t" + strCustomer);
        System.out.println("Product:\t" + strProduct);
          System.out.println("Address:\t" + strAddress);
   }
}