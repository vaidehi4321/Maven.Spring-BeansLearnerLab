package com.example.demo.models;

import com.example.demo.repositories.Learner;
import com.example.demo.repositories.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
    for(Learner learner : learners){
        learner.learn(numberOfHours);
    }
    }
}
