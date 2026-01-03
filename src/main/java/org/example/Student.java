package org.example;

public class Student {
    private String name;
    private double grade;
    private int daysAbsent;

    public Student(String name, double grade, int daysAbsent) {
        this.name = name;
        this.grade = grade;
        this.daysAbsent = daysAbsent;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }

    public void addAbsence() {
        this.daysAbsent++;
    }

    public void addBonusPoints(double bonusPoints) {
        this.grade += bonusPoints;
    }
}
