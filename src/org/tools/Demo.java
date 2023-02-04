package org.tools;

import java.util.Scanner;


public class Demo {
    public static void createArmy() {
        Unit unit = new Unit("Ad1");
        Unit anit = new Unit("Ad2");
        Unit bnit = new Unit("Ad3");
        Unit cnit = new Unit("Ad4");
        Unit dnit = new Unit("Ad5");
        Knight knight = new Knight("B1");
        Knight anight = new Knight("B2");
        General general = new General("C");
        Doctor doctor = new Doctor("D");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;
        }
    }

    public static void main(String[] args) {
      Brush brus = new Brush();
      brus.line();
        /*Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(d==0){
            System.out.println("Division by zero!");
            System.exit(0);
        }
        if(b + c ==0){
            System.out.println("Division by zero!");
            System.exit(0);
        }

        int result = a / ((b + c) / d);

        System.out.println(result);
        */

    }

}
