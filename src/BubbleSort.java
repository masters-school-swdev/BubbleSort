
/**
 * Program to sort numbers using a bubble sort algorithm
 * @author user
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    if (0 == args.length) usage();

	    // TODO place program code here
	}


	/**
	 * Print program usage statement and exit
	 */
	private static void usage()
	{
		//System.err.println("Main [value]");
		//System.err.println("value - a value to be rounded, e.g. 5.8");
		System.exit(1);
	}
	
	/**
	 * Simple logging mechanism
	 */
	static class Log 
	{
		/**
		 * Print a message
		 * @param msg
		 */
		public static void info( String msg )
		{
			System.out.println("INFO: " + msg );
		}
		/**
		 * Print a formatted message
		 * @param format
		 * @param args
		 */
		public static void info( String format, Object...args)
		{
			info(String.format(format, args));
		}
		/**
		 * Print an error to the console
		 * @param err
		 */
		public static void error( String err )
		{
			System.err.println("ERROR: " + err);
		}
	}

}
