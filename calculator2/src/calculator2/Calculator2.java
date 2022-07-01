package calculator2;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        char operator;
        double answer = 0.0;
      String get;
      
        Scanner scanObject = new Scanner(System.in);
        
     do {
        System.out.println("Please enter first number");
        num1 = scanObject.nextInt();

        System.out.println("Please enter second number");
        num2 = scanObject.nextInt();

        System.out.println("Which operation? [/*-+]");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+' ->
                answer = num1 + num2;

            case '-' ->
                answer = num1 - num2;

            case '*' ->
                answer = num1 * num2;

            case '/' -> {

                if (num2 != 0) {
                    answer = num1 / num2;
                } else
                {
                    System.out.println("Cannot divide by zero");
                }
            }
        }
        if(num2 != 0 && operator != '/'){
            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
            
            System.out.println("Would you like to continue?");
            get = scanObject.next();
            
        }
        while (get.equals("Yes"));
            
     }
     }     
            
        
    

            
            
            
       
     
    
    
    
    
      
  
       
       

      
    

