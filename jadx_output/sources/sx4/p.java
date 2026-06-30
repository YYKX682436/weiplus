package sx4;

/* loaded from: classes8.dex */
public class p extends sx4.t {
    public final /* synthetic */ sx4.q C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sx4.q qVar, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        super(mMWebView);
        this.C = qVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public java.lang.String F() {
        sx4.s0 s0Var = this.C.f413641e;
        return sx4.s0.f413657a;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public com.tencent.mm.plugin.webview.ui.tools.widget.x3 G() {
        return this.C.f413652p;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public boolean K(java.lang.String str) {
        return ((vz4.x) this.C.f413644h).d(str);
    }

    @Override // sx4.t, com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void L() {
        this.C.f413647k.D = java.lang.System.currentTimeMillis();
        try {
            this.f187551d.Ua(this.f187562o, true, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameFloatWebViewClient", "postBinded, jumpToActivity, ex = " + e17.getMessage());
        }
        if (I(this.f187562o)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(this.f187562o);
        if (parse.getScheme() == null) {
            java.lang.String str = this.f187562o + "http://";
            this.f187562o = str;
            parse = android.net.Uri.parse(str);
        }
        boolean startsWith = parse.getScheme().startsWith("http");
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        if (!startsWith) {
            if (com.tencent.mm.plugin.webview.model.r3.a(this.f187562o)) {
                mMWebView.loadUrl(this.f187562o);
                return;
            } else {
                T(this.f187562o);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebViewClient", "uri scheme not startwith http, scheme = " + parse.getScheme());
        this.f187560m = new com.tencent.mm.plugin.webview.ui.tools.widget.q3(this.f187568u ? "" : this.f187562o);
        this.f187568u = false;
        if (!this.f187556i && !this.f187552e.e(this.f187562o)) {
            if (K(this.f187562o)) {
                M(this.f187562o);
                this.f187563p = this.f187562o;
            }
            X(this.f187562o, false);
            return;
        }
        if (com.tencent.mm.plugin.webview.model.r3.a(this.f187562o)) {
            if (K(this.f187562o)) {
                M(this.f187562o);
                return;
            } else {
                mMWebView.loadUrl(this.f187562o);
                return;
            }
        }
        com.tencent.mars.xlog.Log.f("MicroMsg.GameFloatWebViewClient", "loadInitialUrl, canLoadUrl fail, url = " + this.f187562o);
        T(this.f187562o);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void M(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = ((vz4.x) this.C.f413644h).f441758f;
        if (wepkgVersion == null || !wepkgVersion.f188378h) {
            this.f187549b.loadUrl(str);
        } else {
            super.M(str);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void N() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        mMWebView.removeJavascriptInterface("MicroMsg");
        mMWebView.removeJavascriptInterface("JsApi");
        try {
            mMWebView.setWebChromeClient(null);
            mMWebView.setWebViewClient(null);
            mMWebView.setOnTouchListener(null);
            mMWebView.setOnLongClickListener(null);
            mMWebView.setVisibility(8);
            mMWebView.removeAllViews();
            mMWebView.clearView();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameFloatWebView", "onDestroy, set web infos to null,  ex = %s", e17.getMessage());
        }
        try {
            mMWebView.destroy();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameFloatWebView", "onDestroy, viewWV destroy, ex = %s", e18.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void O(com.tencent.xweb.WebView webView, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "onPageFinished opt, url = %s, now = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        sx4.q qVar = this.C;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = qVar.f413647k;
        if (gameWebPerformanceInfo.F == 0) {
            gameWebPerformanceInfo.F = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f413648l;
        if (d0Var.f413586e == 0) {
            d0Var.f413586e = currentTimeMillis;
        }
        if (gameWebPerformanceInfo.f68193z == 0) {
            gameWebPerformanceInfo.f68193z = currentTimeMillis;
            qVar.f413649m = currentTimeMillis;
        }
        this.f187549b.setVisibility(0);
        ((vz4.x) qVar.f413644h).h(webView, str);
        sx4.u uVar = qVar.f413651o.f413666f;
        uVar.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f413660a;
        vVar.f413663c = currentTimeMillis2;
        vVar.f413664d = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void P(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "onPageStarted opt, url = %s, now = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        sx4.q qVar = this.C;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = qVar.f413647k;
        if (gameWebPerformanceInfo.E == 0) {
            gameWebPerformanceInfo.E = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f413648l;
        if (d0Var.f413585d == 0) {
            d0Var.f413585d = currentTimeMillis;
        }
        sx4.v vVar = qVar.f413651o.f413666f.f413660a;
        vVar.f413665e = null;
        vVar.f413662b = 0L;
        vVar.f413663c = 0L;
        vVar.f413664d = 0L;
        vz4.x xVar = (vz4.x) qVar.f413644h;
        xVar.getClass();
        xVar.f441754b = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void Q(nw4.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "jsapi ready");
        this.C.f413643g = nVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void R(nw4.v2 v2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "jsloader ready");
        this.C.getClass();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void S(com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.permission.w wVar) {
        this.C.f413642f = v0Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void T(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "onURLFilteredOut url:%s", str);
            this.C.f413640d.removeView(this.f187549b);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public boolean V(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.q qVar = this.C;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = qVar.f413647k;
        if (gameWebPerformanceInfo.H == 0) {
            gameWebPerformanceInfo.H = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f413648l;
        if (d0Var.f413588g == 0) {
            d0Var.f413588g = currentTimeMillis;
        }
        return super.V(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void X(java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.q qVar = this.C;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = qVar.f413647k;
        if (gameWebPerformanceInfo.G == 0) {
            gameWebPerformanceInfo.G = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f413648l;
        if (d0Var.f413587f == 0) {
            d0Var.f413587f = currentTimeMillis;
        }
        Y(str, z17, 0);
    }

    @Override // sx4.t, com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public boolean Z(java.lang.String str) {
        return super.Z(str);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3, com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        if (x0Var == null || x0Var.getUrl() == null) {
            return super.x(webView, x0Var);
        }
        com.tencent.xweb.y0 i17 = ((vz4.x) this.C.f413644h).i(webView, x0Var.getUrl().toString(), x0Var);
        return i17 != null ? i17 : super.x(webView, x0Var);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3, com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        if (x0Var == null || x0Var.getUrl() == null) {
            return super.x(webView, x0Var);
        }
        com.tencent.xweb.y0 i17 = ((vz4.x) this.C.f413644h).i(webView, x0Var.getUrl().toString(), x0Var);
        return i17 != null ? i17 : super.y(webView, x0Var, bundle);
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.xweb.y0 i17 = ((vz4.x) this.C.f413644h).i(webView, str, null);
        if (i17 != null) {
            return i17;
        }
        return null;
    }
}
