import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteDeckTest {
    CassetteDeck cassetteDeck1;

    @Before
    public void before() {
        cassetteDeck1 = new CassetteDeck("Panasonic", "FT400", 3);
    }

    @Test
    public void canGetCasetteNumber() {
        assertEquals(3, cassetteDeck1.getCassetteNumber());
    }
}
