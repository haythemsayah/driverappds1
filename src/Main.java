
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String clientPhone = scanner.nextLine();

        Client client = new Client("C001", clientPhone);
        client.setClientName(clientName);

        System.out.println("Enter your address:");
        System.out.print("Street: ");
        String clientStreet = scanner.nextLine();
        System.out.print("City: ");
        String clientCity = scanner.nextLine();
        System.out.print("State: ");
        String clientState = scanner.nextLine();
        System.out.print("Zip Code: ");
        String clientZipCode = scanner.nextLine();

        Address clientAddress = new Address(clientStreet, clientCity, clientState, clientZipCode);
        client.setClientAddress(clientAddress);

        DriverApp driverApp = new DriverApp();
        driverApp.setDriverId("D001");

        Address defaultDriverLocation = new Address("gabessss examlple", "agbes", "gabes", "0000");
        driverApp.setCurrentLocation(defaultDriverLocation);

        System.out.println("Enter your destination address:");
        System.out.print("Street: ");
        String destStreet = scanner.nextLine();
        System.out.print("City: ");
        String destCity = scanner.nextLine();
        System.out.print("State: ");
        String destState = scanner.nextLine();
        System.out.print("Zip Code: ");
        String destZipCode = scanner.nextLine();

        Address destination = new Address(destStreet, destCity, destState, destZipCode);
        driverApp.setDestination(destination);

        driverApp.notifyArrivalTime();

        driverApp.startTrip();

        driverApp.completeTrip();

        scanner.close();
    }
}