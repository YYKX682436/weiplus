package zt5;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static volatile zt5.j f475603b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f475604a = zt5.b.f475600a;

    public static zt5.j a() {
        zt5.j jVar;
        if (f475603b != null) {
            return f475603b;
        }
        synchronized (zt5.j.class) {
            if (f475603b == null) {
                f475603b = new zt5.j();
            }
            jVar = f475603b;
        }
        return jVar;
    }
}
