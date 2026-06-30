package com.tencent.mm.plugin.fingerprint;

/* loaded from: classes9.dex */
public class FingerPrintAuth {
    public static native void clearData(java.lang.String str, java.lang.String str2, int i17);

    public static native java.lang.String genOpenFPEncrypt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9);

    public static native java.lang.String genOpenFPSign(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public static native java.lang.String genPayFPEncrypt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7);

    public static native java.lang.String genPayFPSign(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public static native java.lang.String genRsaKey(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native java.lang.String getFingerPrintId(java.lang.String str, java.lang.String str2);

    public static native java.lang.String getRsaKey(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native java.lang.String getX509Csr(java.lang.String str);

    public static native boolean importCert(java.lang.String str, java.lang.String str2);

    public static native int saveX509Csr(java.lang.String str, java.lang.String str2);
}
