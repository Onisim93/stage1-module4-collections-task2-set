package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int i : sourceList) {
            if (i % 2 != 0) {
                result.add(i);
                result.add(2*i);
            }
            else {
                while (i % 2 == 0) {
                    result.add(i);
                    i /= 2;
                }
                result.add(i);
            }
        }

        return result;
    }
}
