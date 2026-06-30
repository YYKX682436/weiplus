package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class v2 extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public java.lang.Object initialValue() {
        try {
            return java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.RuntimeException("Initialize MD5 failed.", e17);
        }
    }
}
