import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){ // If lengths are not equal, then cannot be anagrams.
            return false;
        }

        // For two strings to be anagrams, each letter in the string must be present in the other string the same amount of times. So:
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){ // Incrementing the <key> depending on how many times the <value> appears in the string.

            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
            else {
                sMap.put(s.charAt(i), 1);
            }

        }

        for(int i = 0; i<t.length(); i++){ // Same thing for the other string. I could condense both into one loop, but this is more readable.

            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
            else {
                tMap.put(t.charAt(i), 1);
            }

        }

        if(sMap.equals(tMap)){ // Checks if all <key>,<value> pairs match. Online says O(n) but unsure.
            return true;
        }
        else {
            return false;
        }

        /* 
        Runtime analysis: 
        Two loops, doing constant operations inside, so O(n). Hashmap.equals() appears to be O(n) online. Therefore, O(n) + O(n) + O(n) = O(n)
        */
    }
}