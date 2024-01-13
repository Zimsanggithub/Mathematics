package conditiondemo;

public class Conditions {
    public static void main(String[] args) {
        int a = 25;
        int b = 28;
        int c = 30;
        int max = 0;
        if (a > b) {
            max = a;
        }else {
            max = b;
        }

        if ( max >c) {
            max = c;

            System.out.println("it is true");
        }else {
                System.out.println("it is false");
            }
    }
}