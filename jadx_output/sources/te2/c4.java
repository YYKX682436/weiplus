package te2;

/* loaded from: classes3.dex */
public final class c4 implements te2.w3 {

    /* renamed from: n, reason: collision with root package name */
    public static final te2.y3 f417919n = new te2.y3(null);

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f417920d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f417921e;

    /* renamed from: f, reason: collision with root package name */
    public final km2.q f417922f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f417923g;

    /* renamed from: h, reason: collision with root package name */
    public te2.x3 f417924h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f417925i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.component.LuckyMoneyResultReceiev f417926m;

    public c4(gk2.e liveData, qo0.c statusMonitor, km2.q qVar) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f417920d = liveData;
        this.f417921e = statusMonitor;
        this.f417922f = qVar;
        this.f417923g = "FinderLiveLuckyMoneyBubblePresenter_" + hashCode();
        this.f417925i = new java.util.concurrent.ConcurrentLinkedDeque();
    }

    public final java.util.Map c() {
        java.lang.String str;
        jz5.l[] lVarArr = new jz5.l[11];
        gk2.e eVar = this.f417920d;
        r45.nw1 nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        if (nw1Var != null) {
            long j17 = nw1Var.getLong(0);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.q(j17);
        } else {
            str = null;
        }
        lVarArr[0] = new jz5.l("live_id", str);
        r45.nw1 nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        lVarArr[1] = new jz5.l("live_start_time", nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(4)) : null);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("feed_id", b52.b.q(j18));
        lVarArr[3] = new jz5.l("live_time", ((mm2.e1) eVar.a(mm2.e1.class)).f328988r != null ? java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - (r3.getInteger(4) * 1000)) : null);
        lVarArr[4] = new jz5.l("session_buffer", ((mm2.e1) eVar.a(mm2.e1.class)).f328993w);
        lVarArr[5] = new jz5.l("enter_session_id", java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[6] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[7] = new jz5.l("finder_tab_context_id", b52.b.c());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        lVarArr[8] = new jz5.l("comment_scene", a52.a.f1584l);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        lVarArr[9] = new jz5.l("finder_username", c1Var != null ? c1Var.f328852o : null);
        lVarArr[10] = new jz5.l("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        return kz5.c1.l(lVarArr);
    }

    public java.lang.String f() {
        te2.z3 z3Var;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f417925i;
        if (concurrentLinkedDeque.isEmpty() || (z3Var = (te2.z3) concurrentLinkedDeque.peekFirst()) == null) {
            return null;
        }
        return z3Var.f418558c;
    }

    public void g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBubbleClick: current size:");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f417925i;
        sb6.append(concurrentLinkedDeque.size());
        com.tencent.mars.xlog.Log.i(this.f417923g, sb6.toString());
        te2.z3 z3Var = (te2.z3) concurrentLinkedDeque.peekFirst();
        java.lang.Object obj = this.f417924h;
        ie2.a aVar = obj instanceof ie2.a ? (ie2.a) obj : null;
        int i17 = aVar != null && aVar.x() ? 2 : 1;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1.ii((c50.c1) c17, ml2.f5.f327457e, android.text.TextUtils.isEmpty(z3Var != null ? z3Var.f418558c : null) ? ml2.e5.f327390f : ml2.e5.f327391g, false, i17, 4, null);
        te2.x3 x3Var = this.f417924h;
        com.tencent.mm.ui.MMFragmentActivity activity = x3Var != null ? x3Var.getActivity() : null;
        if (z3Var == null || activity == null) {
            return;
        }
        if (this.f417926m == null) {
            android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
            kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
            this.f417926m = new com.tencent.mm.plugin.finder.live.component.LuckyMoneyResultReceiev(this, createFreeHandler);
        }
        com.tencent.mm.plugin.finder.live.component.LuckyMoneyResultReceiev luckyMoneyResultReceiev = this.f417926m;
        if (luckyMoneyResultReceiev != null) {
            luckyMoneyResultReceiev.f111566f = new java.lang.ref.WeakReference(z3Var);
            com.tencent.mars.xlog.Log.i(luckyMoneyResultReceiev.f111564d, "setLuckyMoneyShowInfo info:" + z3Var);
        }
        qo0.c cVar = this.f417921e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        dk2.xf finderLiveAssistant = k0Var != null ? k0Var.getFinderLiveAssistant() : null;
        if (finderLiveAssistant != null) {
            ((dk2.r4) finderLiveAssistant).W(activity, z3Var.f418556a, this.f417926m, new te2.a4(this));
        }
    }

    public final void h(te2.z3 showInfo) {
        java.util.Set set;
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66996t).getValue();
        long j17 = ((mm2.e1) this.f417920d.a(mm2.e1.class)).f328988r.getLong(0);
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCache liveId:");
        sb6.append(j17);
        sb6.append(" sendId:");
        java.lang.String str = showInfo.f418557b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", sb6.toString());
        if (str != null && (set = (java.util.Set) jVar.f397200f.get(java.lang.Long.valueOf(j17))) != null) {
            set.add(str);
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f417925i;
        concurrentLinkedDeque.remove(showInfo);
        te2.x3 x3Var = this.f417924h;
        if (x3Var != null) {
            x3Var.p(concurrentLinkedDeque.size());
        }
    }

    @Override // fs2.a
    public void onDetach() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i(this.f417923g, sb6.toString());
        te2.x3 x3Var = this.f417924h;
        if (x3Var != null) {
            x3Var.destroy();
        }
        this.f417924h = null;
    }
}
