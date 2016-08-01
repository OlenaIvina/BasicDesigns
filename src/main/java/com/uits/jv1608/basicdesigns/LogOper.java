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
public class LogOper {
    public static void main(String[] args) {
        int seqSum2=0;
        System.out.println("Here are all the numbers divisible by 2");
        System.out.println("in the sequence of numbers from 0 to 100");
        for(int x=0; x<=100; x++){
            if(x%2==0){
                System.out.print(x + " ");
                seqSum2 += x;
            }
        }
        System.out.println();
        System.out.println("The is sum of numbers that multiples of 2  = " + seqSum2);
        System.out.println(" ");
        
        double seqSum3=0;
        System.out.println("Here are all the numbers divisible by 3");
        for(int x=0; x<=100; x++){
            if(x%3==0){
                System.out.print(x + " ");
                seqSum3 += x;
            }
        }
        System.out.println();
        System.out.println("The is sum of numbers that multiples of 3 = " + seqSum3);
        System.out.println(" ");
        
        double seqSum5=0;
        System.out.println("Here are all the numbers divisible by 5");
        for(int x=0; x<=100; x++){
            if(x%5==0){
                System.out.print(x + " ");
                seqSum5 += x;
            }
        }
        System.out.println();
        System.out.println("The is sum of numbers that multiples of 5 = " + seqSum5);
        System.out.println(" ");
                
        System.out.println("Here are all the numbers divisible by 7");
        int seqSum7=0;
        for(int x=0; x<=100; x++){
            if(x%7==0){
                System.out.print(x + " ");
                seqSum7 += x;
            }
        }
        System.out.println();
        System.out.println("The is sum of numbers that multiples of 7 = " + seqSum7);
        System.out.println(" ");
        
        int seqDif7and2;
        double seqDiv5and3;
        seqDif7and2 = seqSum7-seqSum2;
        System.out.println("The is the difference between the sum" );
        System.out.println("of the sequence of numbers that multiple of 7 and 2 = " + seqDif7and2);
        seqDiv5and3 = seqSum5/seqSum3;
        System.out.println("The ratio of the sequence of numbers that multiple of 5 and 3 = " + seqDiv5and3);
    }
}
