
/**
 * WeeklyBudget 
 * Prince Kuranchie
 * Last Updated: 8/25/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class WeeklyBudget
{
  //  Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {    
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Instantiate the Scanner object to read from the keyboard
        Scanner scan = new Scanner (System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name:");
        name = scan.nextLine();
        
        // Read doubles (floating point number)
        System.out.print("Enter your weekley allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice = scan.nextDouble();
        
        // Read an integer
        System.out.print("Enter the number of school lunches you orderd this week: ");
        lunchesPerWeek = scan.nextInt();
        
    
        
        // Perform calculations ( Arithmeric expressions)
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost;
        
        
        // printf allows palceholders for strings using %s
        System.out.printf("%n--- Weekly Budget Summary For %s ---%n ", name);
        
        System.out.printf("%-25s %s%n", "Weekly Allowance", money.format(allowance));
        System.out.printf("%-25s %s%n", "Total spent on Lunches",money.format(totalCost));
        System.out.printf("%-25 %s%n", "Money Remaining",money.format(remaining));
        
 
}
}