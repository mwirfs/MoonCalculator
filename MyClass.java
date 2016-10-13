package com.example;
import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        System.out.println("Enter the day of the moon cycle");
        Scanner input1 = new Scanner(System.in);
        double day = input1.nextDouble();
        MyClass method = new MyClass();
        method.Moon(day);
    }
    public static double Moon(double day)
    {
        double full = day * 29.5;
        if (full == 29.5)
        {
            System.out.println("The moon is full");
        }
        if (full != 29.5)
        {
            System.out.println("The moon is not full");
            double fulldays = 29.5 - day;

            System.out.println("The moon will be full in " + fulldays + " days");
        }
        return full;

    }
}
