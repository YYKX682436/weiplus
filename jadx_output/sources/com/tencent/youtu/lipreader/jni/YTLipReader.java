package com.tencent.youtu.lipreader.jni;

/* loaded from: classes5.dex */
public class YTLipReader {
    private static final java.lang.String TAG = "YTLipReader";
    private long nativePtr;

    public YTLipReader() {
        NativeConstructor();
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    public static byte[] encodeJpeg(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] encodePng(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void destroy() {
        NativeDestructor();
    }

    public native java.lang.String feature();

    public native void feed(float[] fArr, byte[] bArr, int i17, int i18, int i19, float f17, float f18, float f19);

    public void finalize() {
        super.finalize();
        NativeDestructor();
    }

    public native java.lang.String getImageListJsonStr();

    public native java.lang.String getVersion();

    public native void init();

    public native java.lang.String lipReadingFeature();

    public native void reset();
}
