package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List<Integer> numbers = new ArrayList();
    private final int max, min;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
        numbers.add(random.nextInt(max - min + 1) + min);

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int index = nextIndex;
                nextIndex++;
                numbers.add(random.nextInt(max - min + 1) + min);
                return numbers.get(index);
            }
        };
    }
}
