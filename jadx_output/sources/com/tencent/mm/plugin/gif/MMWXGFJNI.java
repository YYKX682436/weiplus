package com.tencent.mm.plugin.gif;

/* loaded from: classes10.dex */
public class MMWXGFJNI {
    public static final int KV_STAT_WXAM_DEC_REPORT = 31880;
    public static final int KV_STAT_WXAM_ENC_REPORT = 31862;
    public static final int PIC_TYPE_JPG = 0;
    public static final int PIC_TYPE_PNG = 1;
    private static final java.lang.String TAG = "MicroMsg.JNI.MMWXGF";
    public static final int WXAM_SCENE_BRAND = 7;
    public static final int WXAM_SCENE_C2C = 1;
    public static final int WXAM_SCENE_EMOJI = 6;
    public static final int WXAM_SCENE_HEAD = 3;
    public static final int WXAM_SCENE_MISC = 5;
    public static final int WXAM_SCENE_SCAN = 4;
    public static final int WXAM_SCENE_SNS = 2;
    public static final int WXAM_SCENE_UNKONWN = 0;
    static int mECode = -1;
    static boolean mIsInit;

    static {
        com.tencent.mars.xlog.Log.i(TAG, "static MMWXGFJNI");
        fp.d0.n("wxVcodec2");
        mIsInit = false;
        com.tencent.mm.sdk.platformtools.r9.a();
        int nativeInit = nativeInit("libwxVcodec2.so");
        mECode = nativeInit;
        mIsInit = nativeInit >= 0;
        com.tencent.mars.xlog.Log.i(TAG, "native init MMWXGF mECode:%d result:%b :%s", java.lang.Integer.valueOf(nativeInit), java.lang.Boolean.valueOf(mIsInit), "libwxVcodec2.so");
    }

    public static int getErrorCode() {
        return mECode;
    }

    public static boolean isWxGF(byte[] bArr, int i17) {
        return nativeIsWXGF(bArr, i17);
    }

    private static native int nativeAV2Gif(java.lang.String str, java.lang.String str2);

    private static native int nativeAV2Gif(byte[] bArr, byte[] bArr2);

    public static native int nativeAddGifEncodeRgbaFrame(long j17, int i17, int i18, byte[] bArr, long j18);

    public static native int nativeAddWxAMEncodeRgbaFrame(long j17, int i17, int i18, byte[] bArr, long j18);

    public static native int nativeDecodeBufferFrame(long j17, byte[] bArr, int i17, android.graphics.Bitmap bitmap, int[] iArr);

    public static native int nativeDecodeBufferHeader(long j17, byte[] bArr, int i17);

    public static native byte[] nativeFinishGifEncode(long j17);

    public static native byte[] nativeFinishWxAMEncode(long j17);

    public static native byte[] nativeFinishWxAMEncodeReport(long j17, long[] jArr);

    public static native byte[] nativeGetAigcInfoFromBuf(byte[] bArr);

    public static native byte[] nativeGetAigcInfoFromFile(java.lang.String str);

    public static native int nativeGetOption(long j17, byte[] bArr, int i17, int[] iArr);

    public static native int nativeInit(java.lang.String str);

    public static native long nativeInitGifEncode(int i17, int i18, long j17);

    public static native long nativeInitWxAMDecoder();

    public static native long nativeInitWxAMEncoder(int i17, int i18, long j17, int i19, int i27, int i28, int i29, int i37);

    public static native boolean nativeIsWXGF(byte[] bArr, int i17);

    private static native int nativePic2Wxam(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, int i38, int i39, int i47);

    private static native int nativePic2WxamReport(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, long[] jArr, boolean z17, int i37, int i38, int i39, int i47, byte[] bArr);

    private static native int nativePic2WxamWHReportWithAigc(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long[] jArr, int i39, int i47, int i48, int i49, byte[] bArr2, byte[] bArr3, int i57);

    private static native int nativePic2WxamWHWithAigc(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, byte[] bArr2, int i57);

    private static native int nativePic2WxamWithWH(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38);

    private static native int nativePic2WxamWithWH(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49);

    private static native int nativePic2WxamWithWHReport(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long[] jArr, boolean z17, int i28, int i29, int i37, int i38);

    private static native int nativePic2WxamWithWHReport(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long[] jArr, int i39, int i47, int i48, int i49, byte[] bArr2);

    public static native int nativeRewindBuffer(long j17);

    public static native int nativeUninit(long j17);

    private static native int nativeWxam2Pic(java.lang.String str, java.lang.String str2);

    private static native byte[] nativeWxam2PicBuf(byte[] bArr);

    private static native byte[] nativeWxam2PicBufReport(byte[] bArr, long[] jArr, byte[] bArr2);

    private static native int nativeWxam2PicReport(java.lang.String str, java.lang.String str2, long[] jArr, byte[] bArr);

    public static native byte[] nativeWxamToGif(byte[] bArr);

    public static int pic2Wxam(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, int i39, int i47, int i48, int i49) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i37 != 1) {
            return nativePic2Wxam(a17, a18, i17, i18, i28, i19, i27, i29, z17, i39, i47, i48, i49);
        }
        long[] jArr = new long[26];
        byte[] bArr = new byte[1024];
        int nativePic2WxamReport = nativePic2WxamReport(a17, a18, i17, i18, i28, i19, i27, i29, jArr, z17, i39, i47, i48, i49, bArr);
        if (nativePic2WxamReport != 0) {
            return nativePic2WxamReport;
        }
        java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str3.indexOf(0);
        if (indexOf != -1) {
            str3 = str3.substring(0, indexOf);
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.kvStat(KV_STAT_WXAM_ENC_REPORT, fVar.s(java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25]), str3));
        com.tencent.mars.xlog.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d], icc:%s", java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), str3);
        return nativePic2WxamReport;
    }

    public static int pic2WxamWithWH(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i28 == 1) {
            long[] jArr = new long[26];
            int nativePic2WxamWithWHReport = nativePic2WxamWithWHReport(a17, a18, i17, i18, i19, i27, jArr, false, i37, i38, i39, i47);
            if (nativePic2WxamWithWHReport != 0) {
                return nativePic2WxamWithWHReport;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.kvStat(KV_STAT_WXAM_ENC_REPORT, fVar.s(java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25])));
            com.tencent.mars.xlog.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d]", java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]));
            return nativePic2WxamWithWHReport;
        }
        return nativePic2WxamWithWH(a17, a18, i17, i18, i19, i27, i37, i38, i39, i47);
    }

    public static int wxam2Pic(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i17 != 1) {
            return nativeWxam2Pic(a17, a18);
        }
        long[] jArr = new long[15];
        byte[] bArr = new byte[1024];
        int nativeWxam2PicReport = nativeWxam2PicReport(a17, a18, jArr, bArr);
        if (nativeWxam2PicReport != 0) {
            return nativeWxam2PicReport;
        }
        java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str3.indexOf(0);
        if (indexOf != -1) {
            str3 = str3.substring(0, indexOf);
        }
        java.lang.String str4 = str3;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.kvStat(KV_STAT_WXAM_DEC_REPORT, fVar.s(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), str4, java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14])));
        com.tencent.mars.xlog.Log.i(TAG, "Wxam2Pic report:scene[%d], type[%d], time[%d], ver[%d], srcSize[%d], dstSize[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]));
        return nativeWxam2PicReport;
    }

    public static byte[] wxam2PicBuf(byte[] bArr, int i17, int i18) {
        if (i17 != 1) {
            return nativeWxam2PicBuf(bArr);
        }
        long[] jArr = new long[15];
        byte[] bArr2 = new byte[1024];
        byte[] nativeWxam2PicBufReport = nativeWxam2PicBufReport(bArr, jArr, bArr2);
        if (nativeWxam2PicBufReport == null) {
            return nativeWxam2PicBufReport;
        }
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str.indexOf(0);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        java.lang.String str2 = str;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.kvStat(KV_STAT_WXAM_DEC_REPORT, fVar.s(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), str2, java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14])));
        com.tencent.mars.xlog.Log.i(TAG, "Wxam2Pic report:scene[%d], type[%d], time[%d], ver[%d], srcSize[%d], dstSize[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]));
        return nativeWxam2PicBufReport;
    }

    public static int pic2WxamWithWH(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58) {
        return pic2WxamWithWH(str, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, i48, i49, i57, i58, new byte[0]);
    }

    public static int pic2WxamWithWH(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, byte[] bArr2) {
        java.lang.String a17 = kk.w.a(str, true);
        if (i39 == 1) {
            long[] jArr = new long[26];
            byte[] bArr3 = new byte[1024];
            int nativePic2WxamWHReportWithAigc = nativePic2WxamWHReportWithAigc(a17, bArr, i17, i18, i19, i27, i28, i29, i37, i38, jArr, i48, i49, i57, i58, bArr3, bArr2, bArr2.length);
            if (nativePic2WxamWHReportWithAigc != 0) {
                return nativePic2WxamWHReportWithAigc;
            }
            java.lang.String str2 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            int indexOf = str2.indexOf(0);
            if (indexOf != -1) {
                str2 = str2.substring(0, indexOf);
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.kvStat(KV_STAT_WXAM_ENC_REPORT, fVar.s(java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25]), str2));
            com.tencent.mars.xlog.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d], icc:%s", java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), str2);
            return nativePic2WxamWHReportWithAigc;
        }
        return nativePic2WxamWHWithAigc(a17, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i48, i49, i57, i58, bArr2, bArr2.length);
    }
}
