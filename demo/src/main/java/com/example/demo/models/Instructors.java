package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor> {
    public Instructors() {
        super(new ArrayList<>());
    }

    public Instructors(List<Instructor> instructors) {
        super(instructors);
    }
}
