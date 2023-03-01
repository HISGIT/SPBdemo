import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class HelloWorld {
    public static String printIndexed(String str) {
        StringBuffer strBuffer= new StringBuffer(str).reverse();
        StringBuffer res= new StringBuffer();
        for(int i=0; i<strBuffer.length();i++){
            res.append(strBuffer.substring(i, i+1)).append(Integer.toString(strBuffer.length()-i-1));
        }
        return res.toString();
    }
    /**
     * @param str
     * @return String
     */
    public static String stutter(String str) {
        /* accepts a parameter and returns the String with its characters returns repeated twice. For example, stutter("Hello!") returns "HHeelllloo!!"  */
        StringBuffer strBuffer= new StringBuffer(str);
        StringBuffer res= new StringBuffer();
        for(int i=0; i<strBuffer.length();i++){
            String cIndex = strBuffer.substring(i, i+1);
            res.append(cIndex).append(cIndex);
        }
        return res.toString();
    }
    public static int quadrant(double x,double y){
        /*  takes as parameters a pair of real numbers representing an (x, y) point and that returns the quadrant number for that point. 
        Recall that quadrants are numbered as integers from 1 to 4 with the upper-right quadrant numbered 1 and the subsequent quadrants numbered in a counter-clockwise fashion:*/
        int quand=0;
        if(x > 0 && y > 0){
            quand = 1;
        }else if(x < 0 && y > 0){
            quand = 2;
        }else if(x < 0 && y < 0){
            quand = 3;
        }else if(x > 0 && y < 0){
            quand = 4;
        }
        return quand;
    }
    public static List common(List L1, List L2){
        /* returns a new list containing the common item of the two given lists. If there are no common items, return an empty list. */
        Set S1 = new HashSet<>(L1);
        Set S2 = new HashSet<>(L2);
        S2.retainAll(S1);
        List Lresult = new ArrayList(S2);
        return Lresult;
    }
    public static int countOccurrencesOfC(List<String> L1, char c){
        /*  takes a list and a character List<String> words, char c and returns the number of occurrences of the given character in a list of strings. 
        If the character does not occur in any of the words, it should return 0. */
        int count=0;
        String search_c = Character.toString(c);
        for(String item : L1){
            if(item.contains(search_c)){
                count++;
            }
        }
        return count;
    }
    
    public static Map letterToNum(){
        /*   returns a map from every lower case letter to the number corresponding to that letter starting with ‘a’ is 1. */
        Map<Character, Integer> map = new HashMap();
        for(int i=97;i<123;i++){
            char c = (char)(i);
            map.put(c, i);
        }
        return map;
    }
    public static Map squares(List<Integer> L){
        /*   takes a list List<Integer> nums and returns a map from the integers in the list to their squares. If the given list is empty, it should return an empty map. */
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<L.size();i++){
            map.put(L.get(i), L.get(i)*L.get(i));
        }
        return map;
    }
    public static Map countWords(List<String> L){
        /*   This method takes a list List<String> words and returns a map of the counts of all words that appear in a list of words. If the given list is empty, it should return an empty map. */
        Map<String, Integer> map = new TreeMap<>();
        for(int i=0;i<L.size();i++){
            if(null != map.get(L.get(i))){
                map.put(L.get(i),map.get(L.get(i))+1);
            }else{
                map.put(L.get(i),1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> L=new ArrayList<String>();
         L.add("1");L.add("2");L.add("123");
         L.add("2");L.add("123");L.add("2");
        System.out.print(countWords(L));
    }
}
