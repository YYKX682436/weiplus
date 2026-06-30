package y6;

/* loaded from: classes13.dex */
public class t implements r7.d {
    public t(y6.v vVar) {
    }

    @Override // r7.d
    public java.lang.Object create() {
        try {
            return new y6.u(java.security.MessageDigest.getInstance("SHA-256"));
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
