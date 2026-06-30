package lf1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f318254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf1.j f318255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f318256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f318257g;

    public g(com.tencent.mm.plugin.appbrand.page.v5 v5Var, lf1.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f318254d = v5Var;
        this.f318255e = jVar;
        this.f318256f = lVar;
        this.f318257g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f318254d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, invalid state");
            return;
        }
        this.f318255e.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "triggerAppFullScreenIfNeed");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f318256f;
        com.tencent.mm.plugin.appbrand.page.n7 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) lVar : lVar instanceof com.tencent.mm.plugin.appbrand.service.c0 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0() : null;
        if (V0 != null && V0.getRuntime().Q0()) {
            V0.getRuntime().H2.f91202h = true;
        }
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        android.view.View wrapperView = v5Var.a2().getWrapperView();
        if (fullscreenImpl == null || wrapperView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", fullscreenImpl, wrapperView);
            return;
        }
        int i17 = this.f318257g;
        fullscreenImpl.e(wrapperView, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}
