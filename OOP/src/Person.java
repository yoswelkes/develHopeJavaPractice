public class Person {
    private String name;
    private int age;
    private String username;
    private String password;

    // Constructor
    public Person(String name, int age, String username, String password){
        this.name = name;
        this.password = password;
        this.age = age;
        this.username = username;
    }
    @Override
    public String toString(){
        return "Name is " + name + ", age is " + age;
    }

    @Override
    public boolean equals(Object obj){
        boolean retVal = false;
        try{
            Person personToCompare = (Person) obj;

            if (this.username.equals(personToCompare.username) && this.password.equals(personToCompare.password))
                retVal = true;

        }
        catch (Exception e){}

        return retVal;
    }

    public String getPassword() {
        // Hypothetical method to access password, modify according to real use case if password access is needed
        return this.password;
    }

    public String getName(){
        return this.name;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Person person1 = new Person("Simba", 30, "simba123", "password123");
        Person person2 = new Person("Cleopatra", 25, "cleopatra321", "password321");
        Person person3 = new Person("Simba", 30, "simba123", "password123");

        // Testing toString method
        System.out.println(person1); // Output: Name: Simba, Age: 30

        // Testing equals method
        System.out.println(person1.equals(person2)); // Output: false
        System.out.println(person1.equals(person3)); // Output: true
    }
}
