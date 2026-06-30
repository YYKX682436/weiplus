package com.tencent.youtu.ytagreflectlivecheck.jni;

/* loaded from: classes14.dex */
public class YTAGReflectLiveCheckJNIInterface {
    public static int TIME_REGULATION_LOOSE = 1;
    public static int TIME_REGULATION_STRICT;
    private static com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface instance;
    private static java.util.concurrent.locks.Lock instanceLock = new java.util.concurrent.locks.ReentrantLock();
    private static com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener loggerListener;
    private long FRnativePtr;
    public android.content.Context context = null;

    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    private YTAGReflectLiveCheckJNIInterface() {
        FRNativeConstructor();
    }

    public static native java.lang.String Checksum(java.lang.String str);

    public static native java.lang.String FRGenConfigData(int i17, java.lang.String str);

    public static native java.lang.String FRVersion();

    public static native void SetActStr(java.lang.String str);

    public static native void SetPipelineVersion(java.lang.String str);

    public static synchronized void clearInstance() {
        synchronized (com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.class) {
            try {
                instanceLock.lock();
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface yTAGReflectLiveCheckJNIInterface = instance;
                if (yTAGReflectLiveCheckJNIInterface != null) {
                    yTAGReflectLiveCheckJNIInterface.FRNativeDestructor();
                    instance = null;
                }
            } finally {
                instanceLock.unlock();
            }
        }
    }

    public static void compressTest(android.graphics.Bitmap bitmap, int i17) {
        try {
            java.io.File file = new java.io.File("/sdcard/reflect/");
            if (!file.exists()) {
                file.mkdirs();
            }
            java.lang.String str = "/sdcard/reflect/" + i17 + "/";
            java.io.File file2 = new java.io.File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(str, "mytestInJava_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.lang.Exception unused) {
        }
    }

    public static native void configNativeLog(boolean z17);

    public static byte[] encodeJpeg(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static synchronized com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface getInstance() {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface yTAGReflectLiveCheckJNIInterface;
        synchronized (com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.class) {
            try {
                instanceLock.lock();
                if (instance == null) {
                    instance = new com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface();
                }
                instanceLock.unlock();
                yTAGReflectLiveCheckJNIInterface = instance;
            } catch (java.lang.Throwable th6) {
                instanceLock.unlock();
                throw th6;
            }
        }
        return yTAGReflectLiveCheckJNIInterface;
    }

    public static java.lang.String modelVersion() {
        return "";
    }

    public static void nativeLog(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static java.lang.String sdkVersion() {
        return "";
    }

    public static void setLoggerListener(com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static native int updateParam(java.lang.String str, java.lang.String str2);

    public native int FRDoDetectionYuvs(boolean z17, int i17);

    public native com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack FRGetAGin();

    public native int FRGetChangePoint();

    public native int FRGetConfigBegin();

    public native int FRGetConfigEnd();

    public native int FRGetISOCaptureTimeVecSize();

    public native double FRGetISObackup();

    public native int FRGetISOchangeFrame();

    public native double FRGetISOmin();

    public native com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawYuvData[] FRGetRawYuvDatas();

    public native int FRGetTriggerTime();

    public native int FRInit(boolean z17, java.lang.String str, int i17, long[] jArr, float f17, int i18);

    public native void FRNativeConstructor();

    public native void FRNativeDestructor();

    public native void FRPushCaptureTime(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRPushISOCaptureTime(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRPushISOImgYuv(byte[] bArr, int i17, int i18);

    public native void FRPushYuv(byte[] bArr, int i17, int i18, long j17, int i19, float[] fArr);

    public native int FRRelease();

    public native void FRSetBegin(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRSetChangePointTime(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRSetDoingDelayCalc(boolean z17);

    public native void FRSetEnd(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRSetISObackup(double d17);

    public native void FRSetISOchangeFrame(int i17);

    public native void FRSetISOchangeTime(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval timeval);

    public native void FRSetSafetyLevel(int i17);

    public static void nativeLog(int i17, java.lang.String str) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTAGReflectLiveCheckJNIInterface.nativeLog]", str);
        }
    }

    public static byte[] encodeJpeg(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
