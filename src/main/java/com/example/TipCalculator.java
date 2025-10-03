package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW    

        double tip = Math.round(cost * percent / 100.0 * 100) / 100.0;
        double totalWithTip = cost + tip;
        double costPerPerson = Math.round(cost / people * 100) / 100.0;
        double tipPerPerson = Math.round(tip / people * 100) / 100.0;
        double totalPerPerson = Math.round(((cost * percent / 100.0)+cost)/ people * 100) / 100.0;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + totalWithTip + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {

        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        double tip = Math.round(cost * percent / 100.0 * 100) / 100.0;
        double totalWithTip = cost + tip;
        double costPerPerson = Math.round(cost / people * 100) / 100.0;
        double tipPerPerson = Math.round(tip / people * 100) / 100.0;
        double totalPerPerson = Math.round(((cost * percent / 100.0)+cost)/ people * 100) / 100.0;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + totalWithTip + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        Scanner scan = new Scanner(System.in);
        String item = "";
        
        result += "Items ordered:\n";
        while (!item.equals("-1")) {
            System.out.println("Enter an item name or type '-1' to finish:");
            item = scan.nextLine();
        if (!item.equals("-1")) {
            result += item + "\n";
            }
        }
        result += "-------------------------------\n";
        scan.close();
        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;            
        System.out.println(calculateTip(people,percent,cost));
        //System.out.println(extraCredit(people, percent, cost));
    }
}
        
