package com.example.workshop_3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","b","c","a","d","c");
        System.out.println(strings);

        List<String> list = strings
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
