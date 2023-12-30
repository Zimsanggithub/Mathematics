package mathssolution;

public class Mathematics {
    String operator;
    int a;
    int b;


    public Mathematics(String operator, int a, int b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println(this.operator);
        System.out.println(this.a);
        System.out.println(this.b);


    }

    public void calculate() {
        if (this.operator.trim().equals("+")){
            System.out.println(this.a + this.b);

        }
        if (this.operator.trim().equals("-")) {
            System.out.println(this.a - this.b);
        }


        if (this.operator.trim().equals("*")) {
            System.out.println(this.a * this.b);
        }

        if (this.operator.trim().equals("/")) {
            System.out.println(this.a / this.b);
        }
    }

}
