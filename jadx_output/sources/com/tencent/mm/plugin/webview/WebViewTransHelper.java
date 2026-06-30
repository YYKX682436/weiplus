package com.tencent.mm.plugin.webview;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/webview/WebViewTransHelper;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroyPageLogicController", "Lcw4/n;", "webviewUIStyleDelegate", "<init>", "(Lcw4/n;)V", "cw4/y0", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WebViewTransHelper implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final cw4.n f181741d;

    /* renamed from: e, reason: collision with root package name */
    public cw4.m0 f181742e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181743f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f181744g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f181745h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f181746i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.i0 f181747m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181748n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181749o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181750p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181751q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Object f181752r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f181753s;

    public WebViewTransHelper(cw4.n webviewUIStyleDelegate) {
        kotlin.jvm.internal.o.g(webviewUIStyleDelegate, "webviewUIStyleDelegate");
        this.f181741d = webviewUIStyleDelegate;
        this.f181744g = new java.util.LinkedHashMap();
        this.f181745h = new androidx.lifecycle.j0();
        this.f181746i = new androidx.lifecycle.j0();
        this.f181747m = new androidx.lifecycle.i0();
        this.f181749o = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f181751q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.WebViewTransHelper$onTranslateLanguageChangedListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54035g == null) {
                    return false;
                }
                com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = com.tencent.mm.plugin.webview.WebViewTransHelper.this;
                webViewTransHelper.getClass();
                webViewTransHelper.f(cw4.n0.f224255e, cw4.o0.f224261h);
                ((java.util.LinkedHashMap) webViewTransHelper.f181744g).clear();
                if (webViewTransHelper.f181745h.getValue() != cw4.p0.f224265f) {
                    webViewTransHelper.h(null);
                    return false;
                }
                webViewTransHelper.g(new cw4.g1(webViewTransHelper));
                return false;
            }
        };
        this.f181752r = new java.lang.Object();
        this.f181753s = new java.util.ArrayList();
        this.f181748n = false;
        if (kotlin.jvm.internal.o.b(webviewUIStyleDelegate.c(), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "fast open");
            d(webviewUIStyleDelegate.getWebView());
            c().d();
        }
    }

    public static final void a(com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper) {
        cw4.n nVar = webViewTransHelper.f181741d;
        if (kotlin.jvm.internal.o.b(nVar.f(0), java.lang.Boolean.FALSE)) {
            nVar.a(cw4.c0.f224202e, cw4.d0.f224206d);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "forbid menu!");
            return;
        }
        androidx.lifecycle.j0 j0Var = webViewTransHelper.f181745h;
        cw4.p0 p0Var = (cw4.p0) j0Var.getValue();
        int i17 = p0Var == null ? -1 : cw4.z0.f224310a[p0Var.ordinal()];
        cw4.d0 d0Var = i17 != 1 ? i17 != 2 ? cw4.d0.f224206d : cw4.d0.f224206d : cw4.d0.f224207e;
        if (webViewTransHelper.c().f224253v.getValue() != cw4.y.f224300e && !webViewTransHelper.c().f224244m && j0Var.getValue() != cw4.p0.f224265f) {
            nVar.a(cw4.c0.f224202e, d0Var);
            return;
        }
        if (j0Var.getValue() == cw4.p0.f224265f) {
            nVar.a(cw4.c0.f224203f, d0Var);
            return;
        }
        androidx.lifecycle.j0 j0Var2 = webViewTransHelper.f181746i;
        java.lang.Integer num = j0Var2.getValue() == null ? 0 : (java.lang.Integer) j0Var2.getValue();
        if (num != null) {
            if (num.intValue() < 100) {
                nVar.a(cw4.c0.f224203f, d0Var);
            } else {
                nVar.a(cw4.c0.f224202e, d0Var);
            }
        }
    }

    public final void b(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "get web page content: ".concat(content));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new cw4.a1(this, content));
    }

    public final cw4.m0 c() {
        cw4.m0 m0Var = this.f181742e;
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.jvm.internal.o.o("pageLogicController");
        throw null;
    }

    public final void d(com.tencent.xweb.WebView webView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "initPage");
        synchronized (this.f181752r) {
            kotlin.jvm.internal.o.e(webView, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMWebView");
            cw4.m0 m0Var = new cw4.m0((com.tencent.mm.ui.widget.MMWebView) webView);
            m0Var.f224245n = new cw4.f1(this);
            this.f181742e = m0Var;
        }
        this.f181748n = true;
        cw4.n nVar = this.f181741d;
        if (nVar.getLifecycleOwner() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "initObserver");
            androidx.lifecycle.j0 j0Var = c().f224246o;
            androidx.lifecycle.y lifecycleOwner = nVar.getLifecycleOwner();
            kotlin.jvm.internal.o.d(lifecycleOwner);
            j0Var.observe(lifecycleOwner, new cw4.b1(this));
            androidx.lifecycle.i0 i0Var = new androidx.lifecycle.i0();
            i0Var.addSource(c().f224253v, new cw4.c1(this));
            i0Var.addSource(this.f181745h, new cw4.d1(this));
            androidx.lifecycle.y lifecycleOwner2 = nVar.getLifecycleOwner();
            kotlin.jvm.internal.o.d(lifecycleOwner2);
            i0Var.observe(lifecycleOwner2, new cw4.e1(this));
            this.f181747m = i0Var;
        }
        this.f181751q.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "notifyPageInit");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f181752r) {
            arrayList.addAll(this.f181753s);
            this.f181753s.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void destroyPageLogicController() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "destroy");
        if (this.f181742e != null) {
            c().f224247p.g(androidx.lifecycle.n.DESTROYED);
        }
    }

    public final void e(cw4.b0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (this.f181742e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "pageLogic is not initialized!");
            return;
        }
        if (this.f181741d.getLifecycleOwner() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "onChangeTransStatus Entry Scene " + scene);
        cw4.p0 p0Var = (cw4.p0) this.f181745h.getValue();
        int i17 = p0Var == null ? -1 : cw4.z0.f224310a[p0Var.ordinal()];
        if (i17 != -1) {
            if (i17 == 1) {
                f(cw4.n0.f224255e, scene == cw4.b0.f224197e ? cw4.o0.f224260g : cw4.o0.f224259f);
                g(null);
                return;
            } else if (i17 != 2 && i17 != 3) {
                return;
            }
        }
        f(cw4.n0.f224255e, scene == cw4.b0.f224197e ? cw4.o0.f224257d : cw4.o0.f224258e);
        cw4.m0 c17 = c();
        java.lang.String b17 = c17.b(c17.f224243i);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
        } else {
            c17.f224251t = 0;
            c17.f224238d.evaluateJavascript(b17, new cw4.h0(c17, b17));
        }
    }

    public final void f(cw4.n0 action, cw4.o0 scene) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f181741d.e(action, scene);
    }

    public final void g(yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "revertTrans");
        this.f181745h.postValue(cw4.p0.f224266g);
        cw4.m0 c17 = c();
        c17.f224246o.setValue(cw4.q0.f224269d);
        cw4.x xVar = c17.f224241g;
        xVar.f224292f.clear();
        xVar.f224290d.g(androidx.lifecycle.n.DESTROYED);
        kotlinx.coroutines.r2 r2Var = c17.f224248q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        c17.a(c17.f224238d, "window.WeixinTranslate.revertTrans()", aVar);
        cw4.o oVar = c17.f224245n;
        if (oVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "revert");
            ((cw4.f1) oVar).f224218a.f181741d.b("onCallWebTranslateApi", hashMap);
        }
    }

    public final void h(yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "startTrans");
        this.f181745h.postValue(cw4.p0.f224265f);
        c().c(aVar);
    }
}
