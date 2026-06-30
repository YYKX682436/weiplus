package v75;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final v75.b f433952d = new v75.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        try {
            v75.c cVar = v75.c.f433953a;
            java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.c.f433954b).getValue();
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
