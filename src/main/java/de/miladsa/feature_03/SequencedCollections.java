package de.miladsa.feature_03;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int first = numbers.getFirst();
        int last = numbers.getLast();
        System.out.println("First: " + first + " Last: " + last);
    }
}
