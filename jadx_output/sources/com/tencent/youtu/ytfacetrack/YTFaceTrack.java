package com.tencent.youtu.ytfacetrack;

/* loaded from: classes14.dex */
public class YTFaceTrack {
    public static java.lang.String Version = "2.3.3.7";
    private static com.tencent.youtu.ytfacetrack.YTFaceTrack instance;
    private static com.tencent.youtu.ytfacetrack.YTFaceTrack.IYtLoggerListener loggerListener;
    public long handleId = 0;
    private long nativePtr;

    /* loaded from: classes14.dex */
    public static class FaceStatus {
        public float pitch;
        public float[] pointsVis;
        public float roll;
        public float[] xys;
        public float[] xys5p;
        public float yaw;
    }

    /* loaded from: classes14.dex */
    public static class FaceStatus3d {
        public float[] denseFaceModel;
        public float[] expression;
        public float pitch;
        public float roll;
        public float[] transform;
        public float yaw;
    }

    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes14.dex */
    public static class YTImage {
        public byte[] data;
        public int height;
        public int width;
    }

    static {
        nativeInit();
    }

    public YTFaceTrack() {
        NativeConstructor();
    }

    public static int GlobalInit(java.lang.String str) {
        int GlobalInitInner = GlobalInitInner(str);
        if (GlobalInitInner == 0) {
            instance = new com.tencent.youtu.ytfacetrack.YTFaceTrack();
        }
        return GlobalInitInner;
    }

    private static native int GlobalInitInner(java.lang.String str);

    private static native int GlobalInitSuccessCount();

    public static boolean GlobalRelease() {
        com.tencent.youtu.ytfacetrack.YTFaceTrack yTFaceTrack = instance;
        if (yTFaceTrack != null) {
            yTFaceTrack.NativeDestructor();
            instance = null;
        }
        return GlobalReleaseInner();
    }

    private static native boolean GlobalReleaseInner();

    public static boolean IsInstanceExist() {
        return instance != null;
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    public static synchronized com.tencent.youtu.ytfacetrack.YTFaceTrack getInstance() {
        com.tencent.youtu.ytfacetrack.YTFaceTrack yTFaceTrack;
        synchronized (com.tencent.youtu.ytfacetrack.YTFaceTrack.class) {
            yTFaceTrack = instance;
        }
        return yTFaceTrack;
    }

    private static native boolean nativeInit();

    public static void nativeLog(int i17, java.lang.String str) {
        com.tencent.youtu.ytfacetrack.YTFaceTrack.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTFaceTrack.nativeLog]", str);
        }
    }

    public static void setLoggerListener(com.tencent.youtu.ytfacetrack.YTFaceTrack.IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcess(com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessBitmap(android.graphics.Bitmap bitmap, int i17, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessRGB(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessRGBA(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessYUV(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessYUVWithBlur(byte[] bArr, int i17, int i18, int i19, boolean z17, float[] fArr, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.param.YTFaceAlignParam GetFaceAlignParam();

    public native com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam GetFaceDetectParam();

    public native android.graphics.Rect[] GetFaceRect(com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam GetFaceTrackParam();

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage GetYTImageBitmap(android.graphics.Bitmap bitmap, int i17);

    public native int GetYTImageBitmapReuseData(android.graphics.Bitmap bitmap, int i17, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage GetYTImageRGB(byte[] bArr, int i17, int i18, int i19);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage GetYTImageRGBA(byte[] bArr, int i17, int i18, int i19);

    public native int GetYTImageRGBAReuseData(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native int GetYTImageRGBReuseData(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage GetYTImageYUV(byte[] bArr, int i17, int i18, int i19);

    public native int GetYTImageYUVReuseData(byte[] bArr, int i17, int i18, int i19, com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage);

    public native byte[] RotateYUV(byte[] bArr, int i17, int i18, int i19);

    public native void SaveYTImage(byte[] bArr, int i17, int i18);

    public native boolean SetFaceAlignParam(com.tencent.youtu.ytfacetrack.param.YTFaceAlignParam yTFaceAlignParam);

    public native boolean SetFaceDetectParam(com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam yTFaceDetectParam);

    public native boolean SetFaceTrackParam(com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam yTFaceTrackParam);
}
