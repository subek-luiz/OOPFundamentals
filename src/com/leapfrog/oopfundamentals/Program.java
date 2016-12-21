/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopfundamentals;

import java.util.Scanner;

/**
 *
 * @author luiz
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter marks for English");
            int english = input.nextInt();
            int max = english, min = english;
            System.out.println("Enter marks for Nepali");
            int nepali = input.nextInt();
            if (max < nepali) {
                max = nepali;
            }
            if (min > nepali) {
                min = nepali;
            }
            System.out.println("Enter marks for Maths");
            int maths = input.nextInt();
            if (max < maths) {
                max = maths;
            }
            if (min > maths) {
                min = maths;
            }
            System.out.println("Enter marks for Science");
            int science = input.nextInt();
            if (max < science) {
                max = science;
            }
            if (min > science) {
                min = science;
            }
            System.out.println("Enter marks for Computer");
            int computer = input.nextInt();
            if (max < computer) {
                max = computer;
            }
            if (min > computer) {
                min = computer;
            }

            if (english < 32 || nepali < 32 || maths < 32 || science < 32 || computer < 32) {
                System.out.println("Sorry You are fail");
            } else {
                int total = english + nepali + maths + science + computer;
                System.out.println("your total marks is " + total);
                float percentage = total / 5;
                System.out.println("your percentage is " + percentage + "%");
                if (percentage >= 80) {
                    System.out.println("Congratulation you passed in Distinction");
                } else if (percentage >= 65) {
                    System.out.println("Congratulation you passed in First Division");
                } else if (percentage >= 50) {
                    System.out.println("Congratulation you passed in Second Division");
                } else {
                    System.out.println("Congratulation you passed in Third Division");
                }
            }
            System.out.println("maximum marks " + max);
            System.out.println("minimum marks " + min);
            System.out.println("Do you want to check for another student[0/1]");
            if (input.nextInt() == 0) {
                System.exit(0);
            }

        }

    }

}
