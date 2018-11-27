package com.marlen.java.lesson_1.Lesson7_1.Home7.Java_YouTube_Lections.ENUM.ENUM_New_Boston.ENUM_44;


// Java Programming Tutorial - 44 - Enumeration
// thenewboston
// https://www.youtube.com/watch?v=uFGrL5vyp54


public class Main {
    public static void main(String[] args) {
        /*
        Any time, when you makes ENUM like this - Java automatically makes an array from these constants;
       ENUM makes an array of constants:
       [BUCKY("nice", "22"), KELSEY("cutie","10"), JULIA("bigmistake", "12")]:
       Tuna.values() - build an array
       values() - is a static method
       people - name of this array
       for:each loop - through all ENUM elements
        */
       for (Tuna people: Tuna.values())
           System.out.println(people+" " +people.getDesc()+ " "+people.getYear());
    }
}
