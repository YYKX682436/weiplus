package lm1;

/* loaded from: classes7.dex */
public final class a extends fg1.z {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f319338f = "MicroMsg.SameLayer.AppBrandVideoCustomHandlerWC";

    @Override // fg1.z
    public ig1.a a() {
        return new lm1.b();
    }

    @Override // fg1.z
    public boolean c(ye1.e eVar) {
        return !this.f261922c.b(eVar);
    }

    @Override // fg1.z
    public void f(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mars.xlog.Log.i(this.f319338f, "triggerAppFullScreenIfNeed");
        com.tencent.mm.plugin.appbrand.page.n7 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) lVar : lVar instanceof com.tencent.mm.plugin.appbrand.service.c0 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0() : null;
        if (V0 != null && V0.getRuntime().Q0()) {
            V0.getRuntime().H2.f91202h = true;
        }
    }

    @Override // fg1.z
    public void g(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mars.xlog.Log.i(this.f319338f, "triggerAppHalfScreenIfNeed");
        com.tencent.mm.plugin.appbrand.page.n7 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) lVar : lVar instanceof com.tencent.mm.plugin.appbrand.service.c0 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0() : null;
        if (V0 == null || !V0.getRuntime().Q0() || V0.getRuntime().u0().L1.P) {
            return;
        }
        V0.getRuntime().H2.f91202h = false;
    }
}
