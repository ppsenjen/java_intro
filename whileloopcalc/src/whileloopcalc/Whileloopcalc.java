
package whileloopcalc;

import java.util.Scanner;

public class Whileloopcalc {

  
    public static void main(String[] args) {
        char operator;
        double answer = 0.0;
        String result = null;
        
      
        Scanner input = new Scanner(System.in);
       
        
        do {
        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        
        System.out.println("Select operation [*/+-]");
        operator = input.next().charAt(0);
        
        
        switch (operator){
        case '+' ->
                answer = number1 + number2;

            case '-' ->
                answer = number1 - number2;

            case '*' ->
                answer = number1 * number2;

            case '/' -> {

                if (number2 != 0) {
                    answer = number1 / number2;
                } else
                {
                    System.out.println("Cannot divide by zero");
                }
            }
        }
        if(number2 != 0 && operator != '/'){
            System.out.println(number1 + " " + operator + " " + number2 + " = " + answer);  
            
        System.out.println("Do you want to continue?");
            result = input.next();          
            
        }
        }
        
        while (result.equals("Yes"));    
    }
    
}
