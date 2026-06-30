package nd1;

/* loaded from: classes7.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.a2 f336430f;

    public z1(com.tencent.mm.plugin.appbrand.y yVar, int i17, nd1.a2 a2Var) {
        this.f336428d = yVar;
        this.f336429e = i17;
        this.f336430f = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336428d;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar : yVar instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) yVar).V0() : null;
        nd1.a2 a2Var = this.f336430f;
        int i17 = this.f336429e;
        if (V0 == null) {
            yVar.a(i17, a2Var.o("fail:page don't exist"));
        } else {
            V0.k3();
            yVar.a(i17, a2Var.o("ok"));
        }
    }
}
