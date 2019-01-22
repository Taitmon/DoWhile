package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //This code demonstrates how a "do while" loop will at least execute the println at least once.
        //If it was just a while loop then this code would not execute the println, because 100 is > than 0.

        int num =100;

        do
        {
            System.out.println("DoWhile Countup: " + num);
            num = num + 10;
        }
        while (num < 0);

    }
}
