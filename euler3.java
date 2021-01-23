import java.util.ArrayList;
import java.util.Collections;

public class euler3 {
    public static ArrayList<Integer> allFactors(long a) {
        int upLim = (int)(Math.sqrt(a));
        ArrayList<Integer> facs = new ArrayList<Integer>();
        for(int i=1;i <= upLim; i+= 1){
            if(a%i == 0){
                facs.add(i);
                if(i != a/i){ facs.add((int) (a/i));}
            }
        }
        Collections.sort(facs);
        Collections.reverse(facs);
        return facs;
    }

    public static int isPrime(int n){
        if (n <= 1){return 0;}
        if (n <= 3){return 1;}
        if (n % 2 == 0 || n % 3 == 0){ return 0;}
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0){ return 0; }
        }
        return 1;
    }

    public static void main(String[] args){
        // Get the factors of the number
        long n = 600851475143L;
        ArrayList<Integer> facs = allFactors(n);
        for (int i: facs){
            if(isPrime(i) == 1){ System.out.println(i); break;}
        }
    }
}