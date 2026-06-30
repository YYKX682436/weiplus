package com.tencent.qafpapi;

/* loaded from: classes15.dex */
public class QAFPNative {
    static {
        com.tencent.qafpapi.QAFPNative.class.getClassLoader();
        fp.d0.n("wechatQAFP");
    }

    public static native int QAFPGetAudioFingerPrint(byte[] bArr);

    public static native int QAFPGetAudioFingerPrintTV(byte[] bArr);

    public static native int QAFPGetVersion();

    public static native int QAFPInit();

    public static native int QAFPProcess(byte[] bArr, int i17);

    public static native int QAFPProcessTV(byte[] bArr, int i17);

    public static native int QAFPRelease();

    public static native int QAFPReset();
}
