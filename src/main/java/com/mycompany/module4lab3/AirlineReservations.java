/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module4lab3;

import java.util.Scanner;

/**
 *
 * @author behlt
 */
public class AirlineReservations {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10];  
        for(int i =0; i < seats.length; i++){
            seats[i] = false;
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please type 1 for First Class");
        System.out.println("Please type 2 for Economy");
        int response = 0; 
        
        if(response == 1){
            System.out.println("First Class  " );
            
        }
        
            
    }
    
}
