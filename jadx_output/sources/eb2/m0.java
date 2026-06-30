package eb2;

/* loaded from: classes2.dex */
public final class m0 extends td2.b {

    /* renamed from: g, reason: collision with root package name */
    public final int f250822g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f250823h;

    /* renamed from: i, reason: collision with root package name */
    public final eb2.f0 f250824i;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f250825m = new im5.c();

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f250826n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: o, reason: collision with root package name */
    public final int f250827o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f250828p;

    /* renamed from: q, reason: collision with root package name */
    public final ey2.t0 f250829q;

    /* renamed from: r, reason: collision with root package name */
    public final ey2.o0 f250830r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f250831s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f250832t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f250833u;

    public m0(int i17, r45.qt2 qt2Var, eb2.f0 f0Var) {
        this.f250822g = i17;
        this.f250823h = qt2Var;
        this.f250824i = f0Var;
        this.f250827o = f0Var != null ? f0Var.f250749h : 0;
        java.lang.String name = java.lang.String.valueOf(i17);
        com.tencent.mm.plugin.finder.feed.model.internal.v0 policy = (true && true) ? com.tencent.mm.plugin.finder.feed.model.internal.v0.f108060d : null;
        name = (1 & 2) != 0 ? "" : name;
        kotlin.jvm.internal.o.g(policy, "policy");
        kotlin.jvm.internal.o.g(name, "name");
        new java.util.concurrent.locks.ReentrantLock().newCondition();
        new java.util.LinkedList();
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f250829q = t0Var;
        this.f250830r = t0Var.N6(i17);
        this.f250833u = "Finder.TimelineFeedFetcher#" + i17;
    }

    public static void E0(eb2.m0 m0Var, db2.u3 callback, int i17, db2.v3 v3Var, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, java.util.List list, rn5.a aVar, com.tencent.mm.protobuf.g gVar2, com.tencent.mm.plugin.finder.feed.model.e eVar, int i18, java.lang.Object obj) {
        int i19 = (i18 & 2) != 0 ? 0 : i17;
        db2.v3 v3Var2 = (i18 & 4) != 0 ? null : v3Var;
        com.tencent.mm.protobuf.g gVar3 = (i18 & 8) != 0 ? null : gVar;
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? false : z18;
        rn5.a aVar2 = (i18 & 128) != 0 ? null : aVar;
        com.tencent.mm.protobuf.g gVar4 = (i18 & 256) != 0 ? null : gVar2;
        com.tencent.mm.plugin.finder.feed.model.e eVar2 = (i18 & 512) != 0 ? null : eVar;
        m0Var.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(m0Var.f250833u, "[fetch] pullType=" + i19 + " tabType=" + m0Var.f250822g + " isPreloadMore=" + z19 + ", isGetHistory=" + m0Var.f250828p + " tabStateVM=" + m0Var.f250829q.hashCode() + " isAtAppPush=" + m0Var.f250830r.f257452l);
        eb2.g0 g0Var = new eb2.g0(callback);
        if (i19 == 0 || i19 == 1) {
            m0Var.f250828p = false;
        }
        boolean z28 = gVar3 == null;
        if (z28) {
            com.tencent.mars.xlog.Log.i(m0Var.f250833u, "[innerFetch] use tabType=" + m0Var.f250822g + " GlobalLastBuffer");
            java.util.Iterator it = m0Var.f250830r.f257454n.iterator();
            while (it.hasNext()) {
            }
            if (i19 == 0) {
                gm0.j1.u().c().x(hc2.d0.c(m0Var.f250822g), null);
            }
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(m0Var.f250822g), "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            gVar3 = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
        }
        java.lang.String str = m0Var.f250833u;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerFetch: lastBufferSize=");
        sb6.append(gVar3 != null ? java.lang.Integer.valueOf(gVar3.f192156a.length) : null);
        sb6.append(", lastBuffer=");
        sb6.append(gVar3 == null ? "null" : com.tencent.mm.sdk.platformtools.w2.b(gVar3.f192156a));
        sb6.append(" subTabItem=null");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlinx.coroutines.l.d(m0Var.f250826n, null, null, new eb2.l0(m0Var, i19, gVar3, list, z27, aVar2, gVar4, v3Var2, eVar2, z28, g0Var, null), 3, null);
    }
}
