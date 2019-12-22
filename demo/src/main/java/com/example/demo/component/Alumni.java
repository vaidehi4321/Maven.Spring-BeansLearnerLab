package com.example.demo.component;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;
    private Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    public Alumni(Students previousStudents, Instructors instructors) {
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }
    @PostConstruct
    public void executeBootcamp(){
        for(Instructor instructor :instructors){
            instructor.lecture(students, (1200.0 * students.size()) / instructors.size());
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
