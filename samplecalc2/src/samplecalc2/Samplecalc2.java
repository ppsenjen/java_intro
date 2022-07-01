
package samplecalc2;

import java.util.Scanner;


public class Samplecalc2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String answer;
     Scanner input = new Scanner(System.in);
     
     do{
        System.out.println("Enter price:");
        double price = input.nextDouble();
     
        System.out.println("enter quantity:");
        int qty = input.nextInt();
        
        double total = price * qty;
        
        System.out.println("The total is $" + total);
        
        System.out.println("Do you want to continue?");
        answer = input.next();
     }
     while (answer.equals("Yes"));   
    }
    
}
