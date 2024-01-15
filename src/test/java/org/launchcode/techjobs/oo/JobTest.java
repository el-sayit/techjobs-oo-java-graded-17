package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here
       
    @Test
    public void testSettingJobId(){
        Job job1 =new Job();
        Job job2 =new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME",newJob.getEmployer().getValue());
        assertEquals("Desert", newJob.getLocation().getValue());
        assertEquals("Quality control", newJob.getPositionType().getValue());
        assertEquals("Persistence", newJob.getCoreCompetency().getValue());

        assertTrue(newJob instanceof Job);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
       String newLine = System.lineSeparator();
       Job newJob = new Job();
       String expected ="\n" +
               "ID: "+newJob.getId() + "\n" +
               "Name: Data not available" + "\n" +
               "Employer: Data not available" + "\n" +
               "Location: Data not available" + "\n" +
               "Position Type: Data not available" + "\n" +
               "Core Competency: Data not available" + "\n";
       assertEquals(expected, newJob.toString());
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String newLine = System.lineSeparator();
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\n" +
                "ID: "+newJob.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n";
        assertEquals(expected, newJob.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        String newLine = System.lineSeparator();
        Job newJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = "\n" +
                "ID: "+newJob.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n";
        assertEquals(expected,newJob.toString());
    }



}
