package com.student;

public class StudentApp {
    public static void main(String[] args) {
        int marks1 = 70;
        int marks2 = 85;
        int marks3 = 90;

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Student Result Calculator Build Successful!");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
