cla-utils
---------

General utilities to ease Clarion's quirks.  
Supporting classes include date and time conversion from Clarion to Java and vice-versa.

### Date and Time values
Clarion standard date is the number of days that have elapsed since December 28, 1800. The range of accessible dates is from January 1, 1801 (standard date 4) to December 31, 9999 (standard date 2,994,626).  
Clarion standard time is the number of hundredths of a second that have elapsed since midnight, plus one (1). The valid range is from 1 (defined as midnight) to 8,640,000 (defined as 11:59:59.99 PM).

#### Conversions supported
- Clarion standard date (int) --> java.time.LocalDate
- Clarion standard time (int) --> java.time.LocalTime
- java.time.LocalDate --> Clarion standard date (int)
- java.time.LocalTime --> larion standard time (int)

#### Example code

```java
int clarionDateToday = DateUtils.getValueFromDate(LocalDate.now());
int clarionTimeNow = DateUtils.getValueFromTime(LocalTime.now());
LocalDate dateToday = DateUtils.getDateFromValue(clarionDateToday);
LocalTime timeNow = DateUtils.getTimeFromValue(clarionTimeNow);
```

### License
cla-utils is free and licensed under the [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.en.html).

### Requirements
Requires JDK 1.8 or later.
It depends on the main API for dates, times, instants, and durations (java.time).

### Release
Current latest release is 1.0.  
Available in the [Maven Central repository](https://mvnrepository.com/artifact/tk.trebolsoft.athena/cla-utils/1.0)

**Maven configuration:**
```xml
<dependency>
    <groupId>tk.trebolsoft.athena</groupId>
    <artifactId>cla-utils</artifactId>
    <version>1.0</version>
</dependency>
```

**Gradle configuration:**
```groovy
compile group: 'tk.trebolsoft.athena', name: 'cla-utils', version: '1.0'
```

### Support
Please use GitHub issues and Pull Requests for support.
