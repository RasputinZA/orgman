package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race test= RaceFactory.buildRace("Colored");
        assertEquals("Colored", test.getRaceDescription());
        assertNotNull(test.getRaceId());
        assertNotNull(test);
    }
}