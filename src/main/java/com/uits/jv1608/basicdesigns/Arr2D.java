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
public class Arr2D {
    public static void main(String args[]) {
        int twoD[][]=new int[4][5];
        for(int i=0; i<4; i++)
            for(int j=0; j<5; j++) {
            twoD[i][j] = (int)(Math.random()*10);
            }
        System.out.println("Here is my random 2D array in forward order:");
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
        System.out.println("Here is my 2D array in reverse order:");
        for(int i=3; i>=0; i--) {
            for(int j=4; j>=0; j--)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
        System.out.println("Here is all even elements from even rows:");
         for(int i=0; i<4; i+=2) {
            for(int j=0; j<5; j++) {
                if(twoD[i][j]%2!=0) continue;
                System.out.print(twoD[i][j] + " ");
            }    
        }
         System.out.println();
         System.out.println("Here is all odd elements from odd columns:");
         for(int i=0; i<4; i++) {
            for(int j=1; j<5; j+=2) {
                if(twoD[i][j]%2==0) continue;
                System.out.print(twoD[i][j] + " ");
            }    
        }
         System.out.println();
         System.out.println("Here is a sum of all multiples of 7 elements in even rows:");
         int sumMult7 = 0;
         for(int i=0; i<4; i+=2) {
            for(int j=0; j<5; j++) {
                if(twoD[i][j]%7!=0) continue;
                sumMult7 += twoD[i][j];   
            }        
        }
        System.out.println(sumMult7); 
        
        System.out.println("Here is a multiplication of all multiples of 3 elements in odd rows:");
        int multMult3 = 1;
        for(int i=1; i<4; i+=2) {
            for(int j=0; j<5; j++) {
                if((twoD[i][j])%3!=0) continue;
                multMult3 *= twoD[i][j];  
            }                            
        }
        System.out.println(multMult3);
        System.out.println("! When '0' is present in the odd row the multiplication result is '0'.");
    }
}
