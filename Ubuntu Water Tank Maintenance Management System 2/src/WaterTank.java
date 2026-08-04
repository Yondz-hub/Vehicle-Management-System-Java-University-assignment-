/**
 * This class represents a Water Tank in the system.
 * It stores tank details such as name, location, ID,
 * operational status, and assignment status.
 * 
 * @author Yonnie
 */
public class WaterTank {

    // ATTRIBUTES
    
    // Name of tank
    private String tankName;
    
    //Location of tank
    private String location;
    
    //Unique tank ID
    private String tankID;
    
    //Shows if tank is operational
    private boolean isOperational;
    
    //Shows if tank is assigned
    private boolean isAssigned;

    // CONSTRUCTOR to start to watertank object
    public WaterTank(String tankName, String location, String tankID, boolean isOperational, boolean isAssigned) {
        this.tankName = tankName;
        this.location = location;
        this.tankID = tankID;
        this.isOperational = isOperational;
        this.isAssigned = isAssigned;
    }

    // GETTERS
    //Returns the tank name
    public String getTankName() {
        return tankName;
    }

    //Returns the location
    public String getLocation() {
        return location;
    }
    
//Returns the tank id
    public String getTankID() {
        return tankID;
    }

    //Shows if it's operantional 
    public boolean isOperational() {
        return isOperational;
    }

    //Shows if it has been assigned
    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean isAssigned) {
    this.isAssigned = isAssigned;
}
    // TOSTRING
    @Override
    public String toString() {
        return "Tank Name: " + tankName +
               "\nLocation: " + location +
               "\nTank ID: " + tankID +
               "\nOperational: " + isOperational +
               "\nAssigned: " + isAssigned;
    }
}
