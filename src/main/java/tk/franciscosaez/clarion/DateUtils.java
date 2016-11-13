package tk.franciscosaez.clarion;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.LocalTime.MIDNIGHT;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 * DateUtils class provides several static methods to convert
 * date and time from Clarion to Java 8 LocalDate / LocalTime
 * and vice versa.
 * @author Francisco Saez
 */
public final class DateUtils {
    private static final long DAYS_OFFSET = 61730L;

    private DateUtils() {
    }

    /**
     * Obtains an instance of {@code LocalDate} from a given Clarion date value.
     * @param clarionDate the value of Clarion date
     * @return the local date, not null
     */
    public static LocalDate getDateFromValue(int clarionDate) {
        return LocalDate.ofEpochDay(clarionDate - DAYS_OFFSET);
    }

    /**
     * Gets the equivalent Clarion date from a {@code LocalDate} as an {@code int}
     * @param date an instance of {@code LocalDate}
     * @return the value of Clarion date
     */
    public static int getValueFromDate(LocalDate date) {
        return (int) (date.toEpochDay() + DAYS_OFFSET);
    }

    /**
     * Obtains an instance of {@code LocalTime} from a given Clarion time value.
     * @param clarionTime the value of Clarion time
     * @return the local time, not null
     */
    public static LocalTime getTimeFromValue(int clarionTime) {
        return LocalTime.ofSecondOfDay((clarionTime - 1) / 100);
    }

    /**
     * Gets the equivalent Clarion time from a {@code LocalTime} as an {@code int}
     * @param time an instance of {@code LocalTime}
     * @return the value of Clarion time
     */
    public static int getValueFromTime(LocalTime time) {
        return (int) (SECONDS.between(MIDNIGHT, time) * 100 + 1);
    }
}
