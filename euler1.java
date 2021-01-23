
/*
EULER: Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. Their sum is 23. 
Find the sum of all the multiples of 3 or 5 below 1000.
*/ 
import java.util.Arrays;

class Euler1{

    public static int[] getVals(int m1, int m2, int mx){
        int[] xi = {}; 
        int i = 1; 
        while (i < mx){
            if ((i % 3 == 0) || (i % 5 == 0)){
                xi = ArrayUtils.add(xi, i);
            }
        }
        return xi; 
    }

    public static int getSum(int[] xi){
        int sum = 0; 
        for (int i = 0; i < xi.length; i++) {
            sum = sum + xi[i]; 
          }
        return sum; 
    }

    public static void main(String[] args){
        // Get the list of all multiples of 3 or 5 under 1000
        int[] xi = getVals(3, 5, 1000); 

        // Compute their sum and print it
        int su = getSum(xi); 

        // Print 
        System.out.println(su);

    }
}