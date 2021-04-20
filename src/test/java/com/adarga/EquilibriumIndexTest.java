package com.adarga;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EquilibriumIndexTest {

    @Test
    void findMultipleEquilibriumIndexes() {
        int[] input = new int[]{8, 2, 7, 2, -2, 12, 4, 3};

        int[] equilibriumIndex = EquilibriumIndex.findEquilibriumIndex(input);
        assertArrayEquals(new int[]{3, 4}, equilibriumIndex);
    }

    @Test
    void findSingleEquilibriumIndexes() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int[] equilibriumIndex = EquilibriumIndex.findEquilibriumIndex(input);
        System.out.println(Arrays.toString(equilibriumIndex));
        assertArrayEquals(new int[]{5}, equilibriumIndex);
    }

    @Test
    void findNoEquilibriumIndexes() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 8};

        int[] equilibriumIndex = EquilibriumIndex.findEquilibriumIndex(input);
        System.out.println(Arrays.toString(equilibriumIndex));
        assertArrayEquals(new int[0], equilibriumIndex);
    }

    @Test
    void findNoEquilibriumIndexesForSmallInput() {
        int[] input = new int[]{1, 2};

        int[] equilibriumIndex = EquilibriumIndex.findEquilibriumIndex(input);
        System.out.println(Arrays.toString(equilibriumIndex));
        assertArrayEquals(new int[0], equilibriumIndex);
    }
}