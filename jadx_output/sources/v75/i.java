package v75;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final v75.i f433965d = new v75.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        try {
            jz5.g gVar = v75.j.f433966a;
            java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.j.f433966a).getValue();
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
