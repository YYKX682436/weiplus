package k46;

/* loaded from: classes13.dex */
public class a extends k46.f {
    public a() {
        super(new java.io.ByteArrayOutputStream());
    }

    @Override // k46.f
    public java.io.InputStream b() {
        return new java.io.ByteArrayInputStream(((java.io.ByteArrayOutputStream) ((java.io.FilterOutputStream) this).out).toByteArray());
    }
}
