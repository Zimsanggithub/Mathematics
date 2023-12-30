import mathssolution.Mathematics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter and operator");
        String operator = sc.next();
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Mathematics m = new Mathematics(operator,a,b);
m.calculate();
       // m.display();
    }
}