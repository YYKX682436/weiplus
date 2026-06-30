package v75;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final v75.e f433957d = new v75.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        try {
            v75.g gVar = v75.g.f433959a;
            java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.g.f433962d).getValue();
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
