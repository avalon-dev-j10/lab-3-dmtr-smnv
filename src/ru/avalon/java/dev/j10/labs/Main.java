package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {

        /**
         * Создаем объекты для инициализации и сортировки. При создании
         * учитываем интерфейсы, реализуемые классами.
         */
        Initializer fiboInit = new FibonacciInitializer();
        Initializer randInit = new RandomInitializer(-50, 50);
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort shellSort = new ShellSort();

        int[] array = new int[20]; // задание массива на 20 интов
        fiboInit.initialize(array); // иниц-ия послед-ю Фибоначчи
        int sum = Arrays.stream(array).sum(); // сумма всех эл-ов массива
        randInit.initialize(array); // иниц-ия значениями заданного диапазона
        bubbleSort.sort(array); // пузырьковая сортировка
        randInit.initialize(array); // иниц-ия значениями заданного диапазона
        selectionSort.sort(array); // сортировка выбором
        randInit.initialize(array); // иниц-ия значениями заданного диапазона
        shellSort.sort(array); // сортировка Шелла

    }
}
