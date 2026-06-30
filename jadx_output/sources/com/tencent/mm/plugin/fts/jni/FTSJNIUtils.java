package com.tencent.mm.plugin.fts.jni;

/* loaded from: classes11.dex */
public class FTSJNIUtils {
    public static native int countTokens(java.lang.String str);

    public static native int icuInitialize(java.lang.String str);

    public static native java.lang.String icuTokenizer(java.lang.String str);

    public static native void nativeInitFts(long j17, byte[] bArr);

    public static native int stringCompareUtfBinary(java.lang.String str, java.lang.String str2);
}
