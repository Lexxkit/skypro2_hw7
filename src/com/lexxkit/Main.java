package com.lexxkit;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.println();
        printEvenNumbersAscending(nums);
    }

    private static void printEvenNumbersAscending(List<Integer> nums) {
        SortedSet<Integer> result = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        System.out.println(result);

        List<Integer> resultList = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!resultList.contains(num)) {
                    resultList.add(num);
                }
            }
        }
        Collections.sort(resultList);
        System.out.println(resultList);
    }

    private static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0 ) {
                System.out.print(num + " ");
            }
        }
    }


}
