#include <jni.h>
#include <stdio.h>
JNIEXPORT jint JNICALL Java_com_helloworld_NativeLibrary_addOperation(
		JNIEnv* env, jobject o, jint value1, jint value2) {
	return (jint)(value1 + value2);
}

JNIEXPORT jint JNICALL Java_com_helloworld_NativeLibrary_minusOperation(
		JNIEnv* env, jobject o, jint value1, jint value2) {
	return (jint)(value1 - value2);
}

JNIEXPORT jint JNICALL Java_com_helloworld_NativeLibrary_multiOperation(
		JNIEnv* env, jobject o, jint value1, jint value2) {
	return (jint)(value1 * value2);
}

JNIEXPORT jint JNICALL Java_com_helloworld_NativeLibrary_divideOperation(
		JNIEnv* env, jobject o, jint value1, jint value2) {
	return (jint)(value1 / value2);
}
