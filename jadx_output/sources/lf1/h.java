package lf1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f318258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf1.j f318259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f318260f;

    public h(com.tencent.mm.plugin.appbrand.page.v5 v5Var, lf1.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f318258d = v5Var;
        this.f318259e = jVar;
        this.f318260f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f318258d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, invalid state");
            return;
        }
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        if (fullscreenImpl == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, state error");
            return;
        }
        this.f318259e.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "triggerAppHalfScreenIfNeed");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f318260f;
        com.tencent.mm.plugin.appbrand.page.n7 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) lVar : lVar instanceof com.tencent.mm.plugin.appbrand.service.c0 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0() : null;
        if (V0 != null && V0.getRuntime().Q0() && !V0.getRuntime().u0().L1.P) {
            V0.getRuntime().H2.f91202h = false;
        }
        fullscreenImpl.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen");
    }
}
