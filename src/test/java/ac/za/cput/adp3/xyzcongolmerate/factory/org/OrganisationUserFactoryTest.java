package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser test= OrganisationUserFactory.buildOrganisationUser("135", "henry@cput.ac.za");
        assertEquals("135", test.getOrgCode());
        assertEquals("henry@cput.ac.za", test.getUserEmail());
        assertNotNull(test);
    }
}