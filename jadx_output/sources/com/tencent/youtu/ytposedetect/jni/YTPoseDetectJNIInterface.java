package com.tencent.youtu.ytposedetect.jni;

/* loaded from: classes14.dex */
public class YTPoseDetectJNIInterface {
    private static com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener loggerListener;

    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    public static native java.lang.String Checksum(byte[] bArr);

    public static native boolean canReflect();

    public static native void configNativeLog(boolean z17);

    public static byte[] encodeJpeg(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static native com.tencent.youtu.ytposedetect.data.YTActRefData getActionReflectData(int i17);

    public static native byte[] getBestImage(int i17);

    public static native java.lang.String getConfigData(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native byte[] getEyeImage(int i17);

    public static native byte[][] getFrameList();

    public static native java.lang.String getLiveSelectDataChecksum(java.lang.String str, java.lang.String str2);

    public static native byte[] getMouthImage(int i17);

    public static native java.lang.String getVersion();

    public static native int initModel(java.lang.String str);

    public static native boolean isRecordingDone();

    public static void nativeLog(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static native int poseDetect(float[] fArr, float[] fArr2, int i17, byte[] bArr, int i18, int i19, int i27, float f17, float f18, float f19, int i28);

    public static native void releaseAll();

    public static native void resetDetect();

    public static native void setColorData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static void setLoggerListener(com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static native void setSafetyLevel(int i17);

    public static native int updateParam(java.lang.String str, java.lang.String str2);

    public static void nativeLog(int i17, java.lang.String str) {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTPoseDetectJNIInterface.nativeLog]", str);
        }
    }
}
