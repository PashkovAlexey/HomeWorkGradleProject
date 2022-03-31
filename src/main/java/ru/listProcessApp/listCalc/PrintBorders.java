package ru.listProcessApp.listCalc;

import org.joda.time.LocalTime;

public abstract class PrintBorders {

    public static void printBeginning() {
        printBorder();
        LocalTime currentTimeStart = new LocalTime();
        System.out.println("Время когда начаты расчеты - " + currentTimeStart);
        System.out.println("У нас есть коллекция из пяти чисел");
    }

    public static void printEnd() {
        System.out.println("Расчеты завершены");
        LocalTime currentTimeEnd = new LocalTime();
        System.out.println("Время когда завершены расчеты - " + currentTimeEnd);
        printBorder();
    }

    private static void printBorder() {
           System.out.println("///////////////////////////////////////////////////////////////");
    }
}
