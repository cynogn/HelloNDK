#include <jni.h>
JNIEXPORT jstring JNICALL Java_com_helloworld_NativeLibrary_performOperation(
		JNIEnv* env, jobject o) {
	return (*env) -> NewStringUTF(env, "this is Gautam");
}
