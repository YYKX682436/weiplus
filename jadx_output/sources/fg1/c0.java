package fg1;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.b0 f261853d;

    public c0(fg1.b0 b0Var) {
        this.f261853d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f261853d.f261843b;
        if (bVar == null || (m17 = bVar.m()) == null) {
            return;
        }
        android.app.Activity Z0 = m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).Z0() : ((m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) && (m17.getContext() instanceof android.app.Activity)) ? (android.app.Activity) m17.getContext() : null;
        if (Z0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "startKeepScreenOn");
            try {
                Z0.getWindow().addFlags(128);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "startKeepScreenOn exception", e17);
            }
        }
    }
}
