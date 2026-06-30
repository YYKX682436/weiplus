package uw4;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.ui.widget.MMWebView implements pf.b {
    public final android.os.Handler G;
    public sd.o0 H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f431745J;
    public java.lang.ref.WeakReference K;
    public com.tencent.mm.plugin.webview.luggage.r1 L;
    public com.tencent.mm.plugin.webview.luggage.d0 M;
    public com.tencent.mm.plugin.webview.luggage.q1 N;

    public n(android.content.Context context) {
        super(context, null);
        this.f431745J = false;
        this.L = new uw4.l(this);
        this.M = new uw4.m(this);
        this.N = new uw4.e(this);
        new com.tencent.mm.plugin.webview.permission.d(null);
        this.G = new android.os.Handler(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "config, xweb check update");
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).wi(getContext());
        if (!fp.h.c(19)) {
            try {
                java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
                if (a17 instanceof java.lang.Thread) {
                    java.lang.Thread thread = (java.lang.Thread) a17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == java.lang.Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
            }
        }
        getSettings().P(true);
        getSettings().G(true);
        getSettings().z(true);
        getSettings().M(false);
        getSettings().L(false);
        getSettings().C(true);
        getSettings().D(true);
        getSettings().E(true);
        getSettings().J(0);
        getSettings().l(10485760L);
        getSettings().m(getContext().getDir("webviewcache", 0).getAbsolutePath());
        getSettings().k(true);
        getSettings().t(true);
        getSettings().u(lp0.b.X() + "databases/");
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(this, true);
        getSettings().Q(com.tencent.mm.pluginsdk.ui.tools.e9.b(getContext(), getSettings().g()) + " Luggage");
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(false);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        super.setWebViewClient(this.L);
        super.setWebChromeClient(this.M);
        super.setWebViewClientExtension(this.N);
        F0();
    }

    public void M0() {
        if (getWebCore().f406636o != null) {
            getWebCore().f406636o.a(new com.tencent.mm.plugin.webview.luggage.c0());
            getWebCore().f406636o.a(new com.tencent.mm.plugin.webview.luggage.y(ik1.f.e("luggage_mm_adapter.js")));
        }
    }

    public void N0(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.G.post(runnable);
        }
    }

    public void a0(pf.a aVar) {
        N0(new uw4.g(this, aVar));
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public boolean canGoBack() {
        return super.canGoBack();
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f
    public void destroy() {
        if (this.f431745J) {
            return;
        }
        try {
            try {
                super.destroy();
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageMMWebViewCoreImpl", e17, "destroy()", new java.lang.Object[0]);
            }
        } finally {
            this.f431745J = true;
        }
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        N0(new uw4.f(this, str, valueCallback));
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public java.lang.String getTitle() {
        return super.getTitle();
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public java.lang.String getUrl() {
        return super.getUrl();
    }

    @Override // od.p
    public java.lang.String getUserAgent() {
        return getSettings().g();
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public android.view.View getView() {
        return this;
    }

    public sd.o0 getWebCore() {
        return this.H;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void goBack() {
        super.goBack();
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        uw4.j jVar = new uw4.j(this, str, str2, str3);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            jVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(jVar);
        }
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        uw4.h hVar = new uw4.h(this, str);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            hVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(hVar);
        }
    }

    @Override // pf.b
    public void setContext(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    public void setPage(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.K = new java.lang.ref.WeakReference(e0Var);
    }

    public void setSource(java.lang.String str) {
        this.I = str;
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f
    public void setWebChromeClient(com.tencent.xweb.s0 s0Var) {
        com.tencent.mm.plugin.webview.luggage.d0 d0Var = this.M;
        if (s0Var != null) {
            d0Var.f182163a = s0Var;
        } else {
            d0Var.getClass();
        }
    }

    public void setWebChromeClientProxy(com.tencent.mm.plugin.webview.luggage.d0 d0Var) {
        if (d0Var != null) {
            this.M.f182163a = d0Var;
            this.M = d0Var;
        }
    }

    @Override // pf.b
    public void setWebCore(sd.o0 o0Var) {
        this.H = o0Var;
        M0();
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void setWebViewClient(com.tencent.xweb.h1 h1Var) {
        com.tencent.mm.plugin.webview.luggage.r1 r1Var = this.L;
        if (h1Var != null) {
            r1Var.f182612a = h1Var;
        } else {
            r1Var.getClass();
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void setWebViewClientExtension(com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension) {
        com.tencent.mm.plugin.webview.luggage.q1 q1Var = this.N;
        if (proxyWebViewClientExtension != null) {
            q1Var.f182602a = proxyWebViewClientExtension;
        } else {
            q1Var.getClass();
        }
    }

    public void setWebViewClientExtensionProxy(com.tencent.mm.plugin.webview.luggage.q1 q1Var) {
        if (q1Var != null) {
            this.N.f182602a = q1Var;
            this.N = q1Var;
        }
    }

    public void setWebViewClientProxy(com.tencent.mm.plugin.webview.luggage.r1 r1Var) {
        if (r1Var != null) {
            this.L.f182612a = r1Var;
            this.L = r1Var;
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void stopLoading() {
        super.stopLoading();
    }

    @Override // com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str, java.util.Map map) {
        uw4.i iVar = new uw4.i(this, str, map);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            iVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(iVar);
        }
    }
}
