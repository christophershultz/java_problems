import java.util.ArrayList;

public class euler6 {

    public static ArrayList<Integer> getNums(int mx){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= mx; i++){ nums.add(i); }
        return nums;
    }

    public static long sumOfSquares(ArrayList<Integer> nums){
        long su = 0;
        for (int a: nums){ su = su + (a*a); }
        return su;
    }

    public static long squareOfSums(ArrayList<Integer> nums){
        long su = 0;
        for (int a: nums){ su = su + a; }
        return su * su;
    }

    public static void main(String[] args){
        ArrayList<Integer> nums = getNums(100); // first 100 natural nums
        long sumSquares = sumOfSquares(nums);
        long squareSums = squareOfSums(nums);
        if (sumSquares > squareSums){ System.out.println(sumSquares - squareSums); }
        else{ System.out.println(squareSums - sumSquares); }
    }
}
