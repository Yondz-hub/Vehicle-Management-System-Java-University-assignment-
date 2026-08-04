/**
 * This class manages all water tanks in the system.
 * It allows adding, displaying, and searching tanks.
 */

public class MMSystem {
    private WaterTank[] tanks;
    private int tankCount;

public MMSystem() {
    tanks = new WaterTank[50]; //choose the size
    tankCount = 0;
}


public int getTankCount() {
    return tankCount;
}

//Adds a new tank to the system
public void addTank(WaterTank tank) {
    tanks[tankCount] = tank;
    tankCount++;
}

//Displays the number of tanks 
public void displayTanks() {
   if (tankCount == 0) {
    System.out.println("No assigned tanks.");
    return;
}
    for (int i = 0; i< tankCount; i++) {
        System.out.println(tanks[i]);
        System.out.println("-----------");
    }
}

//Searches for a tank using its ID
//@param id the tank ID to search
 //@return the WaterTank object if found, otherwise display null
public WaterTank findTankByID(String id) {
    for(int i = 0; i <tankCount; i++) {
        if (tanks[i].getTankID().equals(id)) {
            return tanks[i];
        }
    }
    return null;
}
}
