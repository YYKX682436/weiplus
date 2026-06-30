package u24;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f424130a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f424131b;

    public static final void a(long j17) {
        if (f424130a != null) {
            return;
        }
        f424131b = java.lang.Long.valueOf(j17);
        f424130a = gm0.j1.b().j() + '_' + j17;
    }

    public static final java.lang.String b() {
        java.lang.String str = f424130a;
        return str == null ? "" : str;
    }
}
