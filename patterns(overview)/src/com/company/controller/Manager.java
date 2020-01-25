package com.company.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.view.Printer;

public class Manager {
    public static void main(String[] args) {

        String input = "abcdefgxyz";
        Pattern p = Pattern.compile("([a-z]?)([a-z]*)([a-z]+)");
        Matcher matcher = p.matcher(input);

        if(matcher.matches()){
            Printer.printGroup(1, matcher);
            Printer.printGroup(2, matcher);
            Printer.printGroup(3, matcher);
        }

    }
}
