public class euler2 {
    public static void main(String[] args){
        int v0 = 1, v1 = 2, su = 0, nxt = 0;
        while (v1 <= 4000000){
            if (v1%2 == 0){
                su = su + v1;
            }
            nxt = v0 + v1;
            v0 = v1;
            v1 = nxt;
        }
        System.out.println(su);
    }
}
