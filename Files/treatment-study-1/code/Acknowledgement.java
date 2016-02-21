import Reminder;

public class Acknowledgement {
    final Reminder reminder; //Copy of original reminder object
    int patientid; // Unique ID of Study User
    int acknowledgedbyuser; // 1: Acknowledged, 0: Missed, 2: DeviceOff
    long timetoacknowledge; // Time elapsed before acknowledged
    int batterylevel; // Battery level of device
    int listencount; // Count of listens to audio recording
}
