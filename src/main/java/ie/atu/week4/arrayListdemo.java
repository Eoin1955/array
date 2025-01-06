package ie.atu.week4;

import java.util.ArrayList;

public class arrayListdemo {
    public static void main(String[] args) {

        ArrayList<Integer> Array = new ArrayList<>();

        Array.add(100);
        Array.add(200);
        Array.add(300);
        Array.add(400);
        Array.add(500);
        Array.add(600);
        Array.add(700);
        Array.add(800);
        Array.add(900);
        Array.add(1000);

        int index = 0;
        for (int element : Array){
            System.out.println("The element at index " + index + " : " + element);
            index++;
        }

    }
}
