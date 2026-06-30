package com.tencent.qqpinyin.voicerecoapi;

/* loaded from: classes14.dex */
class TRSpeexNative {
    public native int nativeTRSpeexDecode(long j17, byte[] bArr, int i17, int i18, byte[] bArr2);

    public native long nativeTRSpeexDecodeInit();

    public native int nativeTRSpeexDecodeRelease(long j17);

    public native int nativeTRSpeexEncode(long j17, byte[] bArr, int i17, int i18, byte[] bArr2);

    public native long nativeTRSpeexInit();

    public native int nativeTRSpeexRelease(long j17);
}
