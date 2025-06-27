import java.util.*;
import users.Customer;
import users.Staff;


public class collection {
    public static void main(String[] args) {
        // 🔹 1. ArrayList - used for storing ordered list of rooms
        ArrayList<room> roomList = new ArrayList<>();
        roomList.add(new room(101, "Single", 55));
        roomList.add(new room(102, "Double", 75));
        System.out.println("ArrayList - Room List:");

        for (room r : roomList) {
            System.out.println("Room " + r.getRoomNumber() + " (" + (r.isAvailable() ? "Available" : "Booked") + ")");
        }

        // 🔹 2. HashMap - store room number with the Customer who booked it
        HashMap<Integer, Customer> roomBookings = new HashMap<>();
        Customer c1 = new Customer(1, "rendo", "rendo@mail.com", "012345678");
        roomBookings.put(101, c1); // Room 101 booked by rendo
        System.out.println("\nHashMap - Room Bookings:");

        for (Map.Entry<Integer, Customer> entry : roomBookings.entrySet()) {
            System.out.println("Room " + entry.getKey() + " booked by " + entry.getValue().getName());
        }

        // 🔹 3. HashSet - to store unique customer emails (no duplicates allowed)
        HashSet<String> uniqueEmails = new HashSet<>();
        uniqueEmails.add("rendo@gmail.com");
        uniqueEmails.add("rina@gmail.com");
        uniqueEmails.add("rendo@gmail.com"); // duplicate won't be added
        System.out.println("\nHashSet - Unique Emails:");

        for (String email : uniqueEmails) {
            System.out.println(email);
        }

        // 🔹 4. TreeMap - sorted staff list by ID
        TreeMap<Integer, Staff> staffMap = new TreeMap<>();
        staffMap.put(2, new Staff("Rina", "Receptionist", "pass123"));
        staffMap.put(1, new Staff("John", "Manager", "admin"));

        System.out.println("\nTreeMap - Sorted Staff by ID:");
        for (Map.Entry<Integer, Staff> entry : staffMap.entrySet()) {
            System.out.println("ID: " + entry.getValue().getStaffId() + ", Name: " + entry.getValue().getName());
        }
    }
}
