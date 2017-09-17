package tk.trebolsoft.athena.clarion;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

public class DateUtilsTest {
    private static final int MARCH_13_2001 = 73124;
    private static final int TEN_PAST_FIVE = 6180001;

    @Test
    public void shouldGetCorrectDateFromGivenClarionValue() throws Exception {
        assertEquals(LocalDate.of(2001, 3, 13), DateUtils.getDateFromValue(MARCH_13_2001));
    }

    @Test
    public void shouldGetCorrectClarionValueFromGivenDate() throws Exception {
        assertEquals(MARCH_13_2001, DateUtils.getValueFromDate(LocalDate.of(2001, 3, 13)));
    }

    @Test
    public void shouldGetCorrectTimeFromGivenClarionValue() throws Exception {
        assertEquals(LocalTime.of(17, 10), DateUtils.getTimeFromValue(TEN_PAST_FIVE));
    }

    @Test
    public void shouldGetCorrectClarionValueFromGivenTime() throws Exception {
        assertEquals(TEN_PAST_FIVE, DateUtils.getValueFromTime(LocalTime.of(17, 10)));
    }
}