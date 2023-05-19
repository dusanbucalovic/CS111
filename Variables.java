// inline comment extends to the end of the line

public class Variables {


/*
multiple line comment
The signature of the main method is always the same
*/	
	public static void main (String[] args) {
		int x = 3; // declare x as an integer and assign the value 3 to x
		int y = 20;
		int z = 15;

		// Camel case: numberOfCats
		int divZByX = z / x;
		System.out.println("z/x = " + divZByX);

		// an integer divided by another integer is an integer
		int divZByX = y / x;
		System.out.println("y/x = " + divZByX);

		//work around to get the fractional part of an integer divisior
		double divYByXReal = ( y * 1.0) / x;
		System.out.println("y/x = " + divYByXReal);

		// modulus %
		int remainder = y % x;
		System.out.println("y%x = " + remainder);

		double floor = Math.floor(divYByXReal);
		System.out.println("floor of divYByXReal is " + floor);

		System.out.println("pow(x,2) = " + Math.pow(x,2));

		//test boolean expressions
		boolean a = false;
		boolean nota = !a; // !a is thenegation of the variable a
		System.out.println("a: " + a + ", nota: " + nota);

		boolean c = false;
		boolean d = a && c; //and
		boolean e = a || nota; //or
		System.out.println("a&&c: "+ d + ", a || nota: " + e);
		

	}
}