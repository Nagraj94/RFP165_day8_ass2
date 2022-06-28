package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineCamp {
    static int x=0, x1=0, x2=0, x3=0, y=0, y1=0, y2=0,y3=0 ;
    int lengthLine1;
    int lengthLine2;

    void lengthLine(){
        int a = (x1-x);
        int b = (y1-y);
        int c = (x3-x2);
        int d = (y3-y2);

        System.out.println("*************************************");
        lengthLine1 = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("length of line one is: "+lengthLine1);

        lengthLine2 = (int) Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
        System.out.println("length of line two is: "+lengthLine2);
        System.out.println("*************************************");
    }

    void equalsMethod(){
        if (Objects.equals(lengthLine1,lengthLine2))
        {
            System.out.println("length of line 1 is equal length line 2");
        }
        else
        {
            System.out.println("length of line 1 is not equal to length line 2");
        }
        System.out.println("*************************************");
    }

    void compareToMethod(){
        int compare = Integer.compare(lengthLine2,lengthLine1);

        if(compare == 0) {
            System.out.println("length of line 1 is greater than length of line 2 ");
        }
        else {
            System.out.println("length of line 2 is greater than length of line 1 ");
        }
    }

    public static void main(String[] args) {

        System.out.println("welcome to line computation ");
        System.out.println("  ");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter value for 'x': ");
        x = sc.nextInt();
        System.out.print("enter value for 'x1': ");
        x1 = sc.nextInt();
        System.out.print("enter value for 'x2': ");
        x2 = sc.nextInt();
        System.out.print("enter value for 'x3': ");
        x3 = sc.nextInt();
        System.out.print("enter value for 'y': ");
        y = sc.nextInt();
        System.out.print("enter value for 'y1': ");
        y1 = sc.nextInt();
        System.out.print("enter value for 'y2': ");
        y2 = sc.nextInt();
        System.out.print("enter value for 'y3': ");
        y3 = sc.nextInt();

        LineCamp lineCamp = new LineCamp();
        lineCamp.lengthLine();
        lineCamp.equalsMethod();
        lineCamp.compareToMethod();



        //equals method

        // compare to method

    }
}
