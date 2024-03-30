
package com.mycompany.exception;


public class arrayIndex {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            System.out.println("Result : " +arr[6]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
