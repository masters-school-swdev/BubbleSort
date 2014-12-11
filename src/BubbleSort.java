import java.util.Arrays;

/**
 * Program to sort numbers using a bubble sort algorithm
 * 
 * @author user
 * 
 */
public class BubbleSort {

    private double[] arr;
    private int nElems = -1;


    public BubbleSort(int maxSize) {
	this.arr = new double[maxSize];
    }

    public boolean isEmpty() {
	return nElems == -1;
    }

    public boolean isFull() {
	return nElems == this.arr.length - 1;
    }

    public void add(double d) {
	arr[++nElems] = d;
    }
    
    /**
     * Bubble sort algorithm
     * @return sorted array
     */
    public double[] sort() {
	for (int outer = this.nElems-1; outer >= 0; outer--) {
		Log.trace(">> outer=%d arr=%s", outer, this);
		for (int inner = 0; inner <= outer; inner++) {
		    Log.trace("\tcomparing %.0f to %.0f", this.arr[inner], this.arr[inner+1]);
			if (this.arr[inner] > this.arr[inner+1]) {
			    Log.trace("\tswapping %.0f with %.0f", this.arr[inner], this.arr[inner+1]);
				swap(this.arr, inner, inner+1);
			}
		}
		Log.trace("<< outer=%d arr=%s", outer, this);
	}
	return arr;
    }
    
    private static final void swap(double[] arr, int a, int b) {
	double tmp = arr[a];
	arr[a] = arr[b];
	arr[b] = tmp;
    }
    
    /**
     * String representation of BubbleSort object.
     */
    public String toString() {
	double[] dest = new double[nElems+1];
	System.arraycopy(arr, 0, dest, 0, dest.length);
	return Arrays.toString(dest);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
//	if (0 == args.length)
//	    usage();

	BubbleSort bubbleSort = new BubbleSort(10);
	
	bubbleSort.add(3);
	bubbleSort.add(5);
	bubbleSort.add(4);
	bubbleSort.add(2);
	bubbleSort.add(1);

	Log.isTraceEnabled = true;
	
	Log.info("@start %s", bubbleSort);

	bubbleSort.sort();

	Log.info("@end %s", bubbleSort);
    }

    /**
     * Print program usage statement and exit
     */
    private static void usage() {
	// System.err.println("Main [value]");
	// System.err.println("value - a value to be rounded, e.g. 5.8");
	System.exit(1);
    }

    /**
     * Simple logging mechanism
     */
    static class Log {
	/**
	 * Print a message
	 * 
	 * @param msg
	 */
	public static void info(String msg) {
	    System.out.println("INFO: " + msg);
	}

	/**
	 * Print a formatted message
	 * 
	 * @param format
	 * @param args
	 */
	public static void info(String format, Object... args) {
	    info(String.format(format, args));
	}
	
	public static boolean isTraceEnabled;
	
	public static void trace(String msg) {
	    if (!isTraceEnabled) {
		return;
	    }
	    System.out.println("TRACE: " + msg);
	}
	
	public static void trace(String format, Object...args) {
	    trace(String.format(format, args));
	}

	/**
	 * Print an error to the console
	 * 
	 * @param err
	 */
	public static void error(String err) {
	    System.err.println("ERROR: " + err);
	}
    }

}
