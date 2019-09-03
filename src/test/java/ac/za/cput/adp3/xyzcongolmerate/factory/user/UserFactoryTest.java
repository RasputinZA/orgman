package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        User test= UserFactory.buildUser("val@cput.ac.za", "Valeirie", "Makarov");
        assertEquals("val@cput.ac.za", test.getUserEmail());
        assertEquals("Valeirie", test.getFirstName());
        assertEquals("Makarov", test.getLastName());
        assertNotNull(test);
    }
}