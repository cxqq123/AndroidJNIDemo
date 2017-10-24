#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

//env:结构体二级指针，该结构体中封装了大量的函数指针，可以帮助程序员实现某些常用功能
//thiz:本地方法调用者的对象(MainActivity的对象)
jstring Java_com_cx_androidjnidemo_MainActivity_helloWorld(JNIEnv* env, jobject thiz){

    char* cstr = "hello World";
    //把C字符串转换成java字符串
    //jstring     (*NewStringUTF)(JNIEnv*, const char*);
    jstring jstr = (*env)->NewStringUTF(env, cstr);
    return jstr;
}

//env:结构体二级指针，该结构体中封装了大量的函数指针，可以帮助程序员实现某些常用功能
//thiz:本地方法调用者的对象(MainActivity的对象)
jstring Java_com_cx_testndkdemo_MainActivity_helloWorld(JNIEnv* env, jobject thiz){

    char* cstr = "hello World";
    //把C字符串转换成java字符串
    //jstring     (*NewStringUTF)(JNIEnv*, const char*);
    jstring jstr = (*env)->NewStringUTF(env, cstr);
    return jstr;
}