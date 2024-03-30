
package com.mycompany.exception;

import java.util.Scanner;


public class Arithmetic_exception {
    public static void main(String[] args) {
        
       try{
           int a , b;
           Scanner input = new Scanner(System.in);
           System.out.println("Enter first number : ");
           a = input.nextInt();
           System.out.println("Enter second number : ");
           b = input.nextInt();
            int c = a/b;
            System.out.println(c);
       }
       catch(Exception ex)
       {
           System.out.println(ex);
       }
        
    }
}
