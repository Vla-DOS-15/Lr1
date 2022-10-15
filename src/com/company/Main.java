package com.company;

public class Main {
    //Task #1
    static void TaskOne(){
        double m=2, c=-1, t=1.2, b=0.7;

        double f = Math.cbrt(m *t* Math.tan(t) + Math.abs(c * Math.sin(t)));
        System.out.println("f = " + f);


        double z = m * Math.cos(b * t * Math.sin(t)) + c;
        System.out.println("z = " + z);
    }

    // Task #2
    static void TaskTwo(){
        double a = 5.9;
        double b = 6.1;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double p = a + b + c;
        double s = a * b / 2;
        System.out.println("S = " + s);
    }

    public static void main(String[] args) {
        TaskOne();
        TaskTwo();
    }
}
