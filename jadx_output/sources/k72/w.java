package k72;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final k72.w f304772d = new k72.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] encoded = ((java.security.cert.Certificate) obj).getEncoded();
        if (encoded != null) {
            java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
            java.lang.String encodeToString = encoder != null ? encoder.encodeToString(encoded) : null;
            if (encodeToString != null) {
                return encodeToString;
            }
        }
        return "error-cert";
    }
}
