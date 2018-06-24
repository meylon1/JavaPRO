import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//play the lottery game with the user
//read the lottery numbers and print
//matching lottery ticket numbers
public class Lottery {
	public static final int NUMBERS =6;
	public static final int MAX_NUMBERS = 10;
	public static void main(String[] args) {
		
		//get the winning number and tickets sets
		
	    Set<Integer> winningNumbers = createWinningNumbers();
	    Set<Integer> ticket = getTicket();
	    Set<Integer> intersection = new TreeSet<Integer>(ticket);
	    intersection.retainAll(winningNumbers);
	    
	    System.out.println(" Your ticket numbers are " + ticket);
	    System.out.println(" The winning numbers are " + winningNumbers);
	    
	    System.out.println(" You had " + intersection.size()+ " matching number");
	    
	    if(intersection.size()>0) { 
	    	double prize = 100 * Math.pow(2,intersection.size());
	    	 System.out.println(" The Matched numbers are " + intersection);
	    	 System.out.println(" Your Prize is $" + prize);
	    }
	    
		

	}

	//getnerate a set of winning  lotto numbers
	public static Set<Integer> createWinningNumbers(){
		Set<Integer>winningNumbers = new TreeSet<Integer>();
		Random r = new Random();
		
	
	while ( winningNumbers.size()<NUMBERS){
			int number = r.nextInt(MAX_NUMBERS + 1);
			winningNumbers.add(number);
			
	
	}
	
	return winningNumbers;
	}
	
	//Get Tickets // read the players lottery ticket from the console
	
	public static Set<Integer> getTicket(){
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your " + NUMBERS + " unique lotto numbers:");
		while (ticket.size()< NUMBERS) {
			int number = console.nextInt();
			ticket.add(number);
		}
		console.close();
		return ticket;
	
		
	}
}
