
package division;

import java.util.Scanner;


public class Division {

    
    public static void main(String[] args) {
        // TODO code application logic here50
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter first integer");
        int number1 = input.nextInt();
        
        System.out.println("Please enter second integer");
        int number2 = input.nextInt();
        
        int division = number1 / number2;
        
        System.out.println("Output" + division);
        
        
        
    }
    
}
