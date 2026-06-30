package com.tencent.mm.plugin.imgenc;

/* loaded from: classes8.dex */
public class MMIMAGEENCJNI {
    public static final java.lang.String TAG = "MMIMAGEENCJNI";

    public static native long free(long j17);

    public static native long open(long j17);

    public static native long open(java.lang.String str);

    public static native byte[] readByte(long j17, byte[] bArr);

    public static native long seek(long j17, long j18, int i17);

    public static native long transFor(long j17, byte[] bArr, long j18, long j19);
}
