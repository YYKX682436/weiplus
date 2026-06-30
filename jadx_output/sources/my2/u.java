package my2;

/* loaded from: classes3.dex */
public final class u implements my2.a {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f332763d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f332764e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f332765f;

    /* renamed from: g, reason: collision with root package name */
    public my2.b f332766g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f332767h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f332768i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f332769m;

    public u(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f332763d = liveData;
        this.f332764e = statusMonitor;
        this.f332765f = "FinderLiveVoteBubblePresenter";
        this.f332767h = "vote_bubble_close_tag";
        this.f332768i = new my2.f(this);
    }

    public final com.tencent.mm.plugin.finder.live.view.k0 c() {
        qo0.c cVar = this.f332764e;
        if (cVar instanceof com.tencent.mm.plugin.finder.live.view.k0) {
            return (com.tencent.mm.plugin.finder.live.view.k0) cVar;
        }
        return null;
    }

    public final boolean f() {
        if (zl2.r4.f473950a.w1() || ((mm2.c1) this.f332763d.a(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) this.f332763d.a(mm2.n0.class)).f329273r;
    }

    public void g() {
        qo0.c.a(this.f332764e, qo0.b.f365419u2, null, 2, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        r45.me2 me2Var = ((mm2.c1) this.f332763d.a(mm2.c1.class)).f328784b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.getString(5) : null);
        java.lang.Object obj = this.f332766g;
        ie2.a aVar = obj instanceof ie2.a ? (ie2.a) obj : null;
        int i17 = aVar != null && aVar.x() ? 2 : 1;
        if (i17 != 0) {
            jSONObject.put("ui_type", i17);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        my2.b callback = (my2.b) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f332765f, "onAttach");
        this.f332766g = callback;
        my2.y yVar = (my2.y) callback;
        com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "initView!");
        android.view.View t17 = yVar.t(com.tencent.mm.R.id.fqf);
        if (t17 != null) {
            t17.setOnClickListener(new my2.w(yVar));
        }
        yVar.E();
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i(this.f332765f, "onDetach");
        if (this.f332766g != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "reset");
        }
        this.f332766g = null;
        ((ku5.t0) ku5.t0.f312615d).A(this.f332767h);
        com.tencent.mars.xlog.Log.i(this.f332765f, "voteInfo clear task remove");
    }
}
