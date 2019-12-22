package com.example.demo.testConfig;

import com.example.demo.models.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;
    @Test
    public void currentCohort() {
        Assert.assertTrue(currentCohort.getInstructors().findById(2L).getName().equals("Roger"));
        Assert.assertTrue(currentCohort.getStudents().findById(2L).getName().equals("manasi"));
    }

    @Test
    public void previousCohort() {
        Assert.assertTrue(previousCohort.getInstructors().findById(2L).getName().equals("Roger"));
        Assert.assertTrue(previousCohort.getStudents().findById(3L).getName().equals("veena"));
    }


}
