package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole test = UserRoleFactory.buildUserRole("135", "yebo@yahoo.com", "1");
        assertEquals("135", test.getOrgCode());
        assertEquals("yebo@yahoo.com", test.getUserEmail());
        assertEquals("1", test.getRoleId());
        assertNotNull(test);
    }
}