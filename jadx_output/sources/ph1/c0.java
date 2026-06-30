package ph1;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f354309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f354310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.d0 f354311f;

    public c0(ph1.d0 d0Var, boolean z17, java.util.List list) {
        this.f354311f = d0Var;
        this.f354309d = z17;
        this.f354310e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph1.d0 d0Var = this.f354311f;
        boolean L0 = d0Var.f354314c.f354329f.L0();
        java.lang.String str = d0Var.f354312a;
        ph1.g0 g0Var = d0Var.f354314c;
        if (L0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad with module(%s) but runtime(%s) destroyed", str, g0Var.f354329f.toString());
            return;
        }
        boolean z17 = this.f354309d;
        if (z17) {
            ze.n nVar = g0Var.f354329f;
            kotlin.jvm.internal.o.g(nVar, "<this>");
            com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(nVar, false);
            com.tencent.mm.plugin.appbrand.appcache.la laVar = o17 instanceof com.tencent.mm.plugin.appbrand.appcache.la ? (com.tencent.mm.plugin.appbrand.appcache.la) o17 : null;
            java.lang.Object obj = laVar != null ? laVar.f75655a : null;
            com.tencent.mm.plugin.appbrand.appcache.ac acVar = obj instanceof com.tencent.mm.plugin.appbrand.appcache.ac ? (com.tencent.mm.plugin.appbrand.appcache.ac) obj : null;
            if (acVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad with module(%s) but runtime(%s) has no reader", str, g0Var.f354329f.toString());
                return;
            } else {
                acVar.o(this.f354310e);
                if (!g0Var.f354329f.m0().f305749s.booleanValue()) {
                    g0Var.f354329f.w2();
                }
            }
        }
        ph1.g0.h(g0Var, str, z17 ? ph1.g.OK : ph1.g.FAIL);
    }
}
