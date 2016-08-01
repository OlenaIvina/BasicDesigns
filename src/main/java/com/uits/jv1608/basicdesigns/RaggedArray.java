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
public class RaggedArray {
    public static void main(String[] args) {
        int ragArr[][] = new int[5][];
        ragArr[0] = new int[1];
        ragArr[1] = new int[2];
        ragArr[2] = new int[3];
        ragArr[3] = new int[4];
        ragArr[4] = new int[5];
        for(int i=0; i<ragArr.length; i++){
            for(int j=0; j<ragArr[i].length; j++){
                ragArr[i][j] = 1;
            }
        }
        System.out.println("Here is our ragged array");
        for(int i=0; i<ragArr.length; i++){
            for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Lets reflect our array over a horizontal");
        
        for(int i=ragArr.length-1; i>=0; i--){
            for(int j=ragArr[i].length-1; j>=0; j--){
                System.out.print(ragArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Now we are gonna reflect our array over a vertical");
        for(int i=0; i<ragArr.length; i++){
            if(i==0){
                System.out.print("        ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }    
            }    
            else if(i==1){
                System.out.println(); 
                System.out.print("      ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
            else if(i==2){
                System.out.println(); 
                System.out.print("    ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
            else if(i==3){
                System.out.println(); 
                System.out.print("  ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }    
            else if(i==4){
                System.out.println(); 
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
        }
        System.out.println();
        System.out.print("And now we are gonna reflect our array over a coordinate center");
        for(int i=ragArr.length-1; i>=0; i--){ //(int i=ragArr.length-1; i>=0; i--)
            if(i==0){
                System.out.println();
                System.out.print("        ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }
                System.out.println();
            }    
            else if(i==1){
                System.out.println(); 
                System.out.print("      ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
            else if(i==2){
                System.out.println(); 
                System.out.print("    ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
            else if(i==3){
                System.out.println(); 
                System.out.print("  ");
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }    
            else if(i==4){
                System.out.println(); 
                for(int j=0; j<ragArr[i].length; j++){
                System.out.print(ragArr[i][j] + " ");
                }     
            }
              
        }
            
    }
}
