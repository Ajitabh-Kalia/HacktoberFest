// SMSNotification to implement notification so that the notification is sent through SMS
public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
        // Add logic to send SMS
    }
}
