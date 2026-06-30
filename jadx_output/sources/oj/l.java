package oj;

/* loaded from: classes7.dex */
public class l extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public java.lang.Object initialValue() {
        try {
            return java.security.MessageDigest.getInstance("SHA-256");
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.RuntimeException("Initialize SHA256-DIGEST failed.", e17);
        }
    }
}
