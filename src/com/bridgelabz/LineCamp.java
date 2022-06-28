package com.bridgelabz;

import java.util.Scanner;

public class LineCamp {
    public static void main(String[] args) {
        int x=0, x1=0, y=0, y1=0;
        int lengthLine;
        System.out.println("welcome to line computation ");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value for 'x': ");
        x = sc.nextInt();
        System.out.print("enter value for 'x1': ");
        x1 = sc.nextInt();
        System.out.print("enter value for 'y': ");
        y = sc.nextInt();
        System.out.print("enter value for 'y1': ");
        y1 = sc.nextInt();

        int a = (x1-x);
        int b = (y1-y);
        lengthLine = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(lengthLine);
    }
}
