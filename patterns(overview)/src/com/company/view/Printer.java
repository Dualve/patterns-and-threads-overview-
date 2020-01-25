package com.company.view;

import java.util.regex.Matcher;

public class Printer {

    private static final String MSG = " group consist of ";

    public static void printGroup(int group, Matcher matcher){
        System.out.println(group + MSG + matcher.group(group) );
    }
}
