package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        String a = "Hi, user!, type 2 numbers: 1st - list size, 2nd - upper limit of values";
        logger.log(a);
        Scanner scanner = new Scanner(System.in);
        int listsize = scanner.nextInt();
        a = "Creating ArrayList...";
        logger.log(a);
        List<Integer> list = new ArrayList<>(listsize);
        int maxValue = scanner.nextInt();
        Random random = new Random(maxValue);
        for (int i = 0; i < listsize; i++) {
            list.add(i, random.nextInt(maxValue));
        }
        a = "ArratList is filled: " + list;
        logger.log(a);
        a = "Write the number to filtrate the list";
        logger.log(a);
        int treshold = scanner.nextInt();
        scanner.close();
        a = "ArrayList is filterate...";
        logger.log(a);
        Filter filter = new Filter(treshold);
        a = "ArrayList finished the filtrating: " + filter.filterOut(list, treshold);
        logger.log(a);

    }

}