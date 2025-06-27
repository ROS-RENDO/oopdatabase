
public class room {
    private int roomNumber;
    private String type; // Single, Double
    private boolean isAvailable;
    private double price;

    public room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }

// Setter

    public void bookRoom() {
        this.isAvailable = false;
    }

    public void cancelBooking() {
        this.isAvailable = true;
    }

// Getter

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
