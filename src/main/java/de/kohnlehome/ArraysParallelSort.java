package de.kohnlehome;

import java.util.Arrays;

public class ArraysParallelSort implements Sortierer {
    @Override
    public int[] sortieren(int[] unsortedArray) {
        Arrays.parallelSort(unsortedArray);
        return unsortedArray;
    }
}
