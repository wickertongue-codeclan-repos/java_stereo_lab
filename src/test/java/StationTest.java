import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationTest {
    private Station station1;

    @Before
    public void before() {
        station1 = new Station(StationType.RADIO_ONE);
    }

    @Test
    public void hasStationType() {
        assertEquals(StationType.RADIO_ONE, station1.getStationType());
    }

    @Test
    public void canGetWelcomeMessage() {
        assertEquals("You are listening to Radio One", station1.getWelcomeMessage());
    }

}
