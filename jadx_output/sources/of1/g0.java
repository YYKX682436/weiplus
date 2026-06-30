package of1;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.f3 f344917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344918c;

    public g0(of1.v0 v0Var) {
        this.f344918c = v0Var;
        this.f344917b = new of1.f0(v0Var);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return this.f344917b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f344918c.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        if (((of1.w1) oVar).f345033d.q2()) {
            of1.v0 v0Var = this.f344918c;
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar2 = v0Var.W1;
            if (oVar2 == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            java.lang.String Z = v0Var.Z();
            of1.w1 w1Var = (of1.w1) oVar2;
            com.tencent.mm.plugin.appbrand.report.model.s0 s0Var = w1Var.B;
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = w1Var.f345034e;
            if (!s0Var.f88098a) {
                s0Var.f88105h = Z;
                s0Var.f88106i = request.getUrl().toString();
                s0Var.f88107j = request.getMethod();
                s0Var.f88108k = (java.lang.String) request.getRequestHeaders().get("Referer");
                com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = n7Var.getRuntime().E0();
                if (E0 != null) {
                    s0Var.f88101d = E0.f305852r.pkgVersion;
                }
                s0Var.f88104g = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ze.n runtime = n7Var.getRuntime();
                com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = runtime == null ? null : runtime.u0();
                if (u07 != null) {
                    s0Var.f88103f = u07.f47284z;
                } else {
                    int b17 = com.tencent.mm.plugin.appbrand.report.w0.b(s0Var.f88099b, -1);
                    s0Var.f88103f = b17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_19358", "prepareCommonFields null = initConfig! apptype:%s", java.lang.Integer.valueOf(b17));
                }
                s0Var.f88103f += 1000;
                if (!s0Var.f88098a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_19358", "report " + s0Var.toString());
                    ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(19358, com.tencent.mm.plugin.appbrand.report.o2.a(s0Var.f88099b, java.lang.Integer.valueOf(s0Var.f88101d), java.lang.Integer.valueOf(s0Var.f88102e), java.lang.Integer.valueOf(s0Var.f88103f), s0Var.f88104g, s0Var.f88105h, s0Var.f88106i, s0Var.f88107j, 0, 0, 0, 0, s0Var.f88108k));
                }
            }
        }
        of1.v0 v0Var2 = this.f344918c;
        android.net.Uri url = request.getUrl();
        kotlin.jvm.internal.o.f(url, "getUrl(...)");
        com.tencent.xweb.y0 E1 = v0Var2.E1(url);
        if (E1 != null) {
            return E1;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean j(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        return this.f344918c.f345028g2.c(url, z17, i17);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        if (!request.isForMainFrame() || !v(request.getUrl())) {
            return super.q(webView, request);
        }
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        of1.v0 v0Var = this.f344918c;
        if (com.tencent.mm.plugin.webview.model.k2.e(uri, v0Var.Q())) {
            return super.r(webView, uri);
        }
        com.tencent.mars.xlog.Log.i(v0Var.D1(), "overrideUrl for " + uri + ", force sync geta8key because not in bizDomainList");
        v0Var.V0(uri, true, 8);
        return new com.tencent.mm.plugin.webview.core.h3(true, true);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 r(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        boolean z17 = false;
        boolean z18 = url.length() == 0;
        of1.v0 v0Var = this.f344918c;
        if (!z18) {
            try {
                z17 = v(android.net.Uri.parse(url));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(v0Var.D1(), "check shouldInterceptAndGetA8KeySyncForNotInBizDomainList for url:" + url + " parse uri failed " + e17);
            }
        }
        if (z17 && !com.tencent.mm.plugin.webview.model.k2.e(url, v0Var.Q())) {
            com.tencent.mars.xlog.Log.i(v0Var.D1(), "overrideUrl for " + url + ", force sync geta8key because not in bizDomainList");
            v0Var.V0(url, true, 8);
            return new com.tencent.mm.plugin.webview.core.h3(true, true);
        }
        return super.r(webView, url);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        if (this.f344918c.f345028g2.a(i17, z17, reqUrl, fullUrl)) {
            return true;
        }
        super.s(i17, z17, reqUrl, fullUrl);
        return false;
    }

    public final boolean v(android.net.Uri uri) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f344918c.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        java.util.ArrayList<java.lang.String> bizDomainList = ((of1.w1) oVar).getBizDomainList();
        if (bizDomainList == null || bizDomainList.isEmpty()) {
            return false;
        }
        java.lang.String scheme = uri != null ? uri.getScheme() : null;
        if (!(scheme == null || scheme.length() == 0) && (kotlin.jvm.internal.o.b(scheme, "http") || kotlin.jvm.internal.o.b(scheme, "https"))) {
            java.lang.String host = uri != null ? uri.getHost() : null;
            if (!(host == null || host.length() == 0) && !bizDomainList.contains(host)) {
                return true;
            }
        }
        return false;
    }
}
