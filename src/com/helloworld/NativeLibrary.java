package com.helloworld;

import android.content.Context;
import android.widget.Toast;

public class NativeLibrary {
	/* *
	 * performOperation is defined in native library
	 */
	public native String performOperation();

	/* *
	 * loads the library shared object
	 */
	static {
		System.loadLibrary("NativeLibrary");
	}

	/* *
	 * Computes the result
	 */

	public void result(Context ctx) {
		Toast.makeText(ctx, performOperation(), Toast.LENGTH_SHORT).show();
	}
}
