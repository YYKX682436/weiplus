package fs0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f266199a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f266200b;

    /* renamed from: d, reason: collision with root package name */
    public final long f266202d;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.PriorityQueue f266205g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f266206h;

    /* renamed from: i, reason: collision with root package name */
    public final int f266207i;

    /* renamed from: j, reason: collision with root package name */
    public final int f266208j;

    /* renamed from: c, reason: collision with root package name */
    public long f266201c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final x.b f266203e = new x.b();

    /* renamed from: f, reason: collision with root package name */
    public final x.b f266204f = new x.b();

    /* renamed from: k, reason: collision with root package name */
    public final int f266209k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remuxer_vfr_threshold, 10);

    public c(java.lang.String str, int i17, long j17, boolean z17) {
        boolean z18;
        this.f266199a = j17;
        this.f266200b = z17;
        this.f266202d = -1L;
        double[] dArr = {0.0d, 0.0d, 0.0d};
        this.f266206h = kz5.n0.D0(rs0.f.a(str, dArr, Integer.MAX_VALUE));
        int i18 = (int) dArr[2];
        this.f266207i = i18;
        this.f266208j = i17 <= 0 ? i18 : i17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.B(986L, 114L);
        g0Var.C(986L, 115L, (long) dArr[2]);
        g0Var.C(986L, 116L, (long) (dArr[1] - dArr[0]));
        int i19 = 0;
        while (true) {
            if (i19 >= 3) {
                z18 = true;
                break;
            }
            if (!(dArr[i19] > 0.0d)) {
                z18 = false;
                break;
            }
            i19++;
        }
        if (z18 && (!this.f266206h.isEmpty())) {
            this.f266202d = ((java.lang.Number) kz5.n0.i0(this.f266206h)).longValue();
        }
        double d17 = dArr[0];
        double d18 = dArr[1];
        this.f266205g = new java.util.PriorityQueue(java.lang.Math.max(this.f266206h.size(), 11), fs0.b.f266198d);
        z65.c.a();
        if (this.f266207i <= this.f266208j) {
            com.tencent.mars.xlog.Log.i("DecodeHelper", "use PassthroughDecodeStrategy");
            a(new fs0.p());
        } else {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remuxer_vfr_max_process_frame_count, 3660);
            java.util.List list = this.f266206h;
            if (list.size() > Ni && !com.tencent.mm.plugin.sight.base.c.d() && !com.tencent.mm.plugin.sight.base.c.c(false, this.f266200b)) {
                com.tencent.mars.xlog.Log.i("DecodeHelper", "use CfrDecodeStrategy");
                a(new fs0.a());
            } else if (list.size() <= Ni) {
                com.tencent.mars.xlog.Log.i("DecodeHelper", "use VfrDecodeStrategy");
                a(new fs0.r());
            } else {
                com.tencent.mars.xlog.Log.i("DecodeHelper", "use SimpleVfrDecodeStrategy");
                a(new fs0.q());
            }
        }
        com.tencent.mars.xlog.Log.i("DecodeHelper", "init decode helper, inFPS = " + this.f266207i + ", outFPS = " + this.f266208j + ", minFps:" + d17 + ", maxFps:" + d18 + ", vfrThreshold:" + this.f266209k + ", valid frames = " + this.f266203e.f450846f + ", lastPts:" + this.f266202d + ", frames.size:" + this.f266206h.size());
    }

    public final void a(fs0.d strategy) {
        kotlin.jvm.internal.o.g(strategy, "strategy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        strategy.a(this.f266199a, this.f266206h, this.f266207i, this.f266208j, this.f266203e, this.f266204f);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (strategy instanceof fs0.p) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(986L, 105L);
            g0Var.C(986L, 108L, currentTimeMillis2);
        } else if (strategy instanceof fs0.a) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.B(986L, 107L);
            g0Var2.C(986L, 112L, currentTimeMillis2);
        } else if (strategy instanceof fs0.r) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.B(986L, 106L);
            g0Var3.C(986L, 110L, currentTimeMillis2);
        } else if (strategy instanceof fs0.q) {
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.B(986L, 149L);
            g0Var4.C(986L, 150L, currentTimeMillis2);
        }
        this.f266201c = -1L;
    }
}
