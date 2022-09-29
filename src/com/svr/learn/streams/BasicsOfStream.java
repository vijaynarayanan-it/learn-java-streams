package com.svr.learn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicsOfStream {
    public static void main(String[] args) throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Vijay");
        names.add("Arun");
        names.add("Vijay");
        names.add("xavior");
        names.add("\n");
        names.add("\t");
        names.add(" ");

        // Sorting, removing duplicates
        names.stream()
                .filter(BasicsOfStream::isFirstCharacterIsAlphabetAndUpperCase)
                .sorted()
                .distinct()
                .forEach(System.out::println);


        List<String> namesWhichAreEvenIndex = IntStream
                .range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(v-> names.get(v))
                .collect(Collectors.toList());

        namesWhichAreEvenIndex.forEach(System.out::println);

        if(!names.stream().allMatch(val-> Character.isWhitespace(val.charAt(0)))) {
            throw new Exception("Name list is having whitespace or invalid character");
        }
    }

    private static boolean isFirstCharacterIsAlphabetAndUpperCase(String value) {
        return Character.isAlphabetic(value.charAt(0)) && Character.isUpperCase(value.charAt(0));
    }
}
