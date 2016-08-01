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
import java.util.*;
public class NamberName {
     public static void unitsPrint(int u){
        switch(u){
            case 0:
                System.out.println("Your number is \"Zero\"");
                break;
            case 1:
                System.out.println("Your number is \"One\"");
                break;
            case 2:
                System.out.println("Your number is \"Two\"");
                break;
            case 3:
                System.out.println("Your number is \"Three\"");
                break;
            case 4:
                System.out.println("Your number is \"Four\"");
                break;
            case 5:
                System.out.println("Your number is \"Five\"");
                break;
            case 6:
                System.out.println("Your number is \"Six\"");
                break;
            case 7:
                System.out.println("Your number is \"Seven\"");
                break;
            case 8:
                System.out.println("Your number is \"Eight\"");
                break;
            case 9:
                System.out.println("Your number is \"Nine\"");
                break;
            case 10:
                System.out.println("Your number is \"Ten\"");
                break;
        }    
    }
    public static void tensPrint(int t){
        switch(t){
            case 0:
                System.out.println("Your number is \"Zero\"");
            case 20:
                System.out.print("Your number is Twenty ");
                break;
            case 30:
                System.out.print("Your number is Thirty ");
                break;
            case 40:
                System.out.print("Your number is Forty ");
                break;
            case 50:
                System.out.print("Your number is Fifty ");
                break;
            case 60:
                System.out.print("Your number is Sixty ");
                break;
            case 70:
                System.out.print("Your number is Seventy ");
                break;
            case 80:
                System.out.print("Your number is Eighty ");
                break;
            case 90:
                System.out.print("Your number is Ninety ");
                break;
        }    
    }
    public static void endTinPrint(int e){
        switch(e){
            case 11:
                System.out.println("Your number is \"Eleven\"");
                break;
            case 12:
                System.out.println("Your number is \"Twelve\"");
                break;
            case 13:
                System.out.println("Your number is \"Thirteen\"");
                break;
            case 14:
                System.out.println("Your number is \"Fourteen\"");
                break;
            case 15:
                System.out.println("Your number is \"Fifteen\"");
                break;
            case 16:
                System.out.println("Your number is \"Sixteen\"");
                break;
            case 17:
                System.out.println("Your number is \"Seventeen\"");
                break;
            case 18:
                System.out.println("Your number is \"Eighteen\"");
                break;
            case 19:
                System.out.println("Your number is \"Nineteen\"");
                break;
        }
    }
    public static void endsPrint(int end){
        switch(end){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }     
    public static void main(String[] args) {
        int tens;
        int units;
        System.out.println("Select a number from 0 to 99");
        Scanner in = new Scanner(System.in);
        int namber = in.nextInt();
        if(namber<=10)
            unitsPrint(namber);
        else if(namber<20)
            endTinPrint(namber);    
        else if(namber%10 == 0)
            tensPrint(namber);
        else if(namber>10 & namber%10 != 0 & namber<100){
            tens = (namber - (namber%10));
            units = namber%10;
            tensPrint(tens);
            endsPrint(units);
            }
        else
            System.out.println("You entered an incorrect number. Try again!");              
    }
}
