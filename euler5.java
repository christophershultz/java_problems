public class euler5 {
    public static int checkNum(int i){
        int[] checks = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int status = 1;
        for (int z: checks){
            if (i % z != 0){ status = 0; }
        }
        return status;
    }

    public static void main(String[] args){
        int start = 20, result = 0, found = 0;
        while (found == 0){
            if (checkNum(start) == 1){ found = 1;}
            if (found == 0){ start = start + 2;}
            else {result = start;}
        }
        System.out.println(result);
    }
}
