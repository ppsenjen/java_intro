
package controlstructures;

import java.util.Scanner;


public class Controlstructures {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int number1;
         int number2;
         
         System.out.println("Enter fist integer");
         number1= input.nextInt(); // read first number from the user
         
         System.out.println("Enter second number");
         number2 =  input.nextInt();
         
          if (number1 == number2){
             System.out.printf("%d == %d%n", number1, number2);
         }
         
         if (number1 != number2){
             System.out.printf("%d != %d%n", number1, number2);
         }
         
         if (number1 < number2)
             System.out.printf("%d < %d%n", number1, number2);
             
             if (number1 > number2)
                 System.out.printf("%d > %d%n", number1, number2 );
             
             if (number1 <= number2)
                 System.out.printf("%d <= %d%n", number1, number2);
             
             if (number1 >= number2)
                 System.out.printf("%d >= %d%n", number1, number2);
             
                
    }
    
}
