
package checkerboard;


public class Checkerboard {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int length = 16;
    int height = 8;

    for (int i = 0; i <= height; i++) {
        char first = ' ';
        char second= '*';
        if (i % 2 == 0) {
            first = '*';
            second = ' ';
        }
        for (int j = 0; j < length; j++) {
            if (j % 2 == 0) {
                System.out.print(first);
            } else {
                System.out.print(second);
            }
        }
        System.out.println("");
    }
}
    }
    

