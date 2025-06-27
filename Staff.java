package users;

public class Staff {
    private static int staffCounter = 1; // static field
    private int staffId;
    private String name;
    private String role;
    private String password;

    public Staff(String name, String role, String password) {
        this.staffId = staffCounter++;
        this.name = name;
        this.role = role;
        this.password = password;
    }

    public Staff(String name, String password) { // Overloaded
        this.name = name;
        this.password = password;
    }

    public boolean login(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }

    public static void showTotalStaff() { // static method
        System.out.println("Total staff registered: " + (staffCounter - 1));
    }
    //Getter

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    
}
