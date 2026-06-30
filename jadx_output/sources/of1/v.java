package of1;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.plugin.webview.ui.tools.widget.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.webview.o f345014e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f345015f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f345016g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.n f345017h;

    /* renamed from: i, reason: collision with root package name */
    public final nf.k f345018i;

    /* renamed from: j, reason: collision with root package name */
    public final nf.n f345019j;

    /* renamed from: k, reason: collision with root package name */
    public of1.u f345020k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f345021l;

    public v(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar, yz5.a aVar, boolean z17) {
        super(mMWebView);
        this.f345017h = new of1.p(this);
        this.f345018i = new of1.q(this);
        this.f345019j = new of1.r(this);
        this.f345014e = oVar;
        this.f345015f = aVar;
        this.f345016g = z17;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        cf.o.a(consoleMessage, "MicroMsg.AppBrand.HTMLWebChromeClient", false);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f345014e;
        if (((of1.w1) oVar).v0()) {
            if (this.f345020k == null) {
                this.f345020k = new of1.u(this, null);
            }
            of1.u uVar = this.f345020k;
            android.content.Context context = ((of1.w1) oVar).m533getPageView().getContext();
            uVar.getClass();
            android.content.ComponentCallbacks2 a17 = q75.a.a(context);
            if (a17 instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.c) {
                com.tencent.mm.plugin.appbrand.platform.window.activity.c cVar = (com.tencent.mm.plugin.appbrand.platform.window.activity.c) a17;
                uVar.f345010a = cVar;
                ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) cVar).U.add(uVar);
            }
        }
        java.lang.String appId = ((of1.w1) oVar).getAppId();
        of1.s sVar = new of1.s(this);
        this.f345021l = sVar;
        com.tencent.mm.plugin.appbrand.x0.a(appId, sVar);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean d() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.c cVar;
        of1.u uVar = this.f345020k;
        if (uVar != null && (cVar = uVar.f345010a) != null) {
            ((java.util.HashSet) ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) cVar).U).remove(uVar);
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f345014e;
        com.tencent.mm.plugin.appbrand.x0.e(((of1.w1) oVar).getAppId(), this.f345021l);
        oVar.post(new of1.t(this));
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p2, com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        if (!this.f345016g) {
            super.g(str, callback);
        } else if (callback != null) {
            callback.invoke(str, true, false);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p2, com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        of1.w1 w1Var = (of1.w1) this.f345014e;
        w1Var.getClass();
        if (!android.webkit.URLUtil.isValidUrl(str)) {
            w1Var.f345034e.e3(str);
        } else if (u46.l.a(str, w1Var.f345039m) || u46.l.a(str, w1Var.f345040n)) {
            w1Var.f345034e.e3("");
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean q(com.tencent.xweb.WebView webView, android.webkit.ValueCallback valueCallback, com.tencent.xweb.r0 r0Var) {
        nf.g a17;
        com.tencent.mm.plugin.webview.permission.w wVar = (com.tencent.mm.plugin.webview.permission.w) this.f345015f.invoke();
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f345014e;
        android.app.Activity v17 = ((of1.w1) oVar).m533getPageView() != null ? ((of1.w1) oVar).m533getPageView().v1() : null;
        if (wVar != null && v17 != null) {
            if (r0Var.c() != 0 && r0Var.c() != 1) {
                return false;
            }
            if (r0Var.b() != null && r0Var.b().length > 0) {
                java.lang.String[] b17 = r0Var.b();
                java.lang.String str = r0Var.d() ? "true" : "false";
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
                of1.w1 w1Var = (of1.w1) oVar;
                android.app.Activity v18 = w1Var.m533getPageView() != null ? w1Var.m533getPageView().v1() : null;
                if (v18 != null && (a17 = nf.g.a(v18)) != null) {
                    a17.f(this.f345018i);
                    nf.n nVar = this.f345019j;
                    if (nVar != null) {
                        a17.f336583b.put(119, nVar);
                    }
                }
                this.f345017h.c(v17, wVar, valueCallback, b17, str, r0Var.a(), r0Var.c());
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p2
    public void s() {
        of1.w1 w1Var = (of1.w1) this.f345014e;
        com.tencent.mm.plugin.appbrand.page.w2 w17 = w1Var.f345034e.w1();
        if (w17 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.d5 x07 = w1Var.f345033d.x0();
        x07.getClass();
        x07.c0(new com.tencent.mm.plugin.appbrand.page.l3(x07, w17, "scene_other", null));
    }

    public final void t() {
        nf.g a17;
        of1.w1 w1Var = (of1.w1) this.f345014e;
        android.app.Activity v17 = w1Var.m533getPageView() != null ? w1Var.m533getPageView().v1() : null;
        if (v17 == null || (a17 = nf.g.a(v17)) == null) {
            return;
        }
        nf.k kVar = this.f345018i;
        if (kVar != null) {
            a17.f336584c.remove(kVar);
        }
        if (this.f345019j == null) {
            return;
        }
        a17.f336583b.remove(119);
    }
}
