
package com.mycompany.exception;

import java.util.Scanner;


public class NullPointer_Exception {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.charAt(0));
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
