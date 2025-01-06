package ie.atu.week4;

public class arrayDemo {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];
        for(int i = 0; i < Array.length; i++){ //  this prints out the 0 to 9 index
            System.out.print("Element at index ");
            System.out.print(Array[i] + ":");
            System.out.println(Array[i] = (i+1)*100);
        }
    }
}
