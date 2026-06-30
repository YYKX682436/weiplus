package pf1;

/* loaded from: classes7.dex */
public final class n extends pf1.q {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.z6 f353781i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f353782m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f353783n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f353784o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f353785p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.ui.z6 context, com.tencent.mm.plugin.appbrand.o6 rt6) {
        super(context, rt6);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f353781i = context;
        this.f353782m = rt6;
        this.f353785p = new java.util.concurrent.atomic.AtomicBoolean(false);
        pf1.m mVar = new pf1.m();
        pf1.l lVar = new pf1.l(this);
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(getContext());
        a17.setBackgroundColor(0);
        com.tencent.xweb.z0 settings = a17.getSettings();
        settings.z(true);
        settings.E(true);
        settings.I(false);
        settings.J(0);
        a17.setHorizontalScrollBarEnabled(false);
        a17.setVerticalScrollBarEnabled(false);
        settings.r(true);
        settings.G(true);
        settings.M(false);
        settings.L(false);
        settings.C(false);
        settings.D(false);
        settings.k(true);
        settings.t(true);
        settings.p(true);
        a17.setWebViewClientExtension(mVar);
        a17.setWebViewClient(lVar);
        settings.R(2);
        settings.h(false);
        java.lang.String g17 = settings.g();
        ik1.k0 k0Var = (ik1.k0) nd.f.a(ik1.k0.class);
        if (k0Var == null) {
            zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
            android.content.Context context2 = a17.getContext();
            ((yg0.e4) g3Var).getClass();
            k0Var = new com.tencent.mm.plugin.appbrand.luggage.customize.y(context2);
        }
        kotlin.jvm.internal.o.d(g17);
        if (!r26.n0.B(g17, " MicroMessenger/", false)) {
            settings.Q(ik1.l0.a(a17.getContext(), g17, k0Var) + " miniProgram/" + getRt().f74803n);
        }
        a17.setDownloadListener(pf1.j.f353778a);
        this.f353784o = a17;
        addView(a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        a17.addJavascriptInterface(new pf1.h(this), "WeixinJSCore");
        a17.loadDataWithBaseURL(com.tencent.luggage.sdk.jsapi.component.o.f47357i0 + getAppId() + '/' + getRt().d2() + "/vConsole.html", getRt().S2(false).M("WAPageFrame.html"), "text/html", com.tencent.mapsdk.internal.rv.f51270c, null);
    }

    public final void b() {
        if (this.f353785p.getAndSet(true)) {
            return;
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f353784o;
        mMWebView.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
        mMWebView.evaluateJavascript(ik1.f.e("wxa_library/vconsole-wxjs.js"), null);
        getJsBridgeComponentDelegate().L();
        mMWebView.evaluateJavascript(getRt().S2(false).M("WAGlobalConsole.js"), null);
    }

    public final void c(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLVConsoleView", "onReceivedError url:" + str + ", code:" + i17 + ", message:" + str2);
    }

    @Override // pf1.q
    public void destroy() {
        pf1.p pVar = new pf1.p(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            pVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(pVar);
        }
        pf1.k kVar = new pf1.k(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            kVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(kVar);
        }
    }

    public final com.tencent.mm.ui.widget.MMWebView getViewWV() {
        return this.f353784o;
    }

    @Override // pf1.q, pf1.c
    public pf1.d getWebView() {
        return new pf1.x(this.f353784o);
    }

    @Override // pf1.q, android.view.View
    public com.tencent.mm.plugin.appbrand.ui.z6 getContext() {
        return this.f353781i;
    }

    @Override // pf1.q
    public com.tencent.mm.plugin.appbrand.o6 getRt() {
        return this.f353782m;
    }
}
