import java.util.*;

public class TrainService {
    static List<Train> trainList = new ArrayList<>();

    public static void loadDummyTrains() {
        trainList.add(new Train(101, "Express One", "CityA", "CityB", "10:00", 5));
        trainList.add(new Train(102, "Express Two", "CityC", "CityD", "12:30", 3));
        trainList.add(new Train(103, "SuperFast", "CityA", "CityD", "15:00", 2));
    }

    public static void displayTrains() {
        System.out.printf("%-8s %-15s %-10s %-10s %-10s %-6s\n", "TrainNo", "Name", "From", "To", "Time", "Seats");
        for (Train t : trainList) {
            System.out.printf("%-8d %-15s %-10s %-10s %-10s %-6d\n",
                    t.trainNo, t.name, t.from, t.to, t.time, t.seats);
        }
    }

    public static Train findTrain(int trainNo) {
        for (Train t : trainList) {
            if (t.trainNo == trainNo) return t;
        }
        return null;
    }
}
