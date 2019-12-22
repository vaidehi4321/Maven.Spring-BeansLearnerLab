package com.example.demo.config;

import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentsConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        Student student1 = new Student(1L, "minal");
        Student student2 = new Student(2L, "manasi");
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);

        return new Students(allStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        Student studentC = new Student(3L, "veena");
        Student studentD = new Student(4L, "reena");
        Student studentE = new Student(5L, "madhu");

        List<Student> prevStudents = new ArrayList<>();
        prevStudents.add(studentC);
        prevStudents.add(studentD);
        prevStudents.add(studentE);

        return new Students(prevStudents);
    }
}
