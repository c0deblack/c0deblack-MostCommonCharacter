import java.util.*;
import java.util.stream.Collectors;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<String, Integer> dict = new HashMap<String, Integer>();
        
        for(String c : str.split(""))
        {
            if(dict.containsKey(c))
            {
                dict.put(c, dict.get(c) + 1);
            } else dict.put(c, 1);
        }
        return dict.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList()).get(0).charAt(0);
    }
}
