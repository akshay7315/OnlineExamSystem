import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reservation {
    private String guestName;
    private String reservationDate;

    public Reservation(String guestName, String reservationDate) {
        this.guestName = guestName;
        this.reservationDate = reservationDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation [Guest Name: " + guestName + ", Reservation Date: " + reservationDate + "]";
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void makeReservation(String guestName, String reservationDate) {
        Reservation reservation = new Reservation(guestName, reservationDate);
        reservations.add(reservation);
    }

    public void listReservations() {
        System.out.println("List of Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();

        while (true) {
            System.out.println("\nOnline Reservation System Menu:");
            System.out.println("1. Make a Reservation");
            System.out.println("2. List Reservations");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Guest Name: ");
                    String guestName = scanner.nextLine();
                    System.out.print("Enter Reservation Date: ");
                    String reservationDate = scanner.nextLine();
                    reservationSystem.makeReservation(guestName, reservationDate);
                    System.out.println("Reservation made successfully!");
                    break;
                case 2:
                    reservationSystem.listReservations();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
s