import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        if(nums.length == 00 || nums.length == 1){ // If length is 0 or 1, there can't be dupes.
            return false; 
        }

        Set<Integer> dictionary = new HashSet<Integer>();

        for(int i = 0; i<nums.length; i++){
            if(dictionary.contains(nums[i])){
                return true; // If the hashset contains the element, there IS a dupe.
            }
            dictionary.add(nums[i]); // Keep adding array elements to the hashset.
        }

        return false; // If all elements are unique, there IS NO dupe.
    }
}