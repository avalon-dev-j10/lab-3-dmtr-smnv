package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

public class ShellSort implements Sort {

    /**
     * Выполняет сортировку массива методом Шелла
     *
     * @param array - сортируемый массив
     */
    @Override
    public void sort(int[] array) {
        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment = increment / 2;
        }
    }

    private void insertionSort(int[] array, int startIndex, int increment) {
        for (int i = startIndex; i < array.length - 1; i = i + increment) {
            for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
                if (array[j - increment] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - increment];
                    array[j - increment] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
