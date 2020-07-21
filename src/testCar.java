
import java.util.Scanner;

public class testCar {

    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType object
        carType[] types = {new carType("Toyota", "Vios", 1.5), new carType("Nissan", "Teana", 2.0), new carType("Honda", "City", 1.6)};
        //todo:: create an array that will able to store 6 registrations
        carRegistration[] registration = new carRegistration[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < registration.length; ++i) {

            System.out.println("\nRegistration number: " + carRegistration.currentRegNo);

            //todo:: request and read the owner detail
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("IC No: ");
            String ic = scanner.nextLine();

            //construct owner object
            owner owner = new owner(name, ic);
            //todo:: request and read car detail
            System.out.print("Enter Car plate Number: ");
            String plate = scanner.nextLine();
            System.out.print("Enter Car color: ");
            String color = scanner.nextLine();
            System.out.print("Enter Car year: ");
            int year = scanner.nextInt();
            System.out.println("\nCar Types: ");

            //todo:: display all available carType
            for (int j = 0; j < types.length; j++) {
                System.out.println((j + 1) + "." + types[j].toString());
            }

            System.out.print("\nSelect car type [1.." + types.length + "]: ");
            int selection = scanner.nextInt();
            car car = new car(plate, color, year, types[selection - 1]);
            //todo:: get cartype from array (based on selection)

            //todo:: register the car
            registration[i] = new carRegistration(owner, car);

            scanner.nextLine();
        }
        displayListing(registration);
        //todo:: display all registration detail

    }

    public static void displayListing(carRegistration[] regArr) {
        System.out.printf("\n\n%50s\n", "Car Registration Listing");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n",
                "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for (int i = 0; i < regArr.length; ++i) {
            System.out.println(regArr[i]);
        }
    }
}
