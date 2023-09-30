
//Import Scanner
import java.util.Scanner;

//Start main
public class MovieDriver {

    public static void main(String[] args) {
    	
    	
    	
        // Create a Scanner object to read from the keyboard
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;
        
        while (continueInput) {
	          
	        
	        // Create a new movie object
	        Movie movie = new Movie();
	
	        // Prompt the user to enter the title of a movie
	        System.out.print("\nEnter the name of a movie: ");
	        String title = scanner.nextLine();
	
	        // Set the title in the movie object
	        movie.setTitle(title);
	
	        // Prompt the user to enter the movie's rating
	        System.out.print("\nEnter the rating of the movie: ");
	        String rating = scanner.nextLine();
	
	        // Set the rating in the movie object
	        movie.setRating(rating);
	
	        // Prompt the user to enter the number of tickets sold
	        System.out.print("\nEnter the number of tickets sold: ");
	        int ticketsSold = scanner.nextInt();
	
	        // Set the number of tickets sold in the movie object
	        movie.setSoldTickets(ticketsSold);
	
	        // Print out the information using the movie's toString method
	        System.out.println("\nMovie Information:\n" + "\n" + movie.toString());
	        
	     // Ask the user if they want to continue
	        System.out.print("\nDo you want to enter another movie? (yes/no): ");
	        String response = scanner.next();
	        
	        
	        if (response.equalsIgnoreCase("no")) {
	            continueInput = false;
	        }
	        
	     // Consume the newline character
            scanner.nextLine();
            

	        
        }
        
        System.out.print("\nGoodbye");

        
    }
}