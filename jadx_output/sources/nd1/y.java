package nd1;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f336423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f336424e;

    public y(com.tencent.mm.plugin.appbrand.o6 o6Var, nd1.c0 c0Var) {
        this.f336423d = o6Var;
        this.f336424e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f336423d;
        boolean q17 = o6Var.H2.q();
        nd1.c0 c0Var = this.f336424e;
        if (!q17) {
            nd1.c0.D(c0Var, o6Var, false);
            return;
        }
        nd1.x xVar = new nd1.x(o6Var, c0Var);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
        l0Var.getClass();
        com.tencent.mm.plugin.appbrand.widget.halfscreen.t tVar = new com.tencent.mm.plugin.appbrand.widget.halfscreen.t(xVar, l0Var);
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
        if (f0Var != null) {
            com.tencent.mm.plugin.appbrand.widget.f0.e0(f0Var, com.tencent.mm.plugin.appbrand.widget.c0.f91068h, tVar, false, 4, null);
        }
    }
}
