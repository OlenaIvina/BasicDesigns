/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.basicdesigns;

/**
 *
 * @author Serebra
 */
public class Arr1D {
    public static void main(String args[]) {
        int [] myArray = new int[10];
        for(int i=0; i<myArray.length; i++) {
           myArray[i] = (int)(Math.random()*10); 
        }
        System.out.println("Here is my random array in forward order:");
        for(int i=0;i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        System.out.println("Here is my array in reverse order:");
        for(int i=9;i>=0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        System.out.println("Here is all even elements from my array:");
        for(int i=0;i<myArray.length; i++) {
            if(myArray[i]%2!=0) continue;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        System.out.println("Here is all odd elements from my array:");
        for(int i=0;i<myArray.length; i++) {
            if(myArray[i]%2==0) continue;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        int sumMult7=0;
        for(int i=0;i<myArray.length; i++) {
            if(myArray[i]%7==0) 
                sumMult7 += myArray[i];
        }
        System.out.println("The sum of multiples of 7 = " + sumMult7);
        
        int multMult3=0;
        for(int i=0;i<myArray.length; i++) {
            if(myArray[i]%3==0) 
                multMult3 *= myArray[i];
        }
        System.out.println("Result of multiplying numbers of multiples of 3 = " + multMult3);
    }
}
