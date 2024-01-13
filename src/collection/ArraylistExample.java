package collection;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();

        al.add(10);
        al.add(15);
        al.add(19);

        System.out.println(al);
        System.out.println(al.contains(11));

    }
}
