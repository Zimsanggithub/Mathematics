package shape;

import java.util.Scanner;

public class Triangle {
    //adding attributes
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this. sideLenTwo = sideLenTwo;
        this. sideLenThree = sideLenThree;

    }
    public double findArea(){
        return(this.base * this.height) / 2;

    }
public static void main(String[] args){
        // first we need base and height as tha area of triangle i.e a= (b*h)/2
    int base = 0;
    int height = 0;
    //also
    int area = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of base of the triangle");
    base = scanner.nextInt();
    System.out.println("Enter the length of height of the triangle");
    height = scanner.nextInt();

    area = (base * height) / 2;

    System.out.println("The area of Triangle is : " + area);

    }

}


