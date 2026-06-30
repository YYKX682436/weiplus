package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f193046a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f193047b = new com.tencent.mm.sdk.platformtools.v2();

    public static java.lang.String a(java.lang.String str) {
        return b(str.getBytes());
    }

    public static java.lang.String b(byte[] bArr) {
        byte[] digest = ((java.security.MessageDigest) f193047b.get()).digest(bArr);
        int length = digest.length;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(length * 2);
        int i17 = length + 0;
        for (int i18 = 0; i18 < i17; i18++) {
            byte b17 = digest[i18];
            char[] cArr = f193046a;
            char c17 = cArr[(b17 & 240) >> 4];
            char c18 = cArr[b17 & 15];
            stringBuffer.append(c17);
            stringBuffer.append(c18);
        }
        return stringBuffer.toString();
    }
}
