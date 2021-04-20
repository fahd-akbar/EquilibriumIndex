package com.adarga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Total Complexity Analysis: O(n) runtime | O(n) space
 */
public class EquilibriumIndex {

    public static int[] findEquilibriumIndex(int[] array) {
        System.out.println(Arrays.toString(array));
        if (array.length < 3) return new int[0];

        int[] leftToRightArray = new int[array.length];
        int[] rightToLeftArray = new int[array.length];

        int cumulativeSum = 0;
        /**
         * Fill the leftToRight array with cumulative sum at each index
         *
         * O(n) space | O(n) runtime
         */
        for (int i = 0; i < array.length; i++) {
            cumulativeSum += array[i];
            leftToRightArray[i] = cumulativeSum;
        }

        /**
         * Fill the rightToLeft array with cumulative sum at each index
         *
         * O(n) space | O(n) runtime
         */
        cumulativeSum = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            cumulativeSum += array[i];
            rightToLeftArray[i] = cumulativeSum;
        }

        /**
         * Now that we have 2 cumulative arrays, we can iterate the original array and evaluate at
         * each index i if it's equilibrium index by looking at leftToRightArray[i-1] and rightToLeftArray[i+1]
         */
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < array.length - 2; i++) {
            if (leftToRightArray[i-1] == rightToLeftArray[i+1]) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
