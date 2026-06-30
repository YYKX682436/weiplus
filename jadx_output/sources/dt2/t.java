package dt2;

/* loaded from: classes3.dex */
public final class t implements dt2.c0, fo0.a {

    /* renamed from: d, reason: collision with root package name */
    public final dt2.d0 f243195d;

    /* renamed from: e, reason: collision with root package name */
    public gk2.e f243196e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f243197f;

    /* renamed from: g, reason: collision with root package name */
    public final dt2.k f243198g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243199h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243200i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f243201m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f243202n;

    public t(android.content.Context context, dt2.d0 clickCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        this.f243195d = clickCallback;
        this.f243197f = jz5.h.b(new dt2.j(this));
        this.f243198g = new dt2.k(this);
        this.f243199h = jz5.h.b(new dt2.r(this));
        jz5.h.b(new dt2.q(this));
        this.f243200i = jz5.h.b(new dt2.m(this));
        this.f243201m = jz5.h.b(new dt2.o(this));
        this.f243202n = jz5.h.b(new dt2.s(this));
    }

    public final fo0.n a() {
        return (fo0.n) ((jz5.n) this.f243197f).getValue();
    }

    @Override // dt2.c0
    public void c(int i17) {
        m().setState(8);
    }

    @Override // fo0.a
    public fo0.b d() {
        return new dt2.i(this);
    }

    @Override // dt2.c0
    public void i(int i17) {
        m().setState(0);
    }

    @Override // dt2.c0
    public void j(int i17) {
        m().setState(4);
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView m() {
        return (com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView) ((jz5.n) this.f243199h).getValue();
    }

    public void n() {
        java.util.List list;
        java.util.List list2;
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshMiniWindow:");
        gk2.e eVar = this.f243196e;
        int i17 = 0;
        java.lang.Integer num = null;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(",lastSourceType:");
        sb6.append(em2.d0.A);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveReplayMiniView", sb6.toString());
        if (em2.d0.A == 2) {
            gk2.e eVar2 = this.f243196e;
            if (eVar2 != null && (list2 = ((mm2.o4) eVar2.a(mm2.o4.class)).f329327v) != null) {
                i17 = list2.size();
            }
            if (i17 > 3) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refreshMiniWindow error,AUDIENCE source type but audienceLinkMicUserList size:");
                gk2.e eVar3 = this.f243196e;
                if (eVar3 != null && (list = ((mm2.o4) eVar3.a(mm2.o4.class)).f329327v) != null) {
                    num = java.lang.Integer.valueOf(list.size());
                }
                sb7.append(num);
                com.tencent.mars.xlog.Log.e("FinderLiveReplayMiniView", sb7.toString());
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView m17 = m();
        gk2.e eVar4 = this.f243196e;
        if (m17 == null || eVar4 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView.j(m17, false, eVar4, em2.d0.A, em2.d0.C, em2.d0.B, em2.d0.D, null, 64, null);
    }

    public final void o() {
        a().f();
        ws2.k1.f449066r.a().s((ws2.l2) ((jz5.n) this.f243202n).getValue());
    }

    public final void p(gk2.e eVar) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set business:");
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        com.tencent.mars.xlog.Log.i("FinderLiveReplayMiniView", sb6.toString());
        this.f243196e = eVar;
    }

    public void q(int i17, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMiniWindow:");
        gk2.e eVar = this.f243196e;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(",sourceType:");
        sb6.append(i17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveReplayMiniView", sb6.toString());
        em2.d0.A = i17;
        em2.d0.B = jSONObject2;
        em2.d0.C = jSONObject;
        em2.d0.D = jSONObject3;
        if (i17 == 3 && jSONObject2 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView m17 = m();
        gk2.e eVar2 = this.f243196e;
        if (m17 == null || eVar2 == null) {
            return;
        }
        android.graphics.Point a17 = ko0.t.f309903a.a(((mm2.c1) eVar2.a(mm2.c1.class)).f328879s2, ((mm2.c1) eVar2.a(mm2.c1.class)).f328885t2);
        fo0.c.f264798a.getClass();
        fo0.c.f264799b.a(a17);
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView.j(m17, z17, eVar2, i17, jSONObject, jSONObject2, jSONObject3, null, 64, null);
    }
}
