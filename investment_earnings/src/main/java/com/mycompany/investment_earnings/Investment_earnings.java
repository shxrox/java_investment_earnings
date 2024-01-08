package com.mycompany.investment_earnings;

import java.util.Scanner;

public class Investment_earnings {

    public static void main(String[] args) {

        int day = 1;
        double closingPrice = 0.1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Buying Price per share: ");
        double buyingPrice = scan.nextDouble();

        while (true) {
            System.out.println("Enter the closing price for day  " + day + " (any nagative value to leave : ");

            closingPrice = scan.nextDouble();

            if (closingPrice < 0.0) {
                break;
            }
            double earnings = closingPrice - buyingPrice;

            if (earnings > 0.0) {
                System.out.println("After day " + day + " , you earned "
                        + earnings + " per share ."
                );

            } else if (earnings < 0) {
                System.out.println("After day " + day + " , you earned "
                        + (-earnings) + " per share .");
            } else {
                System.out.println("After day " + day + " , you have " + " no earnings per share. ");
            }
            day += 1;
    
        
        }
        
        scan.close();
    }   
    
    
}
