package pf1;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.plugin.appbrand.jsruntime.t, ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final pf1.d f353776d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f353777e;

    public i(pf1.d webview) {
        kotlin.jvm.internal.o.g(webview, "webview");
        this.f353776d = webview;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    @Override // ni1.f
    public void P() {
        java.lang.Boolean bool = this.f353777e;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            return;
        }
        this.f353776d.onShow();
        this.f353777e = bool2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    @Override // ni1.f
    public void V() {
        java.lang.Boolean bool = this.f353777e;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            return;
        }
        this.f353776d.onHide();
        this.f353777e = bool2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        this.f353776d.addJavascriptInterface(obj, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        this.f353776d.destroy();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f353776d.evaluateJavascript(str, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        if (kotlin.jvm.internal.o.b(ni1.f.class, cls) && this.f353776d.a()) {
            return this;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }
}
