package qx4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qx4.l0 f367422a = new qx4.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f367423b = new java.util.HashMap();

    public static final boolean a() {
        boolean z17;
        if (f367422a.d()) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload WebView, WebView render process not exist");
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload WebView, needUseSysCore: " + z17);
        return z17;
    }

    public final qx4.m0 b(int i17) {
        return (qx4.m0) f367423b.get(java.lang.Integer.valueOf(i17));
    }

    public final qx4.m0 c(int i17, boolean z17) {
        qx4.m0 b17 = b(i17);
        if (b17 == null) {
            return null;
        }
        if (!z17) {
            if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigPreloadWebViewJsNotReady()) != 0) {
                f367423b.remove(java.lang.Integer.valueOf(i17));
                return b17;
            }
            if (!b17.f367431g.get()) {
                return null;
            }
            f367423b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        qx4.d0 d0Var = b17.f367430f;
        boolean z18 = false;
        if (d0Var != null && d0Var.f367396e) {
            z18 = true;
        }
        if (z18 || b17.f367431g.get()) {
            f367423b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        if (f367422a.d()) {
            f367423b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        f367423b.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = b17.f367427c;
        if (baseWebSearchWebView != null) {
            baseWebSearchWebView.clearHistory();
        }
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView2 = b17.f367427c;
        if (baseWebSearchWebView2 != null) {
            baseWebSearchWebView2.clearView();
        }
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView3 = b17.f367427c;
        if (baseWebSearchWebView3 != null) {
            baseWebSearchWebView3.destroy();
        }
        b17.f367427c = null;
        return null;
    }

    public final boolean d() {
        try {
            return com.tencent.mm.sdk.platformtools.x2.o("com.tencent.mm:xweb_sandboxed_process_ex_0") || (com.tencent.xweb.a3.h() > 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchPreloadLogic", "Error checking xweb_sandboxed_process: " + e17.getMessage());
            return true;
        }
    }

    public final void e(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView url:" + url + " reset:" + z17 + " preloadScene:" + i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.websearch.l2.f181562a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView skipped: debug remote url is set");
            return;
        }
        if (z17) {
            pm0.v.X(new qx4.i0(i17));
        }
        pm0.v.X(new qx4.k0(url, i17));
    }
}
