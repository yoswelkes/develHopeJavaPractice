
// Extending Person class to create Manager class
public class Manager extends Person {
    // Fields for Manager class
    private int managerID;
    private int actionNumber;

    // Constructor
    public Manager(String name, int age, String username, String password) {
        // Call the constructor of the Person class
        super(name, age, username, password);
        // Generate unique managerID and set actionNumber to 0
        this.managerID = 1 + (int)(Math.random() * ((1000000 - 1) + 1)); // Auto-generate managerID
        this.actionNumber = 0; // Set actionNumber to 0 in constructor
    }

    // Getter for actionNumber
    public int getActionNumber() {
        return actionNumber;
    }

    // Setter for actionNumber
    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    // Getter for managerID
    public int getManagerID() {
        return managerID;
    }

    // Override toString method to include managerID
    @Override
    public String toString() {
        return super.toString() + ", ManagerID: " + managerID;
    }

    @Override
    public boolean equals(Object obj){
        boolean retVal = false;
        try{
            Manager managerToCompare = (Manager) obj;

            if (super.equals(managerToCompare)
                    || ((this.managerID == managerToCompare.managerID) && this.getPassword().equals(managerToCompare.getPassword())))
                retVal = true;

        }
        catch (Exception e){}

        return retVal;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Manager manager1 = new Manager("Simba", 45, "simbaManager", "securePass123");
        Manager manager2 = new Manager("Cleopatra", 50, "cleopatraManager", "securePass321");

        // Testing toString method
        System.out.println(manager1); // Output: Name: Simba, Age: 45, ManagerID: <some-UUID>
        System.out.println(manager2); // Output: Name: Cleopatra, Age: 50, ManagerID: <some-UUID>

        // Testing equals method
        System.out.println(manager1.equals(manager2)); // Output: false

        // Update action number
        manager1.setActionNumber(10);
        System.out.println("Action Number of " + manager1.getName() + ": " + manager1.getActionNumber()); // Output: 10
    }
}
