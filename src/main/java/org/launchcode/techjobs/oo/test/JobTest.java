package org.launchcode.techjobs.oo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){ // Test the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId() - job2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){ // Test the class and value of each field
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job1.getName() instanceof String);
        assertEquals(job1.getName(), "Product tester" );

        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().getValue() ,"ACME");

        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().getValue(), "Desert");

        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().getValue() ,"Quality control");

        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){ // Test to check that the Id's are not the same
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', job1.toString().charAt(0)); // Test first character is a newline
        assertEquals('\n', job1.toString().charAt(job1.toString().length()-1)); // Test last character is a newline
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringExpected = "\nID: " +  job1.getId() +"\n" +
                                        "Name: " + "Product tester\n" +
                                        "Employer: " + "ACME\n" +
                                        "Location: " + "Desert\n" +
                                        "Position Type: " + "Quality control\n" +
                                        "Core Competency: " + "Persistence\n";
        assertEquals(toStringExpected, job1.toString());
    }



}
