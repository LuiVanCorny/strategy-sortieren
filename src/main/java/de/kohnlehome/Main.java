package de.kohnlehome;

import java.util.Arrays;

public class Main {
    private Sortierer sortierer;

    public void setSortierer(Sortierer sortierer) {
        this.sortierer = sortierer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setSortierer(new ArraysSort());
        main.tuwas();

        main.setSortierer(new ArraysParallelSort());
        main.tuwas();
    }

    public void tuwas() {
        int[] unsortedArray = {4, 3, 2, 1};
        int[] sortedArray = sortierer.sortieren(unsortedArray);

        System.out.println(Arrays.toString(sortedArray));
    }
}
