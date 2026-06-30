package yf1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f461630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f461631e;

    public a(yf1.e eVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f461630d = v5Var;
        this.f461631e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f461630d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, invalid state");
            return;
        }
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        android.view.View wrapperView = v5Var.a2().getWrapperView();
        if (fullscreenImpl == null || wrapperView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", fullscreenImpl, wrapperView);
            return;
        }
        int i17 = this.f461631e;
        fullscreenImpl.e(wrapperView, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}
