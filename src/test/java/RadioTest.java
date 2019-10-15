import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio1;
    Station station1;
    Station station2;
    Station station3;

    @Before
    public void before() {
        radio1 = new Radio("Phillips", "CF43");
        station1 = new Station(StationType.RADIO_ONE);
        station2 = new Station(StationType.RADIO_TWO);
        station3 = new Station(StationType.RADIO_THREE);
    }

    @Test
    public void hasMake() {
        assertEquals("Phillips", radio1.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("CF43", radio1.getModel());
    }

    @Test
    public void canTuneIntoStation() {
        assertEquals("You are listening to Radio One", radio1.tune(station1));
    }


}
