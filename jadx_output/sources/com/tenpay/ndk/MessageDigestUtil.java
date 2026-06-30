package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class MessageDigestUtil {
    public static java.lang.String bytesToHex(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString.toUpperCase());
        }
        return sb6.toString();
    }

    private native byte[] doSHA256(byte[] bArr);

    public java.lang.String getSHA256Hex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            byte[] doSHA256 = doSHA256(bArr);
            if (doSHA256 != null) {
                return bytesToHex(doSHA256);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
