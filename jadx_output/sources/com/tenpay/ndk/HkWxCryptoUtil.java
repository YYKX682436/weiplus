package com.tenpay.ndk;

/* loaded from: classes7.dex */
public class HkWxCryptoUtil {
    static {
        com.tenpay.ndk.FitHkWxLibraryLoader.load("tenpay_utils");
    }

    public static native java.lang.String encryptPassword(byte[] bArr, byte[] bArr2, long j17, java.lang.String str, int i17);

    public static native int getError();

    public static native java.lang.String getVersion();
}
