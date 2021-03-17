package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of day from 1 to 31");
        int month = scanner.nextInt();
        System.out.println("Insert number of year from 1 to 9999");
        int year = scanner.nextInt();

        System.out.println(getDaysInMonth(month,year));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999){
                switch (month){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        if (!isLeapYear(year)){
                            return 28;
                        }else return 29;

                }

            }else return -1;
        }
    public static boolean isLeapYear(int year){

        if (year < 1 || year >= 9999){
            return false;
        }else return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

}



