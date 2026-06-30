package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public class ScanFastFocusEngineNative {
    private static final java.lang.String TAG = "MicroMsg.ScanFastFocusEngineNative";
    private static boolean isSoLoaded;
    public byte[] bestImageData;
    public int bestImageId;
    public byte[] fullImageData;
    public int result = 0;
    public int width = 0;
    public int height = 0;
    public com.tencent.mm.plugin.scanner.model.ScanPoint[] points = new com.tencent.mm.plugin.scanner.model.ScanPoint[10];
    public int pointCount = 0;
    public com.tencent.mm.protocal.protobuf.GoodsObject cropObject = new com.tencent.mm.protocal.protobuf.GoodsObject();
    public com.tencent.mm.plugin.scanner.model.ScanProductInfo[] trackInfoList = new com.tencent.mm.plugin.scanner.model.ScanProductInfo[5];
    public int trackInfoCount = 0;
    public int detectType = 0;

    static {
        tryLoadLibrary();
    }

    public ScanFastFocusEngineNative() {
        com.tencent.mars.xlog.Log.i(TAG, "ScanFastFocusEngineNative constructor %s", java.lang.Integer.valueOf(hashCode()));
        init();
    }

    private void init() {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            com.tencent.mm.plugin.scanner.model.ScanPoint[] scanPointArr = this.points;
            if (i18 >= scanPointArr.length) {
                break;
            }
            scanPointArr[i18] = new com.tencent.mm.plugin.scanner.model.ScanPoint();
            i18++;
        }
        while (true) {
            com.tencent.mm.plugin.scanner.model.ScanProductInfo[] scanProductInfoArr = this.trackInfoList;
            if (i17 >= scanProductInfoArr.length) {
                return;
            }
            scanProductInfoArr[i17] = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
            i17++;
        }
    }

    public static boolean isSoLoaded() {
        return isSoLoaded;
    }

    public static boolean tryLoadLibrary() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("scan_recognize");
        try {
            boolean wi6 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("XNet");
            boolean wi7 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("opencv_world");
            boolean wi8 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("ffengine");
            boolean wi9 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("focusEngineJni");
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i(TAG, "loadLibrary loadXNet: %s, loadOpencv: %s, loadFFE: %s, loadJNI: %s", java.lang.Boolean.valueOf(wi6), java.lang.Boolean.valueOf(wi7), java.lang.Boolean.valueOf(wi8), java.lang.Boolean.valueOf(wi9));
            if (!wi6 || !wi7 || !wi8 || !wi9) {
                z17 = false;
            }
            isSoLoaded = z17;
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "FocusEngine init exception", new java.lang.Object[0]);
            isSoLoaded = false;
            return false;
        }
    }

    public native com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo computeImagePHash(byte[] bArr, int i17, int i18, boolean z17);

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative getCropRGBAByTrackId(int i17, float f17, float f18, float f19, float f27);

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative getCropYUVByTrackId(int i17, float f17, float f18, float f19, float f27);

    public native int getModelConfigIntValue(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    public native com.tencent.mm.plugin.scanner.model.ScanPoint[] getPointObjects();

    public native java.lang.String getReportString();

    public native com.tencent.mm.plugin.scanner.model.ScanProductInfo[] getScanProductInfoList(byte[] bArr, int i17, int i18, int i19, int i27);

    public native com.tencent.mm.plugin.scanner.model.ScanProductInfo[] getScanProductInfoListForFullImage(int i17, float f17, float f18, float f19, float f27);

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative getUploadFullRGBAImage(byte[] bArr, int i17, boolean z17, float f17);

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative getUploadFullYUVImage(byte[] bArr, int i17, boolean z17, float f17);

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative getUploadFullYUVImageAndResize(byte[] bArr, int i17, boolean z17, float f17, int i18, int i19);

    public native boolean isAICrop();

    public native boolean isUsingAI();

    public native int nativeFocusEngineVersion();

    public native int nativeInit(int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19);

    public native void nativeRelease();

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative process(byte[] bArr, int i17, int i18);

    public native void reset();

    public native void resetNoBoxCount();

    public void resetStatus() {
        this.bestImageData = null;
        this.fullImageData = null;
        this.trackInfoCount = 0;
        this.detectType = 0;
    }

    public native com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative rotateYUVImage(byte[] bArr, int i17, int i18, int i19, int i27, int i28);

    public native void setConfig(java.lang.String str);

    public native void setNetSpeed(int i17);

    public native void setPHashConfig(java.lang.String str);

    public native void setServerDetectFrameCount(int i17);

    public native void setServerState(int i17);

    public native com.tencent.mm.plugin.scanner.model.ScanFrameProcessResult shouldJump(float f17, float f18, float f19, float f27, int i17, boolean z17);
}
