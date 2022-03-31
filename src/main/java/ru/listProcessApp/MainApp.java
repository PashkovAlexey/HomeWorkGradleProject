package ru.listProcessApp;

import ru.listProcessApp.listCalc.AddedLibraryProcess;
import ru.listProcessApp.listCalc.ListCalc;

import java.util.List;


public class MainApp {

    public static void main(String[] args) {
        ListCalc newList = new ListCalc();
        List<Integer> listOfNumbers = newList.listCalcProcess();
        AddedLibraryProcess.addedLibraryCalc(listOfNumbers);
    }
}
