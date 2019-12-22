package com.example.demo.models;

import com.example.demo.repositories.Learner;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
