public class Reminder {
    String format; // Voice or Text
    String time; // Formatted as
    String date; // Formatted as ISO
    long unixtime; // Number of milliseconds since 1970-01-01
    String dayofweek; // Mon-Sun
    String type; // ADL Type
    String description; // Text displayed to user
    int repeatfreq; // 0: Never, 1: Daily, 2:Weekly, 3:Monthly
    String createdby; // User or Carer
    int createdbyid; // Unique ID of User/Carer
    int active; // 1: Active, 0: Disabled
    String audiofilepath; // Path of audio on local storage
    long audioduration; // Duration of audio in milliseconds
}
