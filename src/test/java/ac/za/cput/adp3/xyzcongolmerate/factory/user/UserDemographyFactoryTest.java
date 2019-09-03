package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography test= UserDemographyFactory.buildUserDemography("yebo@yahoo.com","Mr", "1", "1", new Date());
        assertEquals("yebo@yahoo.com", test.getUserEmail());
        assertEquals("Mr", test.getUserTitle());
        assertEquals("1", test.getGenderId());
        assertEquals("1", test.getRaceId());
        assertNotNull(test);
    }
}