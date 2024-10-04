// Client side code that uses the factory class to decide the subclass to be instantiated during runtime based on user preference
public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        // Let's assume user selected "email" for notifications
        Notification notification = notificationFactory.createNotification("email");
        notification.sendNotification("Your order has been shipped!");

        // If user selects "sms" for notifications
        Notification smsNotification = notificationFactory.createNotification("sms");
        smsNotification.sendNotification("Your package will arrive tomorrow.");

        // If user selects "push" for notifications
        Notification pushNotification = notificationFactory.createNotification("push");
        pushNotification.sendNotification("You have a new message!");
    }
}
