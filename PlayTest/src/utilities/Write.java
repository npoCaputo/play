package utilities;

import java.time.LocalDateTime;

public class Write {

	/**
	 * A small method which prints out the local date and time along with a
	 * message to the console.
	 * 
	 * @param message,
	 *            the string to print to the console
	 */
	public static void writeLine(String message) {
		System.out.println(LocalDateTime.now().toString().replace('T', ' ') + ": " + message);
	}

	/**
	 * An overloaded convenience method to call the writeLine method.
	 * 
	 * @param message,
	 *            a double to write to the console.
	 */
	public static void writeLine(double message) {
		writeLine("" + message);
	}

	/**
	 * An overloaded convenience method to call the writeLine method.
	 * 
	 * @param message,
	 *            a long to write to the console.
	 */
	public static void writeLine(long message) {
		writeLine("" + message);
	}

	/**
	 * An overloaded convenience method to call the writeLine method.
	 * 
	 * @param message,
	 *            a byte to write to the console.
	 */
	public static void writeLine(byte message) {
		writeLine("" + message);
	}

	/**
	 * An overloaded convenience method to call the writeLine method.
	 * 
	 * @param message,
	 *            a boolean to write to the console.
	 */
	public static void writeLine(boolean message) {
		writeLine("" + message);
	}

	/**
	 * Convenience method printing a character in the writeLine format.
	 * 
	 * @param message,
	 *            a character to print
	 */
	public static void writeLine(char message) {
		writeLine("" + message);
	}
	
	/**
	 * Convenience method for printing out the date using the writeLine format.
	 */
	public static void writeLine() {
		writeLine("");
	}

	/**
	 * Used to evaluate the time impact of using localDateTime in a println
	 * statement.
	 * 
	 * @param message,
	 *            a string to print to the console.
	 */
	public static void quickWrite(String message) {
		System.out.println(System.currentTimeMillis() + " | " + message);
	}

	/**
	 * This is a convenience method in order to print a number in the quickWrite
	 * method.
	 * 
	 * @param message
	 */
	public static void quickWrite(double message) {
		quickWrite("" + message);
	}

	/**
	 * This is a convenience method in order to print a number in the quickWrite
	 * method.
	 * 
	 * @param message
	 */
	public static void quickWrite(long message) {
		quickWrite("" + message);
	}

	/**
	 * Convenience method printing a boolean in the quickWrite format.
	 * 
	 * @param message,
	 *            a boolean value to print
	 */
	public static void quickWrite(boolean message) {
		quickWrite("" + message);
	}

	/**
	 * Convenience method printing a character in the quickWrite format.
	 * 
	 * @param message,
	 *            a character to print
	 */
	public static void quickWrite(char message) {
		quickWrite("" + message);
	}

}
