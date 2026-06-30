package ig2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ig2.e f291372a = new ig2.e();

    public final boolean a(r45.nw1 liveinfo) {
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(liveinfo, "liveinfo");
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + liveinfo.getLong(0));
        long j17 = liveinfo.getLong(0);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + j17);
        if (j17 == 0) {
            return false;
        }
        gk2.e eVar = gk2.e.f272471n;
        return eVar != null && (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) != null && (j17 > nw1Var.getLong(0) ? 1 : (j17 == nw1Var.getLong(0) ? 0 : -1)) == 0;
    }

    public final boolean b(zy2.nc feedData) {
        kotlin.jvm.internal.o.g(feedData, "feedData");
        r45.nw1 nw1Var = feedData.f477498d;
        if (nw1Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchABTes", "isFluentEnable finderObject liveId: " + nw1Var.getLong(0));
        return f291372a.a(nw1Var);
    }

    public final boolean c() {
        ae2.b2 b2Var = ae2.b2.f3461a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.L).getValue()).r()).intValue() == 1 && d();
    }

    public final boolean d() {
        ae2.b2 b2Var = ae2.b2.f3461a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3460J).getValue()).r()).intValue() != 1 || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.d0()) ? false : true;
    }
}
