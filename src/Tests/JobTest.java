package Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job what_job;


    @Before
    public void createJobObject(){
        test_job= new Job();
        test_job2= new Job();
        test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        what_job= new Job("Coffee Drinker", new Employer(""), new Location("Home"),
                new PositionType("Programmer"), new CoreCompetency("Tastebuds"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job.getId(), test_job2.getId() - test_job.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
    assertEquals(test_job3.getName(), "Product tester");
    assertEquals(test_job3.getEmployer().getValue(), "ACME");
    assertEquals(test_job3.getLocation().getValue(), "Desert");
    assertEquals(test_job3.getPositionType().getValue(), "Quality control");
    assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    assertEquals(test_job3 instanceof Job, true);
    assertTrue(test_job3 instanceof  Job);
    }

    @Test
    public void testJobForEquality(){
    assertEquals(test_job3.equals(test_job4),false);
    }

    @Test
    public void testJobString(){
        assertEquals(what_job.toString().startsWith("\n"), true);
        assertEquals(test_job3.toString().endsWith("\n"), true);
    }

    @Test
    public void noBlankValues() {
        assertEquals(what_job.toString(),   "\n" +
                "ID: 5\n" +
                "Name: Coffee Drinker\n" +
                "Employer: Data not available\n" +
                "Location: Home\n" +
                "Position Type: Programmer\n" +
                "Core Competency: Tastebuds\n" + "\n" );
        System.out.println(what_job.toString());
    }
}
