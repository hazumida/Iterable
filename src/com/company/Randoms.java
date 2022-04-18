package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List<Integer> numbers = new ArrayList();
    private int number = 0;

    public Randoms(int min, int max) {
        this.random = new Random();
        while ( number != max) {
            number = random.nextInt(max - min + 1) + min;
            numbers.add(number);
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}
