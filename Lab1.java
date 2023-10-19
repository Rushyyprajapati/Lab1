package edu.neu.mgen;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        int[] x = {10, 5, 8, 15, 7};
        int[] y = {12, 3, 9, 18, 6};
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        
        System.out.print("Array x = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        
        System.out.print("Array y = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        
        System.out.print("Array z = x + y = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        
        List<String> names = new ArrayList<>();
        names.add("Rushi");
        names.add("Sameer");
        names.add("Denil");
        names.add("Alexa");
        names.add("Raj");

        
        List<String> switchedNames = new ArrayList<>();

       
        for (String name : names) {
            if (name.length() >= 2) {
                char firstLetter = name.charAt(0);
                char lastLetter = name.charAt(name.length() - 1);
                String modifiedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
                switchedNames.add(modifiedName);
            } else {
               
                switchedNames.add(name);
            }
        }

       
        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(" " + name + ",");
        }
        System.out.println(" }");

        System.out.print("Names (switched) = {");
        for (String name : switchedNames) {
            System.out.print(" " + name + ",");
        }
        System.out.println(" }");
    }
}



