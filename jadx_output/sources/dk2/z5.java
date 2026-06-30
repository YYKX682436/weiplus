package dk2;

/* loaded from: classes3.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f234417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f234418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f234419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.s f234420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234421h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.s sVar, int i17) {
        super(0);
        this.f234417d = eVar;
        this.f234418e = xfVar;
        this.f234419f = k6Var;
        this.f234420g = sVar;
        this.f234421h = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.xa xaVar = dk2.xa.f234344a;
        gk2.e eVar = this.f234417d;
        xaVar.i(eVar);
        xaVar.j(eVar, null, null);
        xaVar.g(eVar);
        xaVar.d(eVar);
        dk2.xf xfVar = this.f234418e;
        if (xfVar != null) {
            dk2.xf.g(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v, 2, null, 16, null);
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).f328861p2 = android.os.SystemClock.elapsedRealtimeNanos();
        new com.tencent.mm.autogen.events.FeedLiveLifeEvent().e();
        com.tencent.mm.plugin.finder.assist.n8.f102409b = 3;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 20L);
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportExtrenalSuccLive");
        com.tencent.mm.plugin.finder.assist.u8.f102601c = c01.id.a();
        com.tencent.mm.plugin.finder.assist.u8.c(com.tencent.mm.plugin.finder.assist.u8.f102599a, this.f234417d, 20, 0, "externalSuccLive", null, 16, null);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar2 = this.f234417d;
        zl2.r4 r4Var = zl2.r4.f473950a;
        efVar.p0(eVar2, r4Var.w1(), qo0.b.f365386n, null, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0));
        r4Var.I0().putInt("live_status_flag", 1);
        dk2.k6 k6Var = this.f234419f;
        r45.wp1 wp1Var = k6Var.f233684b;
        r45.kc1 kc1Var = ((mm2.c1) eVar.a(mm2.c1.class)).f328840m;
        wp1Var.set(2, kc1Var != null ? kc1Var.getString(0) : null);
        ya2.g gVar = ya2.h.f460484a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        k6Var.f233684b.set(0, java.lang.Integer.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getInteger(4)));
        k6Var.f233684b.set(3, b17 != null ? b17.w0() : null);
        k6Var.f233684b.set(4, b17 != null ? b17.getAvatarUrl() : null);
        this.f234420g.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(this.f234421h), 0, null, null);
        return jz5.f0.f302826a;
    }
}
