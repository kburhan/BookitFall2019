package com.bookit.units;
import com.bookit.utilities.APIUtilities;
import com.bookit.utilities.Environment;
import com.sun.tools.xjc.model.nav.EagerNClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class with unit tests for APIUtilities class
 * Here we ensure that utilities work fine before using hem in action
 */
public class APIUtilitiesUnitTests {


    @Test
    public void getTokenTest(){
        String token = APIUtilities.getToken();
        String tokenForStudent = APIUtilities.getToken("student");
        String tokenForTeacher = APIUtilities.getToken("teacher");

        Assert.assertNotNull(token);
        Assert.assertNotNull(tokenForStudent);
        Assert.assertNotNull(tokenForTeacher);
    }

    @Test
    public void testIfUserExists(){
        int actual = APIUtilities.getUserID("thereisnoemaillikethis@email.com", "123123");
        Assert.assertEquals(-1, actual);

        int actual2 = APIUtilities.getUserID(Environment.MEMBER_USERNAME, Environment.MEMBER_PASSWORD);
        Assert.assertTrue(actual2 >0);
    }
}