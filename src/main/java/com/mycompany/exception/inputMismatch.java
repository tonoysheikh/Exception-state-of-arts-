
package com.mycompany.exception;

import java.util.Scanner;


public class inputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter your name : ");
            int val = sc.nextInt();
            
            System.out.println(val);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
