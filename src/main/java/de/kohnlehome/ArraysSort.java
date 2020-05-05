package de.kohnlehome;

import java.util.Arrays;

public class ArraysSort implements Sortierer {


    @Override
    public int[] sortieren(int[] unsortedArray) {
        Arrays.sort(unsortedArray);
        return unsortedArray;
    }
}
