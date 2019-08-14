import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1 implements Solution {
    @Override
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                result.add(i);
            }
            return result;
        }

        Set<String> tobeFound = Stream.of(words).collect(Collectors.toSet());
        Map<String,Integer> found = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        boolean matchFound = false;

        int begin = 0, end = 0;
        while (begin < s.length()) {
            while (end < s.length()) {
                for (String t : tobeFound) {
                    int idx = s.indexOf(t, end);
                    if (idx == end && !found.containsKey(t)) {
                        found.put(t, 1);
                    }
                }
            }

            if (matchFound) {
                result.add(begin);
            }
        }



        return Collections.emptyList();
    }
}
