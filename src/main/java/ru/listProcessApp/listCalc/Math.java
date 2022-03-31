package ru.listProcessApp.listCalc;

import java.util.List;

public interface Math {

    default Integer sumCalc(List<Integer> listOfNumbers) {
        Integer sumOfAll = 0;
        for (Integer chosen : listOfNumbers) {
            sumOfAll = sumOfAll + chosen;
        }
        return sumOfAll;
    }

    default Integer averageCalc(List<Integer> listOfNumbers, Integer sumOfAll) {
        Integer average = sumOfAll / listOfNumbers.size();
        return average;
    }


}
