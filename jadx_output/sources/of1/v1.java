package of1;

/* loaded from: classes7.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f345030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(of1.w1 w1Var) {
        super(0);
        this.f345030d = w1Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [of1.u1] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u09;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject3;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u010;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject4;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u011;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject5;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u012;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject6;
        i95.m c17 = i95.n0.c(ft.k4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        final of1.w1 w1Var = this.f345030d;
        com.tencent.mm.ui.widget.MMWebView viewWV = (com.tencent.mm.ui.widget.MMWebView) new kotlin.jvm.internal.y(w1Var) { // from class: of1.u1
            @Override // kotlin.jvm.internal.y, f06.s
            public java.lang.Object get() {
                return ((of1.w1) this.receiver).f345045s;
            }
        }.get();
        int i17 = w1Var.f345035f;
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView = w1Var.m533getPageView();
        if (!(m533getPageView instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = m533getPageView != null ? m533getPageView.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t37 : null;
        java.lang.Integer valueOf = (o6Var == null || (u012 = o6Var.u0()) == null || (appBrandStatObject6 = u012.f47269b2) == null) ? null : java.lang.Integer.valueOf(appBrandStatObject6.f87803v);
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView2 = w1Var.m533getPageView();
        if (!(m533getPageView2 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView2 = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t38 = m533getPageView2 != null ? m533getPageView2.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = t38 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t38 : null;
        java.lang.String str = (o6Var2 == null || (u011 = o6Var2.u0()) == null || (appBrandStatObject5 = u011.f47269b2) == null) ? null : appBrandStatObject5.f87801t;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView3 = w1Var.m533getPageView();
        if (!(m533getPageView3 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView3 = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t39 = m533getPageView3 != null ? m533getPageView3.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var3 = t39 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t39 : null;
        java.lang.String str2 = (o6Var3 == null || (u010 = o6Var3.u0()) == null || (appBrandStatObject4 = u010.f47269b2) == null) ? null : appBrandStatObject4.f87802u;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView4 = w1Var.m533getPageView();
        if (!(m533getPageView4 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView4 = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t310 = m533getPageView4 != null ? m533getPageView4.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var4 = t310 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t310 : null;
        java.lang.String str3 = (o6Var4 == null || (u09 = o6Var4.u0()) == null || (appBrandStatObject3 = u09.f47269b2) == null) ? null : appBrandStatObject3.f87800s;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView5 = w1Var.m533getPageView();
        if (!(m533getPageView5 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView5 = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t311 = m533getPageView5 != null ? m533getPageView5.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var5 = t311 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t311 : null;
        java.lang.Integer valueOf2 = (o6Var5 == null || (u08 = o6Var5.u0()) == null || (appBrandStatObject2 = u08.f47269b2) == null) ? null : java.lang.Integer.valueOf(appBrandStatObject2.f87790f);
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        com.tencent.mm.plugin.appbrand.page.n7 m533getPageView6 = w1Var.m533getPageView();
        if (!(m533getPageView6 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            m533getPageView6 = null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t312 = m533getPageView6 != null ? m533getPageView6.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var6 = t312 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t312 : null;
        java.lang.String str4 = (o6Var6 == null || (u07 = o6Var6.u0()) == null || (appBrandStatObject = u07.f47269b2) == null) ? null : appBrandStatObject.f87791g;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.a(w1Var.m533getPageView());
        java.lang.String str6 = a17 == null ? "" : a17;
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        of1.v0 v0Var = new of1.v0(viewWV, i17, intValue, str, str2, str3, intValue2, str5, str6, true);
        v0Var.W1 = w1Var;
        v0Var.X1 = new of1.m(w1Var);
        v0Var.f345022a2 = new com.tencent.mm.plugin.webview.WebViewTransHelper(new of1.o(v0Var, w1Var));
        androidx.lifecycle.o mo133getLifecycle = w1Var.getLifecycleOwner().mo133getLifecycle();
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = v0Var.f345022a2;
        if (webViewTransHelper == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        mo133getLifecycle.a(webViewTransHelper);
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper2 = v0Var.f345022a2;
        if (webViewTransHelper2 == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        v0Var.C(new cw4.y0(new java.lang.ref.WeakReference(webViewTransHelper2)));
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper3 = v0Var.f345022a2;
        if (webViewTransHelper3 == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        java.lang.String Y = com.tencent.mm.sdk.platformtools.t8.Y(32);
        kotlin.jvm.internal.o.f(Y, "getRandomString(...)");
        webViewTransHelper3.f181749o = Y;
        int i18 = v0Var.f181918b.f472753f;
        com.tencent.mm.ui.widget.MMWebView mMWebView = v0Var.f181916a;
        mMWebView.f211373v = i18;
        v0Var.D(new of1.m0(v0Var));
        of1.v vVar = new of1.v(mMWebView, w1Var, new of1.n0(v0Var), v0Var.U1);
        v0Var.Y1 = vVar;
        mMWebView.setWebChromeClient(new al5.n2(vVar));
        v0Var.q0();
        v0Var.F1(true);
        return v0Var;
    }
}
