package u04;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final u04.d f423475a = new u04.d();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f423476b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f423477c;

    /* renamed from: d, reason: collision with root package name */
    public static s04.a f423478d;

    static {
        f423476b = j62.e.g().c(new com.tencent.mm.repairer.config.recovery.RepairerConfigRecoverPage()) == 1;
        f423477c = j62.e.g().c(new com.tencent.mm.repairer.config.recovery.RepairerConfigTimeLimitToRecover()) * 1000 * 60;
    }

    public final java.lang.Long a(java.lang.String str, int i17) {
        androidx.lifecycle.c1 a17;
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).requireAccountInitialized();
        if (str != null) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
            }
            r04.b X6 = ((r04.d) ((r04.a) a17).P6(r04.d.class)).X6(i17 + '_' + str);
            if (X6 != null) {
                return java.lang.Long.valueOf(X6.field_updateTime);
            }
        }
        return null;
    }

    public final void b() {
        ((q04.y) i95.n0.c(q04.y.class)).Ai();
        f423478d = null;
    }
}
