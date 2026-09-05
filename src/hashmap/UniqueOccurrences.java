package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> seenCounts = new HashSet<>();
        for (int count : counts.values()) {
            if (!seenCounts.add(count)) {
                return false;
            }
        }
        return true;
    }
}