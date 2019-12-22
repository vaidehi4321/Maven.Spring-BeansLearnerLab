package com.example.demo.config;

import com.example.demo.models.Classroom;
import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Students students,Instructors instructors ) {
        return new Classroom( students,instructors);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort( Students previousStudents ,Instructors instructors) {
        return new Classroom( previousStudents,instructors);
    }
}
