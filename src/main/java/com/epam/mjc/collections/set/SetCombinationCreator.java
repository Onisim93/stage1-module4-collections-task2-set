package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        Set<String> thirdCopy = new HashSet<>(thirdSet);
        thirdCopy.removeAll(secondSet);
        thirdCopy.removeAll(firstSet);


        result.addAll(thirdCopy);

        return result;
    }
}
