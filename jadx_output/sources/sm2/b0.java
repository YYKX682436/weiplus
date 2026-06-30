package sm2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f409365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f409366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(sm2.o4 o4Var, long j17, r45.hc1 hc1Var) {
        super(0);
        this.f409364d = o4Var;
        this.f409365e = j17;
        this.f409366f = hc1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        r45.gw0 gw0Var;
        r45.f84 f84Var;
        sm2.o4 o4Var = this.f409364d;
        ((mm2.c1) o4Var.c(mm2.c1.class)).Z9(this.f409365e);
        dk2.xa xaVar = dk2.xa.f234344a;
        xaVar.i(o4Var.f19609a);
        gk2.e eVar = o4Var.f19609a;
        r45.hc1 hc1Var = this.f409366f;
        java.lang.String string = hc1Var.getString(38);
        r45.ic1 ic1Var = (r45.ic1) hc1Var.getCustom(85);
        xaVar.j(eVar, string, (ic1Var == null || (f84Var = (r45.f84) ic1Var.getCustom(12)) == null) ? null : f84Var.getString(1));
        xaVar.g(o4Var.f19609a);
        r45.nw1 nw1Var = (r45.nw1) hc1Var.getCustom(3);
        boolean z17 = pm0.v.z(nw1Var != null ? nw1Var.getInteger(37) : 0, 64);
        java.lang.String str = o4Var.f409610f;
        com.tencent.mars.xlog.Log.i(str, "#handleJoinResp.setAnchorStatus isBizMode=" + z17);
        if (!z17) {
            xaVar.h(o4Var.f19609a, (r45.gw0) hc1Var.getCustom(24));
        }
        r45.nw1 nw1Var2 = (r45.nw1) hc1Var.getCustom(3);
        java.lang.String string2 = (nw1Var2 == null || (gw0Var = (r45.gw0) nw1Var2.getCustom(40)) == null) ? null : gw0Var.getString(1);
        if (!(string2 == null || string2.length() == 0)) {
            ((mm2.d) o4Var.c(mm2.d.class)).O6(z17);
        }
        xaVar.d(o4Var.f19609a);
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.x2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f377129d) || r4Var.y2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f377129d) || r4Var.w2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f377129d)) {
            xaVar.f(o4Var.f19609a);
        }
        if (!((mm2.c1) o4Var.c(mm2.c1.class)).l7()) {
            in0.q qVar = o4Var.f19597e;
            vn0.c cVar = vn0.b.f438174a;
            if (!(qVar != null && qVar.Q == cVar.d().f455432e) && dk2.ef.f233372a.l() && !((mm2.e1) o4Var.c(mm2.e1.class)).f7()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fps Change, oldFps:");
                in0.q qVar2 = o4Var.f19597e;
                sb6.append(qVar2 != null ? java.lang.Integer.valueOf(qVar2.Q) : null);
                sb6.append(" newFps:");
                sb6.append(cVar.d().f455432e);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = o4Var.f409616i;
                if (o9Var != null) {
                    com.tencent.mm.plugin.finder.live.plugin.o9.D1(o9Var, false, false, 3, null);
                }
            }
        }
        dk2.xf g17 = o4Var.g();
        if (g17 != null) {
            dk2.xf.g(g17, ((mm2.e1) o4Var.c(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) o4Var.c(mm2.e1.class)).f328983m, ((mm2.e1) o4Var.c(mm2.e1.class)).f328992v, 2, null, 16, null);
        }
        ((mm2.c1) o4Var.c(mm2.c1.class)).f328861p2 = android.os.SystemClock.elapsedRealtimeNanos();
        fm2.a aVar = o4Var.f19595c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f365386n, null, 2, null);
        }
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null && (data = aVar2.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
            if2.z.f291153a.h(liveRoomControllerStore, hc1Var);
        }
        new com.tencent.mm.autogen.events.FeedLiveLifeEvent().e();
        com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.D.f102540b, null, false, true, 6, null);
        com.tencent.mm.plugin.finder.assist.u8.f102601c = c01.id.a();
        com.tencent.mm.plugin.finder.assist.u8.c(com.tencent.mm.plugin.finder.assist.u8.f102599a, o4Var.f19609a, 17, 0, "anchorSuccLive", null, 16, null);
        return jz5.f0.f302826a;
    }
}
