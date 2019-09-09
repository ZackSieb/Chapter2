/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter2;

/**
 *
 * @author Siebu
 */
public class SalesTax 
{
    public static void main(String[] args)
    {  
       // Constants
        final double State_Rate = 0.04; // State tax rate
        final double County_Rate = 0.02; // County tax rate
        
        // Variables
        double purchase;                //amount of purchase
        double stateTax;                //amount of state sales tax
        double countyTax;               //amount of county sales tax
        double TotalTax;                //Total sales tax
        double TotalCost;               //total cost of purchase
        
        // create a scanner object for keyboard unput.
        scannerkeyboard = new scanner(system.in);
        
        // get the amount of the purchase.
        System.out.print("Enter the purchase amount: "); purchase = keyboard.nextDouble();
       
        // calculate the state sales tax.
        stateTax= = purchase * State_Rate;
        
        // calculate coounty sales tax.
        countyTax = purchase * County_Rate;
        
        // calculate the total sales tax.
        TotalTax = stateTax + countyTax;
        
        // calculate the total purchase cost.
        TotalCost = purchase + TotalTax;
        
        // Display the results.
        System.out.println("urchase amount: $" + purchase);
        System.out.println("State tax: $" + stateTax);
        System.out.println("County tax: $" + countyTax);
        System.out.println("Total tax: $" +TotalTax);
        System.out.println("Total cost: $" +TotalCost);
    }
}
