package ie.atu.week4;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];
        for(int i = 0; i < Array.length; i++){ //  this prints out the 0 to 9 index
            System.out.print("Element at index ");
            System.out.print(Array[i] + ":");
            System.out.println(Array[i] = (i+1)*100);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a new number: ");

        int newNum = sc.nextInt();

        try{
            Array[10] = newNum;
            System.out.println("Element at index 10 : " + Array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Attempted to catch an array that is out of bounds");
        }
    }
}
