package hashmap;

import java.util.HashMap;

public class ValidAnagramHashMap {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) == 0) {
                return false;
            }
            counts.put(c, counts.get(c) - 1);
        }

        return true;
    }
}