import java.util.TreeMap;

/**
 * Calendar is a data object that keeps track of events. It may retrieve, delete, filter tagged
 * events.
 */
public class Calendar {
  private TreeMap<Date, Event> events;

  /**
   * Constructor for Calendar Object.
   */
  public Calendar() {
    this.events = new TreeMap<Date, Event>();
  }

  /**
   * Copy Constructor for Calendar Object.
   * @param altCalendar
   */
  public Calendar(Calendar altCalendar) {
    this.events = new TreeMap<Date, Event>();
    // For Loop Required
  }

  /**
   * Getter for event in events variable for Calendar Object.
   */
  public Event getEventOn(Date someDate) {
    return null;
  }
}
