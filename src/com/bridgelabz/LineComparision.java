package com.bridgelabz;

public class LineComparision {
    public static void main(String[] args) {
        //Print Welcome Message

        System.out.println("Welcome to Line Comparision Computation ");

        //Initialization  of variables

        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 4;

        //calculating length1 of x

        Integer length1 = (int)Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("Length of first line is : " + length1);

        //Initialization of variables

        int c1 = 3;
        int d1 = 4;
        int c2 = 7;
        int d2 = 1;

        //calculating length2 of y

        Integer length2 = (int)Math.sqrt((c2-c1)*2 + (d2-d1)*2);
        System.out.println("Length of second line is : " + length2);


        //Calculating the Length is equal or not by using java equal method

        boolean result = length1.equals(length2);

        if (result == true)
            System.out.println("Length of lines are same...");
        else
            System.out.println("Lines are not equals...");

    }

    }

