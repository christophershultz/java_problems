import java.util.ArrayList;
import java.util.Collections;

public class euler4 {

    public static ArrayList<Integer> getAllNums(int mn, int mx){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = mn; i <= mx; i++) { nums.add(i); }
        Collections.reverse(nums);
        return nums;
    }

    public static String reverseIt(String s) {
        int i, len = s.length();
        StringBuilder dest = new StringBuilder(len);
        for (i = (len - 1); i >= 0; i--){ dest.append(s.charAt(i)); }
        return dest.toString();
    }

    public static int isPal(long z){
        String a = Long.toString(z);
        String r = reverseIt(a);
        if (a.equals(r)){ return 1; }
        else { return 0; }
    }

    public static void main(String[] args){
        int minN = 100, maxN = 999; //inclusive
        ArrayList<Integer> nums = getAllNums(minN, maxN);
        ArrayList<Long> pals = new ArrayList<Long>();
        for (int x: nums){
            for (int y: nums){
                long z = x*y;
                if (isPal(z) == 1){ pals.add(z); }
            }
        }
        Collections.sort(pals);
        System.out.println(pals.get(pals.size() - 1));
    }
}
