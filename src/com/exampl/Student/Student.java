
package com.exampl.Student;

public class Student {
    private int numberCourse;
    private String nameStudent;
    private int numberOfRatings;


    private Student(int numberCourse, String nameStudent, int numberOfRatings) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
        this.numberOfRatings = numberOfRatings;
    }

    private void show() {
        System.out.println(" Имя " + nameStudent + " номер курса " + numberCourse);
    }

    private int srBall(int numberOfRatings) {
        int srb = 0;
        int[] ball = new int[numberOfRatings];
        for (int i = 0; i < numberOfRatings; i++) {
            ball[i] = (int) (Math.random() * 10);
            srb = srb + ball[i];
        }
        return srb / numberOfRatings;
    }


    public static void main(String[] args) {
        Student ivanow = new Student(3, "Ivan", 30);
        Student petrow = new Student(4, "Pawel", 40);
        petrow.show();
        ivanow.show();
        System.out.println("ivanow " + ivanow.nameStudent + " Учится на " + ivanow.numberCourse + " курсе, средний бал" + ivanow.srBall(30));
        System.out.println("Petrov " + petrow.nameStudent + " Учится на " + petrow.numberCourse + " курсе средний бал" + petrow.srBall(30));
    }
}