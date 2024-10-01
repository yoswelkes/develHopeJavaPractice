
public class Customer extends Person{
    private int customerID;
    private double balance;

    // Constructor
    public Customer(String name, int age, String username, String password, double balance) {
        // Call the constructor of the Person class
        super(name, age, username, password);
        this.customerID = 1 + (int)(Math.random() * ((1000000 - 1) + 1)); //1000000 * (int) Math.random();;
        this.balance = balance;
    }

    // Getter for Customer Id
    public int getCustomerID(){
        return this.customerID;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return super.toString() + ", customer Id is " + customerID;
    }

    @Override
    public boolean equals(Object obj){
        boolean retVal = false;
        try{
            Customer customerToCompare = (Customer) obj;

            if (super.equals(customerToCompare)
            || ((this.customerID == customerToCompare.customerID) && this.getPassword().equals(customerToCompare.getPassword())))
                retVal = true;

        }
        catch (Exception e){}

        return retVal;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Customer customer1 = new Customer("Simba", 30, "simba123", "password123", 500.0);
        Customer customer2 = new Customer("Cleopatra", 25, "cleopatra321", "password321", 300.0);
        Customer customer3 = new Customer("Simba", 30, "simba123", "password123", 700.0);
        Customer customer4 = new Customer("Ali", 40, "ali456", "password456", 1000.0);

        // Testing toString method
        System.out.println(customer1); // Output: Name: Simba, Age: 30, CustomerID: C001

        // Testing equals method
        System.out.println(customer1.equals(customer2)); // Output: false
        System.out.println(customer1.equals(customer3)); // Output: true (since username and password match)
        System.out.println(customer1.equals(customer4)); // Output: false (since customerID and password don't match)
    }

}
