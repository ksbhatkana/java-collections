package com.ksbhat.java.javacollections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(left.length(), right.length());
    }
}
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }
}