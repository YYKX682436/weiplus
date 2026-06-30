package com.tencent.wxmm;

/* loaded from: classes14.dex */
public interface IConfCallBack {
    byte[] callBackFromConf(int i17, int i18, byte[] bArr);

    void callbackVideoFrame(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27);

    void callbackWriteLog(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19);
}
