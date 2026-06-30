package ug0;

/* loaded from: classes8.dex */
public final class q extends jm0.g {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f427470i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f427471m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f427472n;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f427473f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.app.t2 f427474g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.u1 f427475h;

    static {
        com.tencent.mm.repairer.config.search.RepairerConfigWebSearchCommonSyncRedDot repairerConfigWebSearchCommonSyncRedDot = new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchCommonSyncRedDot();
        bm5.o1 o1Var = bm5.o1.f22719a;
        boolean z17 = false;
        if (o1Var.h(repairerConfigWebSearchCommonSyncRedDot) == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: false, disabled by Repairer.");
        } else if (o1Var.h(repairerConfigWebSearchCommonSyncRedDot) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: true, enabled by Repairer.");
            z17 = true;
        } else {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).sj(e42.c0.clicfg_android_search_tabtips_reddot, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: " + z17);
        }
        f427472n = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f427473f = jz5.h.b(ug0.j.f427460d);
        this.f427474g = new ug0.k(this);
        this.f427475h = new wg0.a();
    }

    public static final ug0.q T6(jm0.o hostService) {
        kotlin.jvm.internal.o.g(hostService, "hostService");
        if (!jm0.g.class.isAssignableFrom(ug0.q.class)) {
            throw new java.lang.IllegalArgumentException(hostService.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(hostService.getViewModel(), new jm0.e(hostService)).a(ug0.q.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (ug0.q) ((jm0.g) a17);
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountInit");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).aj();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).Zi();
        if (!f427472n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountInit, CommonSyncRedDot not enabled, skipped observing.");
            return;
        }
        pm0.v.X(new ug0.o(this));
        O6(new ug0.p(this));
        com.tencent.mm.app.w.INSTANCE.a(this.f427474g);
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        xg0.a aVar = new xg0.a();
        ((h70.a) eVar).getClass();
        w71.l1.f443418a.add(aVar);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
        U6(3006, 8, false, null);
    }

    @Override // jm0.g
    public void S6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountRelease");
        com.tencent.mm.app.w.INSTANCE.p(this.f427474g);
    }

    public final void U6(int i17, int i18, boolean z17, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeSync, syncScene: ");
        sb6.append(i17);
        sb6.append(", shouldCheckConfig: ");
        sb6.append(z17);
        sb6.append(", contextBufferSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
        com.tencent.mm.sdk.coroutines.LifecycleScope Bi = this.f300267d.Bi();
        if (Bi != null) {
            v65.i.b(Bi, null, new ug0.l(z17, i18, i17, bArr, null), 1, null);
        }
    }
}
