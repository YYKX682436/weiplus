package ni2;

/* loaded from: classes3.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337511a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f337512b;

    /* renamed from: c, reason: collision with root package name */
    public final qo0.c f337513c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337514d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f337515e;

    /* renamed from: f, reason: collision with root package name */
    public int f337516f;

    /* renamed from: g, reason: collision with root package name */
    public int f337517g;

    public y2(java.lang.String TAG, android.content.Context context, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin, yz5.a closeBlock) {
        kotlin.jvm.internal.o.g(TAG, "TAG");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        kotlin.jvm.internal.o.g(closeBlock, "closeBlock");
        this.f337511a = TAG;
        this.f337512b = context;
        this.f337513c = statusMonitor;
        this.f337514d = basePlugin;
        this.f337515e = closeBlock;
        this.f337517g = 1;
    }

    public void a(android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
    }

    public final void b() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f337512b;
        gk2.e S0 = this.f337514d.S0();
        android.content.Context context2 = this.f337512b;
        java.lang.String string = context2.getString(com.tencent.mm.R.string.ec6);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context2.getString(com.tencent.mm.R.string.f491825ec4);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (r4Var.B(context, S0, string, string2, new ni2.x2(this))) {
            this.f337515e.invoke();
        } else {
            c();
        }
    }

    public final void c() {
        java.lang.String str = this.f337511a;
        com.tencent.mars.xlog.Log.i(str, "SHEET_MORE_ACTION_AUDIO_LINK");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337514d;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.tencent.mars.xlog.Log.i(str, "skip apply mic, disable mic");
            android.content.Context context = this.f337512b;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f491606dn2), 0).show();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f337516f);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f337517g);
        a(bundle);
        qo0.b bVar = qo0.b.F3;
        qo0.c cVar = this.f337513c;
        cVar.statusChange(bVar, bundle);
        this.f337515e.invoke();
        if (cVar.getLiveRole() == 0) {
            if (this.f337517g != 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (u4Var != null && u4Var.k()) {
                    z17 = true;
                }
                if (!z17) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.ik((ml2.r0) c17, ml2.n4.f327740g, null, 0, 6, null);
                    return;
                } else {
                    ml2.n4 n4Var = ml2.n4.f327737J;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 33");
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, n4Var, null, 0, 6, null);
                    return;
                }
            }
            dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.k()) {
                z17 = true;
            }
            if (z17) {
                ml2.n4 n4Var2 = ml2.n4.L;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 35");
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.ik((ml2.r0) c19, n4Var2, null, 0, 6, null);
                return;
            }
            ml2.n4 n4Var3 = ml2.n4.A;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 24");
            i95.m c27 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
        }
    }
}
