package com.ksbhat.java.javacollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public void immutableMap() {
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
        //map ==> {Z=10, A=3, B=5}
        map.get("Z");
        //$1 ==> 10
        map.get("A");
        //$2 ==> 3
        map.get("C");
        //$3 ==> null
        map.size();
        //$4 ==> 3
        map.isEmpty();
        //$5 ==> false
        map.containsKey("A");
        //$6 ==> true
        map.containsKey("F");
        //$7 ==> false
        map.containsValue(3);
        //$8 ==> true
        map.containsValue(4);
        //$9 ==> false
        map.keySet();
        //$10 ==> [Z, A, B]
        map.values();
        //$11 ==> [10, 3, 5]
    }
    public void printNumberOfOccurences() {
        String str = "This is an awesome occassion. This has never happened before.";
        char[] characters = str.toCharArray();
        Map<Character, Integer> occurrences = new HashMap<>();
        for(char character:characters) {
            Integer count = occurrences.get(character);
            if(count == null) {
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, count+1);
            }
        }
        System.out.println(occurrences);
        String[] words = str.split(" ");
        Map<String, Integer> frequency = new HashMap<>();
        for(String word:words) {
            Integer number = frequency.get(word);
            if(number == null) {
                frequency.put(word, 1);
            } else {
                frequency.put(word, number+1);
            }
        }
        System.out.println(frequency);
    }

    public void treeMap() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("F", 25);
        //$1 ==> null
        treeMap.put("Z", 5);
        //null
        treeMap.put("L", 250);
        //$3 ==> null
        treeMap.put("A", 15);
        //$4 ==> null
        treeMap.put("B", 25);
        //$5 ==> null
        treeMap.put("G", 25);
        //$6 ==> null
        System.out.println(treeMap);
        //treeMap ==> {A=15, B=25, F=25, G=25, L=250, Z=5}
        treeMap.higherKey("B");
        //$7 ==> "F"
        treeMap.higherKey("C");
        //$8 ==> "F"
        treeMap.ceilingKey("B");
        //$9 ==> "B"
        treeMap.ceilingKey("C");
        //$10 ==> "F"
        treeMap.lowerKey("B");
        //$11 ==> "A"
        treeMap.floorKey("B");
        //$12 ==> "B"
        treeMap.firstEntry();
        //$13 ==> A=15
        treeMap.lastEntry();
        //$14 ==> Z=5
        treeMap.subMap("C", "Y");
        //$7 ==> {F=25, G=25, L=250}
        treeMap.subMap("B", "Z");
        //$7 ==> {B=25, F=25, G=25, L=250}
        treeMap.subMap("B", true, "Z", true);
        //$7 ==> {B=25, F=25, G=25, L=250, Z=5}
    }
}