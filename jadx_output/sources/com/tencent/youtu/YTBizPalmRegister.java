package com.tencent.youtu;

/* loaded from: classes14.dex */
public class YTBizPalmRegister {
    private long nativePtr;

    /* loaded from: classes14.dex */
    public static class HandType {
        public static int LEFT = 0;
        public static int RIGHT = 1;
        public static int UNKNOWN = 2;
    }

    /* loaded from: classes14.dex */
    public static class ImageDataResult {
        public byte[] data;
        public java.lang.String md5Hex;
    }

    /* loaded from: classes14.dex */
    public static class ImageResult {
        public static int LIVENESS = 2;
        public static int REGISTER = 1;
    }

    /* loaded from: classes14.dex */
    public static class Result {
        public float angle;
        public int code;
        public java.lang.String debugJSON;
        public int frame;
        public int handType;
        public boolean isFirstPalm;
        public boolean isQualifiedPalm;
        public float[] palmCircle;
        public android.graphics.RectF palmRect;
        public int targetHandType;
        public float[] tipCircle;
        public int tipCode;
    }

    /* loaded from: classes14.dex */
    public static class Tip {
        public static int YT_TIP_HAND_ACTION_CLOSE = 120;
        public static int YT_TIP_HAND_ACTION_OPEN = 110;
        public static int YT_TIP_HAND_ACTION_STILL_CLOSE = 121;
        public static int YT_TIP_HAND_ACTION_STILL_OPEN = 111;
        public static int YT_TIP_HAND_ACTION_UNKNOWN = 198;
        public static int YT_TIP_HAND_ACTION_WRONG = 199;
        public static int YT_TIP_HAND_LEAN_BACKWARD = 1021;
        public static int YT_TIP_HAND_LEAN_FORWARD = 1020;
        public static int YT_TIP_HAND_LEAN_RIGHT_LEFT = 1022;
        public static int YT_TIP_HAND_MOVE_CENTER = 1010;
        public static int YT_TIP_HAND_MOVE_CLOSER = 1011;
        public static int YT_TIP_HAND_MOVE_FAST = 1016;
        public static int YT_TIP_HAND_MOVE_FURTHER = 1012;
        public static int YT_TIP_HAND_MOVE_ROTATE = 1013;
        public static int YT_TIP_HAND_MULTI = 1001;
        public static int YT_TIP_HAND_NOT_AVAILABLE = 1004;
        public static int YT_TIP_HAND_NOT_FOUND = 1000;
        public static int YT_TIP_HAND_TOO_NEAR = 1005;
        public static int YT_TIP_HAND_TYPE_LEFT = 1002;
        public static int YT_TIP_HAND_TYPE_RIGHT = 1003;
        public static int YT_TIP_IMAGE_TOO_BRIGHT = 1901;
        public static int YT_TIP_IMAGE_TOO_DARK = 1900;
        public static int YT_TIP_JOINT_OUT_OF_IMAGE = 1015;
        public static int YT_TIP_PALM_MULTI = 1101;
        public static int YT_TIP_PALM_NOT_FOUND = 1100;
        public static int YT_TIP_PALM_OUT_OF_IMAGE = 1014;
        public static int YT_TIP_PALM_QUALITY_ABNORMAL = 1204;
        public static int YT_TIP_PALM_QUALITY_BLUE = 1212;
        public static int YT_TIP_PALM_QUALITY_BLURRINESS = 1206;
        public static int YT_TIP_PALM_QUALITY_CONTINUE_BLURRINESS = 1260;
        public static int YT_TIP_PALM_QUALITY_DORSUM = 1200;
        public static int YT_TIP_PALM_QUALITY_FOCUS = 1216;
        public static int YT_TIP_PALM_QUALITY_FORWARD = 1202;
        public static int YT_TIP_PALM_QUALITY_GREEN = 1213;
        public static int YT_TIP_PALM_QUALITY_ILLUM_BRIGHT = 1208;
        public static int YT_TIP_PALM_QUALITY_ILLUM_DARK = 1207;
        public static int YT_TIP_PALM_QUALITY_LATERAL = 1201;
        public static int YT_TIP_PALM_QUALITY_LIGHT_BRIGHT = 1211;
        public static int YT_TIP_PALM_QUALITY_LIGHT_DART = 1210;
        public static int YT_TIP_PALM_QUALITY_LINE = 1215;
        public static int YT_TIP_PALM_QUALITY_NOISE = 1209;
        public static int YT_TIP_PALM_QUALITY_OCCLUSION = 1203;
        public static int YT_TIP_PALM_QUALITY_REGISTRATION = 1205;
        public static int YT_TIP_PALM_QUALITY_TOTAL = 1214;
        public static int YT_TIP_PIPELINE_SUCCESS;
    }

    public YTBizPalmRegister(java.lang.String str, java.lang.String str2) {
        int NativeConstructor = NativeConstructor(str, str2);
        if (NativeConstructor == 0) {
            return;
        }
        throw new java.lang.IllegalAccessError("error model dirpath and config filaneme: " + NativeConstructor);
    }

    private native int NativeConstructor(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2);

    private native int NativeConstructor(java.lang.String str, java.lang.String str2);

    private native void NativeDestructor();

    public static native java.lang.String getFullVersion(java.lang.String str, java.lang.String str2);

    public static native java.lang.String getVersion();

    public void destroy() {
        NativeDestructor();
    }

    public void finalize() {
        NativeDestructor();
    }

    public native com.tencent.youtu.YTBizPalmRegister.ImageDataResult getImageData(int i17);

    public native java.lang.String getPipelineResult();

    public native com.tencent.youtu.YTBizPalmRegister.Result process(byte[] bArr, int i17, int i18);

    public native int reset();

    public native int resetConfig(java.lang.String str);

    public native int setConfig(java.lang.String str);

    public native int setDebug(boolean z17);

    public native int setHandType(int i17);

    public YTBizPalmRegister(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        int NativeConstructor = NativeConstructor(assetManager, str, str2);
        if (NativeConstructor == 0) {
            return;
        }
        throw new java.lang.IllegalAccessError("error model dirpath and config filaneme: " + NativeConstructor);
    }
}
