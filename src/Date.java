import java.util.Objects;

/**
 * Date is a Data Object consisting of minutes, hours, days, months and years. Date is comparable
 * with other dates.
 */
public class Date implements Comparable<Date> {
  private final int minutes;
  private final int hours;
  private final int days;
  private final int months;
  private final int years;

  /**
   * Private Constructor for Date.
   * @param minutes
   * @param hours
   * @param days
   * @param months
   * @param years
   */
  public Date(int minutes, int hours, int days, int months, int years) {
    if (minutes > 60 || minutes < 0) {
      throw new IllegalArgumentException("Invalid Minutes Value");
    }
    if (hours > 24 || hours < 0) {
      throw new IllegalArgumentException("Invalid Hours Value");
    }
    this.minutes = minutes;
    this.hours = hours;
    this.days = days;
    this.months = months;
    this.years = years;
  }

  // Check for validity

  /**
   * Converts day to number of minutes (roughly)
   * @return
   */
  public long getValue() {
    return this.years * 16338240 + this.months * 44640 + this.days * 1440 + this.hours * 60 +
            this.minutes;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Date) {
      Date d = (Date) o;
      if (this.minutes == d.minutes && this.hours == d.hours && this.days == d.days
              && this.months == d.months && this.years == d.years) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.minutes, this.hours, this.days, this.months,
            this.years);
  }

  @Override
  public int compareTo(Date d) {
    return (int) (this.getValue() - d.getValue());
  }
}
