/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.assignment2.util;

import java.util.Scanner;

/**
 *
 * @author UsEr
 */
public class Marksheet {

    int passMarks = 32;
    String[] subjects;
    String[] students;
    double[][] marks;
    double t;
    double total = 0;
    Scanner input = new Scanner(System.in);

    public Marksheet(String[] subjects, String[] students, Scanner input) {
        this.subjects = subjects;
        this.students = students;
        marks = new double[this.students.length][this.subjects.length];

    }

    public void entry() {
        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j]);

            for (int i = 0; i < subjects.length; i++) {
                System.out.println("Enter marks for " + subjects[i]);
                marks[j][i] = input.nextDouble();
                total += marks[j][i];
                if (marks[j][i] >passMarks) {
                    
                
                    t = total / (subjects.length);
                }else{
                    t=0;
                }

            }

        

        System.out.println("The total of " + students[j] + " " + total);
        System.out.println("The percentage is:" + " " + t);

        total = 0;

    }

}

//    public double getTotal(int i) {
//        double total = 0;
//        for (int j = 0; j < subjects.length; j++) {
//            
//        }
//        return total;
//
//    }
public boolean isFail() {
        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < subjects.length; i++) {
                if (marks[j][i] < passMarks) {
                    return true;
                }
            }
        }
        return false;
    }

    public double getPercentage() {
        return (total / (subjects.length));

    }

    public String getGrade() {
        String grade;
        double percentage = getPercentage();
        if (percentage >= 80 && percentage <= 100) {
            grade = "distinction";
        } else if (percentage >= 60 && percentage <= 80) {
            grade = "first division";
        } else if (percentage >= 45 && percentage <= 60) {
            grade = "second division";
        } else if (percentage >= 32 && percentage <= 45) {
            grade = "third division";
        } else {
            grade = "fail";
        }
        return grade;

    }
}
