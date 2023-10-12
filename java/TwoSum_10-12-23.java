class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] rv = new int[2];

        /* 
        Initial brute force O(n^2) solution that I came up with

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    rv[0] = i;
                    rv[1] = j;
                }
            }
        }
        return rv;
        */

        // Optimized O(n) one-pass of the array using a hashmap solution (with hints)
        // The algorithm makes complete sense, but coming up with it is hard, so I should redo this problem all on my own later
        Map<Integer, Integer> myMap = new HashMap<>(); 

        for(int i = 0; i<nums.length; i++){ 
            if(myMap.containsKey(nums[i])){ 
                rv[0] = i;
                rv[1] = myMap.get(nums[i]);
            }
            int findThisValue = target - nums[i];
            myMap.put(findThisValue, i);
        }
        return rv;
    }
}