import java.util.LinkedList;
import java.util.Scanner;


public class HotelBooking{
    int booking_id;
    String guest_name;
    String room_type;
    int night;
    double price_per_night;
    double total_price;

    static LinkedList<HotelBooking> bookingList= new LinkedList<>();

    private HotelBooking(){

    }

    public HotelBooking(int booking_id, String guest_name, String room_type, int night, double price_per_night,
            double total_price) {
        this.booking_id = booking_id;
        this.guest_name = guest_name;
        this.room_type = room_type;
        this.night = night;
        this.price_per_night = price_per_night;
        this.total_price = total_price;
    }

    public static void addBooking(){
        Scanner sc= new Scanner(System.in);
        HotelBooking newBooking= new HotelBooking();

        System.out.print("Enter Guest Name: ");
        newBooking.guest_name= sc.nextLine();

        System.out.print("Enter Room type (Single/Double/Suite): ");
        newBooking.room_type= sc.nextLine();

        System.out.print("Enter number of Nights:  ");
        newBooking.night=sc.nextInt();

        newBooking.total_price= newBooking.night * newBooking.price_per_night;
        newBooking.booking_id= bookingList.size()+1;

        bookingList.add(newBooking);
        System.out.println("Booking added successfully!");
    }

    public static void displayBookings(){
        if (bookingList.isEmpty()){
            System.out.println("No bookings available.");
            return;
        }
        System.out.println("Booking List: ");
        for (HotelBooking booking : bookingList) {
            System.out.println("ID: " + booking.booking_id +
                    ", Guest: " + booking.guest_name +
                    ", Room: " + booking.room_type +
                    ", Nights: " + booking.night +
                    ", Price/Night: $" + booking.price_per_night +
                    ", Total: $" + booking.total_price);
        }

    }
    public static void removeBooking(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Booking ID to remove: ");
        int id= sc.nextInt();

        boolean removed= bookingList.removeIf(b -> b.booking_id ==id);
        if(removed){
            System.out.println("Booking removed Successfully!");
        }
        else{
            System.out.println("Booking not found.");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Remove Booking");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                addBooking();
                break;
                case 2:
                displayBookings();
                break;
                case 3:
                removeBooking();
                break;
                case 0:
                    System.out.println("Exiting syetm...");
                break;
                default:
                    System.out.println("Invalid option. Try Again.");
            }
        } while (choice!=0);
    }
}
