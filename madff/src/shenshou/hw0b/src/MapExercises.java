package hw0b.src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /**
     * Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        HashMap<Character, Integer> letterToNumMap = new HashMap<>();

        for (int i = 97; i <= 97 + 25; i++) {  // loop through all 26 characters
            Character letter = (char) i;
            Integer num = i - 97 + 1;
            letterToNumMap.put(letter, num);
        }
        return letterToNumMap;
    }

    /**
     * Returns a map from the integers in the list to their squares. For example, if the input list
     * is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        HashMap<Integer, Integer> squaresMap = new HashMap<>();

        for (Integer num : nums) {
            squaresMap.put(num, num * num);
        }
        return squaresMap;
    }

    /**
     * Returns a map of the counts of all words that appear in a list of words.
     */
    public static Map<String, Integer> countWords(List<String> words) {
        HashMap<String, Integer> countWordsMap = new HashMap<>();

        for (String word : words) {
            countWordsMap.put(word, countWordsMap.getOrDefault(word, 0) + 1);
        }
        return countWordsMap;
    }
}
