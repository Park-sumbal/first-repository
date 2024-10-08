import java.util.*;
public class TheatreSeatBooking {
    public static void main(String[] args) {
        
                // Define a 2D array for the seats (5 rows and 6 seats in each row)
                char[][] seats = new char[5][6];
                
                // Initialize all seats as available ('A')
                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        seats[i][j] = 'A';  // A means Available
                    }
                }
        
                Scanner sc = new Scanner(System.in);
                boolean continueBooking = true;
        
                while (continueBooking) {
                    System.out.println("Available seats: ");
                    printSeats(seats);
        
                    // Ask user for the row and seat number to book
                    System.out.print("Enter row number (1-5): ");
                    int row = sc.nextInt() - 1; // Adjust for 0-based indexing
        
                    System.out.print("Enter seat number (1-6): ");
                    int seat = sc.nextInt() - 1; // Adjust for 0-based indexing
        
                    // Check if the seat is available
                    if (seats[row][seat] == 'A') {
                        seats[row][seat] ='B';  // B means Booked
                        System.out.println("Seat successfully booked!");
                    } else {
                        System.out.println("Seat already booked. Try a different seat.");
                    }
        
                    // Ask if the user wants to continue booking
                    System.out.print("Do you want to book another seat? (y/n): ");
                    char response = sc.next().charAt(0);
                    if (response == 'n' || response == 'N') {
                        continueBooking = false;
                    }
                }
        
                System.out.println("Final seating arrangement: ");
                printSeats(seats);
                sc.close();
            }
        
            // Function to print the seating arrangement
            public static void printSeats(char[][] seats) {
                for (int i = 0; i < seats.length; i++) {
                    System.out.print("Row " + (i + 1) + ": ");
                    for (int j = 0; j < seats[i].length; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
             
                   }   }
    
}



      
         
    

