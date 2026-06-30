package v75;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final v75.k f433968d = new v75.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        try {
            java.lang.String str = v75.m.f433970a;
            java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.m.f433971b).getValue();
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
