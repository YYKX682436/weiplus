package of1;

/* loaded from: classes7.dex */
public final class v0 extends com.tencent.mm.plugin.webview.core.e3 implements com.tencent.mm.plugin.appbrand.jsapi.webview.l, of1.x1 {
    public final int N1;
    public final java.lang.String O1;
    public final java.lang.String P1;
    public final java.lang.String Q1;
    public final int R1;
    public final java.lang.String S1;
    public final java.lang.String T1;
    public final boolean U1;
    public final jz5.g V1;
    public com.tencent.mm.plugin.appbrand.jsapi.webview.o W1;
    public of1.m X1;
    public of1.v Y1;
    public yz5.l Z1;

    /* renamed from: a2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.WebViewTransHelper f345022a2;

    /* renamed from: b2, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.h4 f345023b2;

    /* renamed from: c2, reason: collision with root package name */
    public final long f345024c2;

    /* renamed from: d2, reason: collision with root package name */
    public final boolean f345025d2;

    /* renamed from: e2, reason: collision with root package name */
    public java.lang.String f345026e2;

    /* renamed from: f2, reason: collision with root package name */
    public java.lang.String f345027f2;

    /* renamed from: g2, reason: collision with root package name */
    public final of1.w f345028g2;

    /* renamed from: h2, reason: collision with root package name */
    public final of1.u0 f345029h2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(com.tencent.mm.ui.widget.MMWebView r26, int r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33, java.lang.String r34, boolean r35) {
        /*
            r25 = this;
            r8 = r25
            r9 = r26
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r33
            r14 = r34
            java.lang.String r0 = "viewWV"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "getA8KeyMsgUsername"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "getA8keyMsgTalkerName"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "msgId"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "sceneNote"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "weAppUserName"
            kotlin.jvm.internal.o.g(r14, r0)
            r2 = 0
            zg0.k2 r3 = new zg0.k2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 127(0x7f, float:1.78E-43)
            r24 = 0
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r27
            r3.f472753f = r0
            r4 = 0
            of1.w0 r5 = of1.w0.f345031b
            r6 = 2
            r7 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r28
            r8.N1 = r0
            r8.O1 = r10
            r8.P1 = r11
            r8.Q1 = r12
            r0 = r32
            r8.R1 = r0
            r8.S1 = r13
            r8.T1 = r14
            r0 = r35
            r8.U1 = r0
            of1.d0 r0 = new of1.d0
            r0.<init>(r8)
            jz5.g r0 = jz5.h.b(r0)
            r8.V1 = r0
            com.tencent.mm.plugin.webview.model.h4 r0 = new com.tencent.mm.plugin.webview.model.h4
            r0.<init>()
            r8.f345023b2 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r8.f345024c2 = r0
            r0 = 1
            r8.f345025d2 = r0
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r2 = e42.d0.clicfg_android_appbrand_cover_webview_remove_clear_history_logic
            h62.d r1 = (h62.d) r1
            int r1 = r1.Ni(r2, r0)
            if (r1 != r0) goto La0
            of1.a0 r0 = new of1.a0
            r0.<init>(r8)
            goto La5
        La0:
            of1.c0 r0 = new of1.c0
            r0.<init>(r8)
        La5:
            r8.f345028g2 = r0
            of1.u0 r0 = new of1.u0
            r0.<init>(r8, r9)
            r8.f345029h2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.v0.<init>(com.tencent.mm.ui.widget.MMWebView, int, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void B1(of1.v0 v0Var) {
        v0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", v0Var.P1);
        intent.putExtra("msgUsername", v0Var.O1);
        intent.putExtra("serverMsgID", v0Var.Q1);
        intent.putExtra("createTime", v0Var.f345024c2);
        v0Var.f345023b2.a(v0Var.f181916a, v0Var.O().f183390j, v0Var.O().f183390j, v0Var.Q(), intent);
    }

    public static final void C1(of1.v0 v0Var, java.lang.String str) {
        v0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("geta8key_username", v0Var.P1);
        intent.putExtra("geta8key_msg_scene", v0Var.N1);
        intent.putExtra("msgUsername", v0Var.O1);
        intent.putExtra("serverMsgID", v0Var.Q1);
        intent.putExtra("weapp_scene", v0Var.R1);
        intent.putExtra("weapp_scene_note", v0Var.S1);
        intent.putExtra("weapp_username", v0Var.T1);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        intent.putExtra("geta8key_open_webview_appid", ((of1.w1) oVar).getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar2 = v0Var.W1;
        if (oVar2 == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        intent.putExtra("KSetHiddenOnCaptureAsDefault", ((of1.w1) oVar2).m533getPageView().j3());
        v0Var.j(intent);
        if (v0Var.G0 != null) {
            v0Var.s0(str);
        }
    }

    public final java.lang.String D1() {
        return (java.lang.String) this.V1.getValue();
    }

    public final com.tencent.xweb.y0 E1(android.net.Uri uri) {
        byte[] bArr;
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        if (!((of1.w1) oVar).f345033d.q2()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return null;
        }
        if (!kotlin.jvm.internal.o.b(uri.getScheme(), "wagame")) {
            return null;
        }
        if (!kotlin.jvm.internal.o.b(uri.getPath(), "/getemoticon") && !kotlin.jvm.internal.o.b(uri.getPath(), "getemoticon")) {
            return null;
        }
        java.lang.String queryParameter = uri.getQueryParameter("md5");
        java.lang.String queryParameter2 = uri.getQueryParameter("encrypturl");
        java.lang.String queryParameter3 = uri.getQueryParameter("aeskey");
        if ((queryParameter == null || queryParameter.length() == 0) || !this.R.c().f(414) || (bArr = (byte[]) kotlinx.coroutines.l.f(null, new of1.h0(queryParameter, queryParameter2, queryParameter3, null), 1, null)) == null) {
            return null;
        }
        return new com.tencent.xweb.y0("image/gif", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream(bArr));
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public void F0() {
        super.F0();
        nw4.n g07 = g0();
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        g07.B = ((of1.w1) oVar).getAppId();
        nw4.n g08 = g0();
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar2 = this.W1;
        if (oVar2 == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 m533getPageView = ((of1.w1) oVar2).m533getPageView();
        g08.C = m533getPageView != null ? m533getPageView.X1() : null;
    }

    public final void F1(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var = null;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 m533getPageView = ((of1.w1) oVar).m533getPageView();
        if (m533getPageView != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = m533getPageView.t3();
            if (t37 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            } else {
                o4Var = t37.T1;
            }
            if (o4Var == null) {
                return;
            }
            if (z17) {
                of1.j0 j0Var = new of1.j0(this);
                this.Z1 = j0Var;
                o4Var.f90526d.add(j0Var);
            }
            n1().b(o4Var.f90525c, com.tencent.mm.plugin.webview.ui.tools.qd.f186784f);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean G(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (url.length() == 0) {
            return true;
        }
        if (android.webkit.URLUtil.isAboutUrl(url)) {
            return false;
        }
        if (android.webkit.URLUtil.isFileUrl(url)) {
            return kotlin.jvm.internal.o.b("file:///android_asset/jsapi/wxjs.js", url);
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        java.lang.String host = parse.getHost();
        if (host == null || host.length() == 0) {
            return true;
        }
        java.lang.String host2 = parse.getHost();
        if (host2 == null) {
            host2 = "";
        }
        kotlin.jvm.internal.o.f(nf.s.a(), "getSelfIp(...)");
        return !r26.n0.B(host2, r0, false);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public boolean I0(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        if (!r26.i0.y(url, "file:///android_asset", false)) {
            return super.I0(webView, url);
        }
        com.tencent.mars.xlog.Log.w(D1(), "overrideUrl found ".concat(url));
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public com.tencent.mm.protocal.JsapiPermissionWrapper c0(zg0.k2 options) {
        kotlin.jvm.internal.o.g(options, "options");
        if (this.U1) {
            return new com.tencent.mm.protocal.JsapiPermissionWrapper(1);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.core.e3
    public boolean h1(java.lang.String str) {
        boolean z17 = false;
        if (str != null && nf.e.c(str, "weixin://dl/", true)) {
            z17 = true;
        }
        if (z17 && this.f345025d2) {
            return true;
        }
        return super.h1(str);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void k(com.tencent.xweb.WebView view, java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean z18 = false;
        if (android.webkit.URLUtil.isAboutUrl(url)) {
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 2, 1));
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 6, 1));
        } else if (r26.i0.y(url, "file:///android_asset/", false)) {
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 4, 1));
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 6, 1));
        } else if (!android.webkit.URLUtil.isNetworkUrl(url)) {
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 6, 1));
        }
        if (android.webkit.URLUtil.isAboutUrl(view.getUrl())) {
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 1, 1));
            linkedList.add(new com.tencent.mars.smc.IDKey(1097, 5, 1));
        } else {
            java.lang.String url2 = view.getUrl();
            if (url2 != null && r26.i0.y(url2, "file:///android_asset/", false)) {
                linkedList.add(new com.tencent.mars.smc.IDKey(1097, 3, 1));
                linkedList.add(new com.tencent.mars.smc.IDKey(1097, 5, 1));
            } else if (!android.webkit.URLUtil.isNetworkUrl(view.getUrl())) {
                linkedList.add(new com.tencent.mars.smc.IDKey(1097, 5, 1));
            }
        }
        if (!linkedList.isEmpty()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(new java.util.ArrayList(linkedList), false, false);
        }
        if (!android.webkit.URLUtil.isAboutUrl(view.getUrl())) {
            java.lang.String url3 = view.getUrl();
            if (url3 != null && r26.i0.y(url3, "file:///android_asset/", false)) {
                z18 = true;
            }
            if (!z18) {
                super.k(view, url, z17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(D1(), "WebView-Trace doUpdateVisitedHistory, url = " + url + ", wvUrl = " + view.getUrl() + ", isReload = " + z17 + ". invalid view.url");
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void m(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.m(webView, str);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).a0(str);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.n(webView, str);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).c0(str);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView view, java.lang.String url, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        super.o(view, url, bitmap);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).m0(url);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public java.lang.Object o0(nw4.n jsapi) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        return new of1.n(this);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0, com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        super.p(webView, i17, str, str2);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).n0(str2, i17, str);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public void r0() {
        E(new of1.g0(this));
        super.r0();
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, com.tencent.xweb.h1
    public void s(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        super.s(webView, x0Var, y0Var);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).q0(x0Var, y0Var);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        super.t(webView, l0Var, sslError);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            ((of1.w1) oVar).r0(sslError);
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public com.tencent.xweb.y0 u0(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        int i17 = bundle != null ? bundle.getInt("resourceType") : 0;
        if (i17 == 1 || i17 == 7) {
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            ((of1.w1) oVar).u0(Z(), request);
        }
        return super.u0(webview, request, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3
    public boolean u1() {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.W1;
        if (oVar != null) {
            return ((of1.w1) oVar).T();
        }
        kotlin.jvm.internal.o.o("mView");
        throw null;
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            kotlin.jvm.internal.o.f(parse, "parse(...)");
            return E1(parse);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(D1(), "shouldInterceptRequest called as legacy method, try intercept gif but get exception:" + e17);
            return null;
        }
    }
}
