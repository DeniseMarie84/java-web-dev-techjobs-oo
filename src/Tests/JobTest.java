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


    @Before
    public void createJobObject(){
        test_job= new Job();
        test_job2= new Job();
        test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job.getId() + 1 == test_job2.getId());
        assertEquals(test_job.getId(), test_job2.getId() - test_job.getId(), 1);
        assertFalse(test_job2.getId() <= test_job.getId());
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
}
