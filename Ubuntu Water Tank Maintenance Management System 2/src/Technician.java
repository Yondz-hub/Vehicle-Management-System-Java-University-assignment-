/**
 * This class represents a Technician.
 * It manages assigned water tanks and technician details.
 */

public class Technician {
    
    private String name;
    private String technicianID;
    private WaterTank[] assignedTanks;
    private int assignedTankCount;


public Technician(String name, String technicianID) {
    this.name = name;
    this.technicianID = technicianID;
    this.assignedTanks = new WaterTank[10]; // max 10 tanks
    this.assignedTankCount = 0;
}

//Returns the name of the technician
public String getName() {
    return name;
    
}

//Returns the technicianID
public String getTechnicianID() {
    return technicianID;
}

public void assignTank(WaterTank tank) {
        if (!tank.isAssigned() && assignedTankCount < 10) {
            assignedTanks[assignedTankCount] = tank;
            assignedTankCount++;
            tank.setAssigned(true);
            System.out.println("Tank assigned successfully.");
        } else {
            System.out.println("Cannot assign tank.");
        }
    }

    public void displayAssignedTanks() {
       if (assignedTankCount == 0) {
    System.out.println("No assigned tanks.");
    return;
}
        for (int i = 0; i < assignedTankCount; i++) {
            System.out.println(assignedTanks[i]);
            System.out.println("-----------");
        }
    }


@Override
public String toString() {
    return "Technician Name:" + name +
           "\nTechnician ID:" + technicianID +
            "\nAssigned Tanks:" + assignedTankCount;
}
}