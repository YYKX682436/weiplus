package of1;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f344908d;

    public e1(of1.w1 w1Var) {
        this.f344908d = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of1.x1 webViewController;
        java.lang.Object webViewController2;
        java.util.ArrayList pageLoadingListenerList;
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var;
        of1.w1 w1Var = this.f344908d;
        if (w1Var.f345036g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "destroy hash[%d]", java.lang.Integer.valueOf(w1Var.hashCode()));
        webViewController = this.f344908d.getWebViewController();
        of1.v0 v0Var = (of1.v0) webViewController;
        v0Var.D0();
        com.tencent.mm.plugin.webview.model.h4 h4Var = v0Var.f345023b2;
        h4Var.f182917b.dead();
        h4Var.f182916a.dead();
        h4Var.f182918c = null;
        com.tencent.mm.plugin.webview.model.h4.f182915j = null;
        of1.v vVar = v0Var.Y1;
        if (vVar != null) {
            while (true) {
                java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = vVar.f187493d;
                if (concurrentSkipListSet.isEmpty()) {
                    break;
                } else {
                    ((com.tencent.xweb.z) concurrentSkipListSet.pollFirst()).a();
                }
            }
            vVar.t();
        }
        if (v0Var.Z1 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.page.v5 m533getPageView = ((of1.w1) oVar).m533getPageView();
            if (m533getPageView != null) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = m533getPageView.getRuntime();
                if (runtime == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
                    o4Var = null;
                } else {
                    o4Var = runtime.T1;
                }
                if (o4Var != null) {
                    yz5.l lVar = v0Var.Z1;
                    if (lVar == null) {
                        kotlin.jvm.internal.o.o("screenShotRecordRuntimeSwitchValueChangedCallback");
                        throw null;
                    }
                    o4Var.f90526d.remove(lVar);
                }
            }
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = v0Var.f345022a2;
        if (webViewTransHelper == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        webViewTransHelper.f181751q.dead();
        this.f344908d.f345045s.stopLoading();
        webViewController2 = this.f344908d.getWebViewController();
        ((com.tencent.mm.plugin.webview.core.e3) webViewController2).y1();
        this.f344908d.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f344908d.f345045s;
        if (!mMWebView.f211376y) {
            mMWebView.destroy();
        }
        this.f344908d.f345050x.clear();
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        of1.w1 webview = this.f344908d;
        kotlin.jvm.internal.o.g(webview, "webview");
        android.util.SparseArray sparseArray2 = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        synchronized (sparseArray2) {
            sparseArray2.remove(webview.getBinderID());
        }
        of1.w1 w1Var2 = this.f344908d;
        synchronized (w1Var2.f345051y) {
            pageLoadingListenerList = w1Var2.getPageLoadingListenerList();
            pageLoadingListenerList.clear();
        }
        this.f344908d.f345036g = true;
    }
}
