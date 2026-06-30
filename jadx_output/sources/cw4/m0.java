package cw4;

/* loaded from: classes8.dex */
public final class m0 implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f224238d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f224239e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224240f;

    /* renamed from: g, reason: collision with root package name */
    public final cw4.x f224241g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f224242h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f224243i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224244m;

    /* renamed from: n, reason: collision with root package name */
    public cw4.o f224245n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f224246o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.b0 f224247p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f224248q;

    /* renamed from: r, reason: collision with root package name */
    public final long f224249r;

    /* renamed from: s, reason: collision with root package name */
    public final int f224250s;

    /* renamed from: t, reason: collision with root package name */
    public int f224251t;

    /* renamed from: u, reason: collision with root package name */
    public final hy4.g0 f224252u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.j0 f224253v;

    public m0(com.tencent.mm.ui.widget.MMWebView webView) {
        kotlin.jvm.internal.o.g(webView, "webView");
        this.f224238d = webView;
        this.f224239e = "MicroMsg.WebTransPageLogic";
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493666l70);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f224240f = string;
        this.f224241g = new cw4.x();
        this.f224242h = "jsapi/doTranslate.js";
        this.f224243i = "jsapi/preCheckNeedTrans.js";
        this.f224246o = new androidx.lifecycle.j0();
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(this, true);
        this.f224247p = b0Var;
        b0Var.g(androidx.lifecycle.n.CREATED);
        this.f224249r = 500L;
        this.f224250s = 10;
        this.f224252u = new hy4.g0();
        this.f224253v = new androidx.lifecycle.j0();
    }

    public final void a(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str, yz5.a aVar) {
        try {
            mMWebView.evaluateJavascript(str, new cw4.g0(this, aVar));
            this.f224244m = true;
        } catch (java.lang.Exception e17) {
            if (aVar != null) {
                aVar.invoke();
            }
            com.tencent.mars.xlog.Log.e(this.f224239e, "execute js error! " + e17);
        }
    }

    public final java.lang.String b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "getTransJS: %s", str);
        try {
            return new java.lang.String(s46.d.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open(str)), r26.c.f368865a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewTransHelper", "tryInterceptBridgeScriptRequest, failed, ", e17);
            return "";
        }
    }

    public final void c(yz5.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f224239e, "injectScriptAndStartTrans");
        this.f224246o.setValue(cw4.q0.f224270e);
        cw4.x xVar = this.f224241g;
        xVar.f224290d.g(androidx.lifecycle.n.STARTED);
        xVar.f224291e.observe(xVar, new cw4.i0(this));
        java.lang.String b17 = b(this.f224242h);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(b17);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f224238d;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
        } else {
            cw4.o oVar = this.f224245n;
            if (com.tencent.mm.sdk.platformtools.t8.K0(oVar != null ? ((cw4.f1) oVar).f224218a.f181749o : null)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewTransHelper", "can't get random id from trans helper!");
            } else {
                cw4.o oVar2 = this.f224245n;
                kotlin.jvm.internal.o.d(oVar2);
                a(mMWebView, r26.i0.t(b17, "__wx_trans_xxyy", ((cw4.f1) oVar2).f224218a.f181749o, false), null);
            }
        }
        a(mMWebView, "window.WeixinTranslate.startTrans()", aVar);
        cw4.o oVar3 = this.f224245n;
        if (oVar3 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "trans");
            ((cw4.f1) oVar3).f224218a.f181741d.b("onCallWebTranslateApi", hashMap);
        }
    }

    public final void d() {
        cw4.p0 p0Var;
        this.f224247p.g(androidx.lifecycle.n.STARTED);
        cw4.o oVar = this.f224245n;
        if (oVar != null) {
            com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = ((cw4.f1) oVar).f224218a;
            if (webViewTransHelper.f181745h.getValue() == null) {
                p0Var = cw4.p0.f224264e;
            } else {
                java.lang.Object value = webViewTransHelper.f181745h.getValue();
                kotlin.jvm.internal.o.d(value);
                p0Var = (cw4.p0) value;
            }
        } else {
            p0Var = null;
        }
        if (p0Var == cw4.p0.f224265f) {
            c(null);
        }
    }

    public final void e(java.lang.String str) {
        kotlinx.coroutines.r2 r2Var = this.f224248q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f224248q = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new cw4.f0(2000L, this, null), 3, null);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.String str2 = this.f224239e;
        if (K0) {
            com.tencent.mars.xlog.Log.i(str2, "json.length == 0");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "replaceHTML: " + str);
        a(this.f224238d, "window.WeixinTranslate.replaceText(" + str + ')', null);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f224247p;
    }
}
