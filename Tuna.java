package com.marlen.java.lesson_1.Lesson7_1.Home7.Java_YouTube_Lections.ENUM.ENUM_New_Boston.ENUM_44;

// Java Programming Tutorial - 44 - Enumeration
// thenewboston
// https://www.youtube.com/watch?v=uFGrL5vyp54

// ENUM - class - that used to declare constants
// (to declare a bunch of constants of the ENUM type)

public enum Tuna {
    /* Any time, when you makes ENUM like this - Java automatically makes an array from these constants;
       ENUM makes an array of constants:
       [BUCKY("nice", "22"), KELSEY("cutie","10"), JULIA("bigmistake", "12")]:
       */
    BUCKY("nice", "22"),                   // constants and objects
    KELSEY("cutie","10"),                  // constants and objects
    JULIA ("bigmistake", "12");            // constants and objects

    private final String desc;
    private final String year;

    Tuna(String desc, String year) {
        this.desc = desc;
        this.year = year;
    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }

    /* Tuna(String description, String yearTotal) {
        desc = description;
        year = yearTotal;
    }*/
}
