/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.basicdesigns;
import java.util.*;
/**
 *
 * @author Serebra
 */
public class CyclicShift {
    public static void arrayFill(int[][] a){
        int n = 1;
        for(int i=0; i<4; i++)
            for(int j=0; j<4; j++) {
            a[i][j] = n;
            n += 1;
            }
    }
    public static void printArray(int[][] a){
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++){
                System.out.print(a[i][j]);
                if(a[i][j]<10)
                    System.out.print("  ");
                else  
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void swap(int[][] a, int i0, int j0, int i1, int j1){
        int temp = a[i0][j0];
        a[i0][j0] = a[i1][j1];
        a[i1][j1] = temp;
    }
    public static void swapRows(int[][] a, int row0, int row1){
        int cols = a[0].length;
        for(int col=0; col<cols; col++)
            swap(a, row0, col, row1, col);
    }
    public static void swapCols(int[][] a, int col0, int col1) {
        int rows = a.length;
        for(int row=0; row<rows; row++)
            swap(a, row, col0, row, col1);
    }
    public static void main(String[] args) {
        int shArr[][]= new int[4][4];
        arrayFill(shArr);
        System.out.println("Here is my 2D array:");
        printArray(shArr); 
        System.out.println("select a namber of direction for scrolling array");
        System.out.println(" Up - 1; \n Down - 2 \n Right - 3 \n Left - 4");
        Scanner in = new Scanner(System.in);
        int direction = in.nextInt();
        switch(direction){
            case 1:
                System.out.println("Enter the number of scrollings of the array");
                Scanner in1 = new Scanner(System.in);
                int n1 = in1.nextInt(); 
                for(int i=n1; i>0; i--){//UP
                    swapRows(shArr, 0, 1);
                    swapRows(shArr, 1, 2);   
                    swapRows(shArr, 2, 3);
                }
                System.out.println();
                printArray(shArr);
                break;
            case 2:
                System.out.println("Enter the number of scrollings of the array");
                Scanner in2 = new Scanner(System.in);
                int n2 = in2.nextInt();
                for(int i=n2; i>0; i--){//Down  
                    swapRows(shArr, 3, 2);
                    swapRows(shArr, 2, 1);   
                    swapRows(shArr, 1, 0);
                }
                System.out.println();
                printArray(shArr);
                break;
            case 3:
                System.out.println("Enter the number of scrollings of the array");
                Scanner in3 = new Scanner(System.in);
                int n3 = in3.nextInt();
                for(int i=n3; i>0; i--){//Right
                    swapCols(shArr, 3, 2);
                    swapCols(shArr, 2, 1);   
                    swapCols(shArr, 1, 0);
                }
                System.out.println();
                printArray(shArr);
                break;
            case 4:
                System.out.println("Enter the number of scrollings of the array");
                Scanner in4 = new Scanner(System.in);
                int n4 = in4.nextInt();
                for(int i=n4; i>0; i--){//Left 
                    swapCols(shArr, 0, 1);
                    swapCols(shArr, 1, 2);   
                    swapCols(shArr, 2, 3);
                }
                System.out.println();
                printArray(shArr);
            default:
                System.out.println("You entered an incorrect number. Try again!");
        }    
    }
}
