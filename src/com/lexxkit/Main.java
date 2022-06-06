package com.lexxkit;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.println();
        printEvenNumbersAscending(nums);
        List<String> words = List.of("one two one four two five three".split(" "));
        printUniqueWords(words);
        printCountDuplicates(words);
    }

    private static void printCountDuplicates(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                Integer val = wordsMap.get(word);
                wordsMap.put(word,  ++val);
            } else {
                wordsMap.put(word, 1);
            }
        }
        for (Integer value : wordsMap.values()) {
            if (value > 1) {
                System.out.print(value + " ");
            }
        }
    }

    private static void printUniqueWords(List<String> words) {
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
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
