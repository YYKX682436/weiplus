package yv1;

@j95.b
/* loaded from: classes3.dex */
public final class q extends i95.w implements c01.d8 {

    /* renamed from: e, reason: collision with root package name */
    public static final yv1.m f466135e = new yv1.m(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f466136f = jz5.h.b(yv1.k.f466097d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f466137g = jz5.h.b(yv1.l.f466103d);

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f466138d;

    public void wi(java.lang.String from, long j17) {
        kotlin.jvm.internal.o.g(from, "from");
        c01.d8.f37104g0.getClass();
        if (!c01.c8.f37089b.contains(from)) {
            throw new java.lang.IllegalArgumentException("Unknown dataSource: ".concat(from));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanExService", "#noteLatestTotalSize: " + j17 + ", from=" + from + ", currMs=" + currentTimeMillis, null);
        if (j17 > 0) {
            yv1.m mVar = f466135e;
            yv1.m.a(mVar).putLong("last_total_size_of_" + from + "_ts", currentTimeMillis);
            yv1.m.a(mVar).putLong("last_total_size_of_".concat(from), j17);
        }
        yv1.m mVar2 = f466135e;
        synchronized (yv1.m.b(mVar2)) {
            kz5.h0.B(yv1.m.b(mVar2), new yv1.n(from, j17));
        }
    }
}
