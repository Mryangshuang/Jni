#include <jni.h>
#include <string>




extern "C" {
JNIEXPORT jint JNICALL
Java_com_example_administrator_jni_Jni_min(JNIEnv *env, jobject instance, jint a, jint b) {
    int m=9;
    return a-b;
}

jstring
Java_com_example_administrator_jni_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
jint
Java_com_example_administrator_jni_Jni_add(JNIEnv* env, jobject /* this */,jint a,jint b) {
    return a+b;
}

JNIEXPORT jint JNICALL
Java_com_example_administrator_jni_Jni_max(JNIEnv *env, jclass type, jint a, jint b) {
    return a>b?a:b;
}
}
