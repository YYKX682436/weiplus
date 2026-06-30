package ey2;

/* loaded from: classes8.dex */
public final class g0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.k0 f257375d;

    public g0(ey2.k0 k0Var) {
        this.f257375d = k0Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0();
        d0Var.f310114d = f17;
        kotlin.jvm.internal.d0 d0Var2 = new kotlin.jvm.internal.d0();
        d0Var2.f310114d = f18;
        ey2.k0 k0Var = this.f257375d;
        if (z17) {
            k0Var.T6(f17, f18);
            com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "[onGetLocation] longitude=" + d0Var.f310114d + " latitude=" + d0Var2.f310114d);
            com.tencent.mm.autogen.events.FinderLocationRefreshEvent finderLocationRefreshEvent = new com.tencent.mm.autogen.events.FinderLocationRefreshEvent();
            am.hc hcVar = finderLocationRefreshEvent.f54302g;
            hcVar.getClass();
            hcVar.getClass();
            finderLocationRefreshEvent.e();
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2016, f17, f18, (int) d18);
        } else {
            jz5.l P6 = k0Var.P6();
            d0Var.f310114d = ((java.lang.Number) P6.f302833d).floatValue();
            d0Var2.f310114d = ((java.lang.Number) P6.f302834e).floatValue();
            com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "[onGetLocation] from cache. longitude=" + d0Var.f310114d + " latitude=" + d0Var2.f310114d);
        }
        ey2.k0 k0Var2 = this.f257375d;
        pf5.e.launch$default(k0Var2, null, null, new ey2.f0(k0Var2, d0Var2, d0Var, null), 3, null);
        return true;
    }
}
