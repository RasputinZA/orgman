package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender test= GenderFactory.buildGender("Male");
        assertEquals("Male", test.getGenderDescription());
        assertNotNull(test.getGenderId());
        assertNotNull(test);
    }
}