class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        int newl = 0, l = 0;
        int s = 0, start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(max < sum){
                max = sum;
                start = s;
                end = i;
            }
            // max = Math.max(max, sum);
            
            if(sum < 0) {
                sum = 0;
                s = i + 1;
            } 
        }
        System.out.println(end - start + 1);
        return max;
    }
}