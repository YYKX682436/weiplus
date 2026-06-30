package tf;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.c f418781d;

    public b(tf.c cVar) {
        this.f418781d = cVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        tf.c cVar = this.f418781d;
        java.lang.ref.WeakReference weakReference = cVar.f418789c;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, mPageViewRef is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, thePageView is null");
            return;
        }
        android.app.Activity v17 = v5Var.v1();
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, null == activity");
            return;
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.e0 b17 = com.tencent.mm.plugin.appbrand.platform.window.activity.e0.b(v17);
        com.tencent.mm.plugin.appbrand.platform.window.activity.f0 orientationObserver = cVar.f418793g;
        kotlin.jvm.internal.o.g(orientationObserver, "orientationObserver");
        ((java.util.concurrent.CopyOnWriteArrayList) b17.f87586f).remove(orientationObserver);
        v5Var.K(cVar.f418794h);
    }
}
