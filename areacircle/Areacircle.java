
package areacircle;

import java.util.Scanner;


public class Areacircle {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int radius;
        double area;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle");
        radius = input.nextInt();
        
        area = (radius * radius)*Math.PI;
        
        System.out.println("Area of the circle is:" + area);
    }
    
}
