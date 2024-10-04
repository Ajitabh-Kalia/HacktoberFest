// EmailNotification that implements the notification interface to send notifications through email
public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
        // Add logic to send email
    }
}

