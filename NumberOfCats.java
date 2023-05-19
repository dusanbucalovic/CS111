public class NumberOfCats {
	
	// Assume two command line inputs
	public static void main (String[] args) {

		//transform a String into an integer
		int ellensCats = Integer.parseInt(args[0]);

		int anasCats = Integer.parseInt(args[1]);

		//check for negatives
		if ( ellensCats < 0 || anasCats < 0 ) {
			System.out.println("Error: negative number of cats");

		} else {}

		int totalCats = ellensCats + anasCats;
	}
}