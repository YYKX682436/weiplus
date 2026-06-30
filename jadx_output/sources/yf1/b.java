package yf1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f461632d;

    public b(yf1.e eVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f461632d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f461632d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen, invalid state");
            return;
        }
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        if (fullscreenImpl == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen, state error");
        } else {
            fullscreenImpl.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "exitFullscreen");
        }
    }
}
