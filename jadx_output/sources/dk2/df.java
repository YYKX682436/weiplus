package dk2;

/* loaded from: classes3.dex */
public final class df extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.VoipEvent f233332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
        super(0);
        this.f233332d = voipEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            dk2.ef efVar = dk2.ef.f233372a;
            if (dk2.ef.I != null) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent = this.f233332d;
                int i17 = voipEvent.f54945g.f8415b;
                if (i17 == 3 || i17 == 12 || i17 == 5) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "event.data.opcode = " + voipEvent.f54945g.f8415b + ", isAnchor = " + dk2.ef.f233384g);
                    if (!dk2.ef.f233384g) {
                        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                        ml2.e4 e4Var = ml2.e4.f327383o;
                        r0Var.Qk(e4Var);
                        dk2.ef.T(efVar, false, null, 3, null);
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_live_voip_replenish_break, false)) {
                            i95.m c17 = i95.n0.c(ml2.r0.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            ml2.r0 r0Var2 = (ml2.r0) c17;
                            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                            ml2.r0.Ck(r0Var2, k0Var != null ? k0Var.getContext() : null, e4Var, null, false, null, 28, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
