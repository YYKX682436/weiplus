package gd1;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final gd1.m f270505d = new gd1.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        byte[] encode = android.util.Base64.encode((obj == null || !(obj instanceof byte[])) ? new byte[0] : (byte[]) obj, 2);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        return new java.lang.String(encode, UTF_8);
    }
}
