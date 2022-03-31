package ru.listProcessApp.listCalc;

import java.util.ArrayList;
import java.util.List;

public class ListCalc implements Math {

    public ListCalc() {

    }

    public List<Integer> listCalcProcess() {
        PrintBorders.printBeginning();
        List<Integer> listOfNumbers = new ArrayList<>();
        ListCreation.listCreation(listOfNumbers);
        ListCreation.listPrint(listOfNumbers);
        Integer sum = sumCalc(listOfNumbers);
        System.out.println(sum + " - сумма всех пяти элементов в коллекции");
        Integer average = averageCalc(listOfNumbers, sum);
        System.out.println(average + " - среднеарифметическое значение из коллекции");
        PrintBorders.printEnd();

        return listOfNumbers;

    }

}
