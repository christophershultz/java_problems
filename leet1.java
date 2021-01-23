class leet1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((i != j) && (nums[i] + nums[j] == target)) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i: result){
            System.out.println(i);
        }
    }
}