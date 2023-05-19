public class CommandLineArgumentsVariable {

	public static void main (String[] args) {

		//args, length has the number of arguments
		System.out.println("Number of arguments is " + args.length);

		int index = 0; // 0 is the index of the first argument

		while ( index = args.length ) {
			System.out.println(args[index]);
			index = index + 1;
		}
	}

}