package hw0b.src;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        int sumResult = 0;
        for (int num : L) {
            sumResult += num;
        }
        return sumResult;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : L) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonList = new ArrayList<>();
        for (int num : L1) {
            if (L2.contains(num)) {
                commonList.add(num);
            }
        }
        return commonList;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int occurrence = 0;
        for (String word : words) {
            // current word not contain target char -> pass
            if (word.indexOf(c) < 0) {
                continue;
            }

            // current word contains target char -> loop through current word & calculate occurrence
            for (int i = 0; i < word.length(); i++) { //
                if (word.charAt(i) == c) {
                    occurrence += 1;
                }
            }
        }
        return occurrence;
    }
}
