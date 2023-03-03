/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module4lab3;

/**
 *
 * @author behlt
 */
import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Please type 1 for First Class and 2 for Economy:");
            int choice = scanner.nextInt();

            if (choice == 1) { 
                int seat = assignSeat(seats, 0, 4);
                if (seat != -1) {
                    printBoardingPass("First Class", seat);
                } else if (canUpgrade(seats, 5, 9)) {
                    System.out.println("Economy is full. Would you like First Class?");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        seat = assignSeat(seats, 0, 4);
                        if (seat != -1) {
                            printBoardingPass("First Class", seat);
                        }
                    }
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            } else if (choice == 2) { 
                int seat = assignSeat(seats, 5, 9);
                if (seat != -1) {
                    printBoardingPass("Economy", seat);
                } else if (canUpgrade(seats, 0, 4)) {
                    System.out.println("First Class is full. Would you like Economy?");
                    choice = scanner.nextInt();
                    if (choice == 2) {
                        seat = assignSeat(seats, 5, 9);
                        if (seat != -1) {
                            printBoardingPass("Economy", seat);
                        }
                    }
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

    // assigns the first available seat , or -1 if none available
    public static int assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i + 1;
            }
        }
        return -1;
    }

    // checks if any seat is available in the given range
    public static boolean canUpgrade(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                return true;
            }
        }
        return false;
    }

   
    public static void printBoardingPass(String section, int seat) {
        System.out.printf("Boarding pass: %s, Seat %d\n", section, seat);
    }
}

