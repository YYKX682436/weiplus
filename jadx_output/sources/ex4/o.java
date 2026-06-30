package ex4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public boolean f257227c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f257228d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f257229e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f257230f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f257231g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f257232h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f257233i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f257234j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f257235k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f257236l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f257237m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f257238n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f257239o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.core.e3 f257240p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f257241q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257242r;

    /* renamed from: t, reason: collision with root package name */
    public long f257244t;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f257225a = jz5.h.b(ex4.k.f257220d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f257226b = jz5.h.b(ex4.l.f257221d);

    /* renamed from: s, reason: collision with root package name */
    public final ex4.m f257243s = new ex4.m(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.xweb.g1 f257245u = new ex4.n(this);

    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI a() {
        java.lang.ref.WeakReference weakReference = this.f257241q;
        if (weakReference != null) {
            return (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get();
        }
        return null;
    }

    public final void b() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f257240p;
        if (e3Var != null) {
            e3Var.L0(this.f257243s);
            com.tencent.mm.plugin.webview.core.e3 e3Var2 = this.f257240p;
            kotlin.jvm.internal.o.d(e3Var2);
            pm0.v.X(new com.tencent.mm.plugin.webview.core.w(e3Var2));
        }
        if (this.f257232h != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.ArrayList arrayList = com.tencent.mm.plugin.webview.modeltools.c0.f183246a;
                objArr[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData url list size %d", objArr);
                if (!com.tencent.xweb.WebView.x0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "not system WebView, clear all data.");
                    android.webkit.WebStorage.getInstance().deleteAllData();
                } else if (!com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.plugin.webview.modeltools.c0.f183246a)) {
                    java.util.Iterator it = com.tencent.mm.plugin.webview.modeltools.c0.f183246a.iterator();
                    while (it.hasNext()) {
                        android.webkit.WebStorage.getInstance().deleteOrigin(com.tencent.mm.plugin.webview.modeltools.i.a((java.lang.String) it.next()));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.plugin.webview.modeltools.c0.f183246a)) {
                        try {
                            com.tencent.mm.plugin.webview.modeltools.c0.a(com.tencent.mm.plugin.webview.modeltools.c0.f183246a);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies ex %s", e17.getMessage());
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies end");
                    }
                    com.tencent.mm.plugin.webview.modeltools.c0.f183246a.clear();
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData ex %s", e18.getMessage());
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f257232h;
            if (mMWebView != null) {
                mMWebView.setWebViewCallbackClient(null);
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f257232h;
            kotlin.jvm.internal.o.d(mMWebView2);
            mMWebView2.destroy();
            this.f257232h = null;
        }
    }
}
