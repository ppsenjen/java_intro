/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subtraction;

import java.util.Scanner;

/**
 *
 * @author Kevan
 */
public class Subtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter first integer");
        int number1 = input.nextInt();
        
        System.out.println("Please enter second integer");
        int number2 = input.nextInt();
        
        int subtraction = number1 - number2;
        
        System.out.println("Output" + subtraction);
        
        
    }
    
}
