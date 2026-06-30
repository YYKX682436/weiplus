package fg1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f261912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f261913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg1.z f261914f;

    public w(fg1.z zVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f261914f = zVar;
        this.f261912d = v5Var;
        this.f261913e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f261912d;
        if (!v5Var.isRunning() || v5Var.a2() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, invalid state");
            return;
        }
        xi1.m fullscreenImpl = v5Var.a2().getFullscreenImpl();
        if (fullscreenImpl == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, state error");
            return;
        }
        this.f261914f.g(this.f261913e);
        fullscreenImpl.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen");
    }
}
