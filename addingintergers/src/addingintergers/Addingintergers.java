
package addingintergers;

import java.util.Scanner;


public class Addingintergers {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number1; //addition of first number
        int number2; //addition second letter
        int sum; //sum of number1 and number2
        
        System.out.println("enter first integer"); //prompt
        number1=input.nextInt(); //read first number from user
        
        System.out.println("enter second interger"); // prompt
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("sum is %d%n", sum); // display sum        
    }
    
}
