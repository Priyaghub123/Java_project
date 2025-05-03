import java.util.*;

public class BookingService {
    public static void bookTicket(Scanner sc) {
        System.out.print("Enter Train Number to book: ");
        int trainNo = sc.nextInt();
        sc.nextLine();
        Train train = TrainService.findTrain(trainNo);

        if (train == null) {
            System.out.println("Train not found.");
            return;
        }

        if (train.seats <= 0) {
            System.out.println("No seats available.");
            return;
        }

        System.out.print("Enter number of tickets to book: ");
        int ticketCount = sc.nextInt();
        sc.nextLine();

        if (ticketCount > train.seats) {
            System.out.println("Only " + train.seats + " seats are available.");
            return;
        }

        for (int i = 1; i <= ticketCount; i++) {
            System.out.println("\nBooking Passenger " + i + ":");

            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            train.seats--;

            String ticket = "\n--- TICKET " + i + " ---\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Train: " + train.name + " (" + train.trainNo + ")\n" +
                    "Route: " + train.from + " to " + train.to + "\n" +
                    "Time: " + train.time + "\n" +
                    "Seat Confirmed. Remaining: " + train.seats + "\n";

            System.out.println(ticket);
        }
    }
}
