import java.util.Scanner;

/**
 * This is the main class that runs the program.
 * It provides a menu for user interaction.
 */

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
MMSystem system = new MMSystem();
Technician tech1 = new Technician("John", "TECH001");
    
 int choice;
 // Loop to keep the program running until the user exits
 do {
     System.out.println("\n-- Menu ---");
     System.out.println("1. Add new tank");
     System.out.println("2. View all tanks");
     System.out.println("3. Assign tank to technician");
     System.out.println("4. View assigned tanks");
     System.out.println("0. Exit");
     System.out.print("Enter choice:");
     
     //Get user choice
     choice = scanner.nextInt();
     scanner.nextLine(); // gives a clear buffer
     
     // Handles user selection
 switch (choice) {
     case 1: 
         addNewTank(system,scanner);
         break;
     case 2:
         displayTanks(system);
         break;
     case 3:
         assignTank(system,tech1, scanner);
         break;
     case 4:
         displayAssignedTanks(tech1);
         break;
     case 0:
         System.out.println("Existing...");
         break;
     default:
         System.out.println("Invalid choice.");
 }
 } while (choice != 0);
 }
 
 // METHODS
public static void addNewTank(MMSystem system, Scanner scanner) {

        System.out.print("Enter tank name: ");
        String name = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter tank ID: ");
        String id = scanner.nextLine();

        //Check if tank already exists
        if (system.findTankByID(id) != null) {
            System.out.println("Tank ID already exists!");
            return;
        }

        WaterTank tank = new WaterTank(name, location, id, true, false);
        system.addTank(tank);

        System.out.println("Tank added successfully.");
    }

//Displays all tanks in the system
    public static void displayTanks(MMSystem system) {
        system.displayTanks();
    }
    
    //Assigns a tank to a technician
public static void assignTank(MMSystem system, Technician tech, Scanner scanner) {

        System.out.print("Enter tank ID to assign: ");
        String id = scanner.nextLine();

        WaterTank tank = system.findTankByID(id);

        if (tank == null) {
               System.out.println("Tank not found.");
               return;
        }
        //Prevents assigning an already assigned tank
        if (tank.isAssigned()) {
            System.out.println("Tank is already assigned.");
            return;
        }
        tech.assignTank(tank);
    }

//Displays all tanks assigned to the technician
    public static void displayAssignedTanks(Technician tech) {
        tech.displayAssignedTanks();
    }
}

