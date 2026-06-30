package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class HkWxCertUtil {
    public static final int RSA_1024 = 0;
    public static final int RSA_2048 = 1;

    static {
        com.tenpay.ndk.FitHkWxLibraryLoader.load("tenpay_utils");
    }

    public static native byte[] certDecrypt(java.lang.String str, byte[] bArr);

    public static native byte[] certEncrypt(java.lang.String str, byte[] bArr);

    public static native byte[] certSign(java.lang.String str, byte[] bArr);

    public static native boolean certVerify(java.lang.String str, byte[] bArr, byte[] bArr2);

    public static native boolean clearAllCert();

    public static native boolean clearCert(java.lang.String str);

    public static native java.lang.String getAlgoToken(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19);

    public static native java.lang.String getCsr(int i17);

    public static native int getError();

    public static native long getExpireTime(java.lang.String str);

    public static native java.lang.String getVersion();

    public static native boolean hasCert(java.lang.String str);

    public static native boolean importCert(java.lang.String str, java.lang.String str2);

    public static native boolean init(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);
}
