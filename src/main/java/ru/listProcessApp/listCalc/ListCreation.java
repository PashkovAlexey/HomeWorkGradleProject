package ru.listProcessApp.listCalc;

import java.util.List;
import java.util.Random;

public abstract class ListCreation {

    public static List<Integer> listCreation(List<Integer> listOfNumbers) {
        for (int i = 0; i < 5; i++) {
            Random radnom = new Random();
            listOfNumbers.add(radnom.nextInt(100));
        }
        return listOfNumbers;
    }


    public static void listPrint(List<Integer> listOfNumbers) {
        for (Integer chosen : listOfNumbers) {
            System.out.println(chosen + " значение из коллекции");
        }
    }

}
