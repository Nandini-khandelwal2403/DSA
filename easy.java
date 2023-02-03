// leetcode question

// 268. Missing Number

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

//First unique character in a string

class Solution {
    public int firstUniqChar(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        int min = 1111111;
         for (Map.Entry<Character, Integer> mapElement : map.entrySet()){
             if(mapElement.getValue() == 1){
                int i = s.indexOf(mapElement.getKey());
                if(i < min){
                    min = i;
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            return min;
        }
        return -1;
    }
}