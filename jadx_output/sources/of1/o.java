package of1;

/* loaded from: classes7.dex */
public final class o implements cw4.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.e3 f344980a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.webview.o f344981b;

    public o(com.tencent.mm.plugin.webview.core.e3 webViewController, com.tencent.mm.plugin.appbrand.jsapi.webview.o view) {
        kotlin.jvm.internal.o.g(webViewController, "webViewController");
        kotlin.jvm.internal.o.g(view, "view");
        this.f344980a = webViewController;
        this.f344981b = view;
    }

    @Override // cw4.n
    public void a(cw4.c0 c0Var, cw4.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("Luggage.HTMLViewUIStyleDelegate", "switchTransHelpEntry btnAction:" + c0Var + " btnStatus:" + d0Var);
    }

    @Override // cw4.n
    public void b(java.lang.String str, java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        com.tencent.mars.xlog.Log.i("Luggage.HTMLViewUIStyleDelegate", "dispatchEvent event:" + str);
        this.f344980a.g0().o(str, values);
    }

    @Override // cw4.n
    public java.lang.Boolean c() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f344980a;
        return java.lang.Boolean.valueOf(e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f181943n0)));
    }

    @Override // cw4.n
    public void d(cw4.q0 q0Var, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.HTMLViewUIStyleDelegate", "setTransTipsBarText status:" + q0Var + " brandWord:" + str);
    }

    @Override // cw4.n
    public void e(cw4.n0 action, cw4.o0 scene) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("Luggage.HTMLViewUIStyleDelegate", "report action:" + action + " scene:" + scene);
    }

    @Override // cw4.n
    public java.lang.Boolean f(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.HTMLViewUIStyleDelegate", "isOptionMenuShow menuID:" + i17);
        return java.lang.Boolean.TRUE;
    }

    @Override // cw4.n
    public android.content.Context getContext() {
        return ((of1.w1) this.f344981b).getAndroidContext();
    }

    @Override // cw4.n
    public androidx.lifecycle.y getLifecycleOwner() {
        return ((of1.w1) this.f344981b).getLifecycleOwner();
    }

    @Override // cw4.n
    public com.tencent.xweb.WebView getWebView() {
        return ((of1.w1) this.f344981b).getWebView();
    }
}
