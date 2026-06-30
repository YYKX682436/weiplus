package com.tencent.qqpinyin.voicerecoapi;

/* loaded from: classes14.dex */
public class TRVADNative {
    public native int mfeClose();

    public native int mfeDetect();

    public native int mfeEnableNoiseDetection(boolean z17);

    public native int mfeExit();

    public native int mfeGetCallbackData(byte[] bArr, int i17);

    public native int mfeGetEndFrame();

    public native int mfeGetParam(int i17);

    public native int mfeGetStartFrame();

    public native int mfeInit(int i17, int i18);

    public native int mfeOpen();

    public native int mfeSendData(short[] sArr, int i17);

    public native void mfeSetLogLevel(int i17);

    public native int mfeSetParam(int i17, int i18);

    public native int mfeStart();

    public native int mfeStop();
}
