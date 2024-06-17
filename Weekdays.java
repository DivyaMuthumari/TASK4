package com.task4;
        import java.util.Arrays;
        import java.util.Scanner;
public class Weekdays {
    int index;

    public static void main(String[] args) {
        System.out.println("enter a index number");
        Scanner Scanner = new Scanner(System.in);
        int index = Scanner.nextInt();
        for (int i = 0; i <= 7;) {
            i=index;
            String[] ar = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
            System.out.println(ar[i]);
            break;
        }
    }
}

