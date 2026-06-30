package ls1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final r45.wm6 f320988b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f320989c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.g3 f320990d;

    public h(r45.wm6 tmplParams, com.tencent.mm.ui.widget.MMWebView viewWV) {
        kotlin.jvm.internal.o.g(tmplParams, "tmplParams");
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        this.f320988b = tmplParams;
        this.f320989c = viewWV;
        this.f320990d = new ls1.e();
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return this.f320990d;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        ls1.f fVar;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        r45.wm6 wm6Var = this.f320988b;
        if (!kotlin.jvm.internal.o.b(uri, wm6Var.f389294f)) {
            java.lang.String PREFIX = is1.l.f294425c;
            kotlin.jvm.internal.o.f(PREFIX, "PREFIX");
            if (!r26.i0.y(uri, PREFIX, false)) {
                return null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "getResourceResponse, requrl:%s, url:%s", uri, wm6Var.f389295g);
        if (request.isForMainFrame()) {
            java.lang.String initFilePath = wm6Var.f389295g;
            kotlin.jvm.internal.o.f(initFilePath, "initFilePath");
            fVar = new ls1.f(initFilePath, false);
        } else {
            java.lang.String HARDCODE_URL = is1.l.f294424b;
            kotlin.jvm.internal.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (r26.i0.y(uri, HARDCODE_URL, false)) {
                int i17 = wm6Var.f389292d;
                java.lang.String uid = wm6Var.f389297i;
                kotlin.jvm.internal.o.f(uid, "uid");
                kotlin.jvm.internal.o.f(HARDCODE_URL, "HARDCODE_URL");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile(HARDCODE_URL);
                kotlin.jvm.internal.o.f(compile, "compile(...)");
                java.lang.String replaceFirst = compile.matcher(uri).replaceFirst("");
                kotlin.jvm.internal.o.f(replaceFirst, "replaceFirst(...)");
                fVar = new ls1.f(com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.b(i17, uid, replaceFirst), true);
            } else {
                java.lang.String PREFIX2 = is1.l.f294425c;
                kotlin.jvm.internal.o.f(PREFIX2, "PREFIX");
                if (r26.i0.y(uri, PREFIX2, false)) {
                    int i18 = wm6Var.f389292d;
                    java.lang.String uid2 = wm6Var.f389297i;
                    kotlin.jvm.internal.o.f(uid2, "uid");
                    kotlin.jvm.internal.o.f(PREFIX2, "PREFIX");
                    java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(PREFIX2);
                    kotlin.jvm.internal.o.f(compile2, "compile(...)");
                    java.lang.String replaceFirst2 = compile2.matcher(uri).replaceFirst("");
                    kotlin.jvm.internal.o.f(replaceFirst2, "replaceFirst(...)");
                    fVar = new ls1.f(com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.b(i18, uid2, replaceFirst2), true);
                } else {
                    fVar = null;
                }
            }
        }
        if (fVar != null) {
            com.tencent.xweb.y0 a17 = ls1.c.a(ls1.e0.f320974i2, this.f320989c, fVar.f320983a);
            if (a17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "return intercepted success");
                return a17;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewController", "return intercepted null");
            ax4.a.b(wm6Var.f389300o, 126, 1, true);
            if (fVar.f320984b) {
                ax4.a.b(wm6Var.f389300o, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, 1, true);
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean m(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.r0 c17 = c();
        ls1.e0 e0Var = c17 instanceof ls1.e0 ? (ls1.e0) c17 : null;
        if (e0Var == null) {
            return false;
        }
        if (!e0Var.p0(e0Var.f181933i0) || !kotlin.jvm.internal.o.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(url), com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(e0Var.i()))) {
            if (!e0Var.p0(-121)) {
                return false;
            }
            java.lang.String k17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(url);
            java.lang.String str = e0Var.X1;
            if (str == null) {
                kotlin.jvm.internal.o.o("fullUrl");
                throw null;
            }
            if (!kotlin.jvm.internal.o.b(k17, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(str))) {
                return false;
            }
        }
        if (!c().M()) {
            return false;
        }
        java.util.Iterator it = e0Var.Z.iterator();
        while (it.hasNext()) {
            pm0.v.X(new ls1.g((com.tencent.mm.plugin.webview.core.f3) it.next()));
        }
        e0Var.f181921c0 = true;
        e0Var.V0(e0Var.E1(url), true, 8);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.webview.core.r0 c17 = c();
        ls1.e0 e0Var = c17 instanceof ls1.e0 ? (ls1.e0) c17 : null;
        if (e0Var != null && request.isForMainFrame() && request.getUrl() != null) {
            com.tencent.mars.xlog.Log.i(e0Var.B1(), "edw opt, shouldOverride url isForMainFrame");
            java.lang.String uri = request.getUrl().toString();
            kotlin.jvm.internal.o.f(uri, "toString(...)");
            java.lang.String HARDCODE_URL = ax4.a.f15114a;
            kotlin.jvm.internal.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (!r26.i0.y(uri, HARDCODE_URL, false) && c().M()) {
                com.tencent.mars.xlog.Log.i(e0Var.B1(), "edw opt, shouldOverride url exitTmpl");
                e0Var.H1();
                e0Var.f181921c0 = true;
            }
        }
        return super.q(webView, request);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        if (i17 == 0 && hy4.i.p(fullUrl) && kotlin.jvm.internal.o.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(reqUrl), com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(fullUrl))) {
            return true;
        }
        super.s(i17, z17, reqUrl, fullUrl);
        return false;
    }
}
