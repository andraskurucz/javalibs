import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalendarImplTest {

    CalendarImpl calendar;

    @Before
    public void setUp() throws Exception {
        calendar = new CalendarImpl();
    }

    @Test
    public void getDate() {
        String expectedDate = "Today";
        String actualDate = calendar.getDate();
        assertEquals(expectedDate, actualDate);
    }
}