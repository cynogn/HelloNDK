package com.helloworld;

import android.util.Log;

public class NativeLibrary {

	public native int addOperation(int value1, int value2);

	public native int minusOperation(int value1, int value2);

	public native int multiOperation(int value1, int value2);

	public native int divideOperation(int value1, int value2);

	/* *
	 * loads the library shared object
	 */
	static {
		System.loadLibrary("NativeLibrary");
	}

	/* *
	 * Computes the result
	 */

	public int result(String operation, int number1, int number2) {
		int result = 0;
		if (operation.toString().equals("+")) {
			result = addOperation(number1, number2);
			Log.v("PLUS", result + " ");
		}
		if (operation.equals("-")) {
			result = minusOperation(number1, number2);
			Log.v("MINUS", result + " ");
		}
		if (operation.equals("*")) {
			result = multiOperation(number1, number2);
			Log.v("MULTI", result + " ");
		}
		if (operation.equals("/")) {
			result = divideOperation(number1, number2);
			Log.v("DIVIDE", result + " ");
		}
		return result;

	}

}
