package com.ksbhat.java.javacollections;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollections {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");
        System.out.println(words.size());
        System.out.println(words.indexOf("Cat"));
    }

    public void treeSet() {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
        //numbers ==> [12, 34, 54, 65, 99]
        numbers.floor(40);
        //$1 ==> 3
        numbers.floor(34);
        //$2 ==> 34
        numbers.lower(34);
        //$3 ==> 12
        numbers.ceiling(36);
        //$4 ==> 54
        numbers.ceiling(34);
        //$5 ==> 34
        numbers.higher(34);
        //$6 ==> 54
        numbers.subSet(20, 80);
        //$7 ==> [34, 54, 65]
        numbers.subSet(34, 54);
        //$8 ==> [34]
        numbers.subSet(34, 65);
        //$9 ==> [34, 54]
        numbers.subSet(34, true, 65, true);
        //$10 ==> [34, 54, 65]
        numbers.subSet(34, false, 65, false);
        //$11 ==> [54]
        numbers.headSet(50);
        //$12 ==> [12, 34]
        numbers.tailSet(50);
        //$13 ==> [54, 65, 99]

    }

}