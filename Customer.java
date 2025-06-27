package users;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;

    public Customer(int customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Customer(String email) { // Overloaded constructor
        this.email = email;
    }
// Getter
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    // Other getters/setters as needed
}
