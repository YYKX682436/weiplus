package fg1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f261906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f261907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f261908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.z f261909g;

    public v(fg1.z zVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f261909g = zVar;
        this.f261906d = v5Var;
        this.f261907e = lVar;
        this.f261908f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f261906d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, invalid state");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f261907e;
        fg1.z zVar = this.f261909g;
        zVar.f(lVar);
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        android.view.View wrapperView = v5Var.a2().getWrapperView();
        if (fullscreenImpl == null || wrapperView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", fullscreenImpl, wrapperView);
            return;
        }
        int i17 = this.f261908f;
        fullscreenImpl.e(wrapperView, i17);
        xi1.c cVar = zVar.f261920a;
        if (cVar != null) {
            fullscreenImpl.d(cVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}
