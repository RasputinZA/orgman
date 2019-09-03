package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role test= RoleFactory.buildRole("leader");
        assertEquals("leader", test.getRoleName());
        assertNotNull(test.getRoleId());
        assertNotNull(test);
    }
}