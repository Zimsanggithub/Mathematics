package shape;

import java.util.Scanner;

public class Rectangle {
    public static void main(String [] args){
        //area of rectangle is l*b
        int len = 0;
        int breadth = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the length of the rectangle");
        long length = scanner.nextInt();
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" enter the breadth of the rectangle");
        long height = scanner1.nextInt();

        String area = "a";
        System.out.println("The area of the rectangle is : " + area);

    }
}
