class euler1{
    public static void main(String[] args){
        int su = 0, i = 1, x1 = 3, x2 = 5, mx = 1000;
        while(i < mx){
            if((i%3==0) || (i%5==0)){
                su = su + i;
            }
            i++;
        }
        System.out.println(su);
    }
}