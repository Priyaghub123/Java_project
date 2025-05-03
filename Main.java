import java.util.*;

public class Main {
    public static void main(String[] args) {
        TrainService.loadDummyTrains();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Dummy Train Booking App ---");
            System.out.println("1. View Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    TrainService.displayTrains();
                    break;
                case 2:
                    BookingService.bookTicket(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using the app.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
