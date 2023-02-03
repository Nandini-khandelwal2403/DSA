// leetcode question

// Missing Number

class Solution {
    public int missingNumber(int[] nums) {

        // Method 1: Using TreeMap

        // TreeMap<Integer, Integer> map = new TreeMap<>();
        // for(int arr: nums){
        //     map.put(arr, arr);
        // }
        // int t = 0;
        // if(!map.containsKey(t)){
        //     return 0;
        // }
        // for(int k: map.keySet()){
        //     if(k - t == 2){
        //         return k-1;
        //     }
        //     t = k;
        // }
        // return t+1;

        // Method 2: Using Arrays.sort()

        // int t = 0;
        // Arrays.sort(nums);
        // if(nums[0] != 0){
        //     return 0;
        // }
        // for(int i: nums){
        //     if(i - t == 2){
        //         return i-1;
        //     }
        //     t = i;
        // }
        // return t+1;

        // Method 3: O(N) time and O(1) space
        int n = nums.length;
        int sum = n*(n+1) / 2;

        for(int i : nums){
            sum = sum - i;
        }
        return sum;
    }
}