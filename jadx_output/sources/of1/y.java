package of1;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f345057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, java.lang.String str2, of1.v0 v0Var) {
        super(0);
        this.f345055d = str;
        this.f345056e = str2;
        this.f345057f = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (r26.n0.L(this.f345055d, "#", 0, false, 6, null) >= 0) {
            java.lang.String str = this.f345056e;
            if (!(str == null || str.length() == 0) && !r26.i0.o(str, "#wechat_redirect", false, 2, null)) {
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f345057f.W1;
                if (oVar == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                com.tencent.mm.ui.widget.MMWebView webView = ((of1.w1) oVar).getWebView();
                java.lang.String format = java.lang.String.format("window.location=\"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.plugin.appbrand.utils.w2.a(this.f345055d)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                webView.evaluateJavascript(format, null);
                return jz5.f0.f302826a;
            }
        }
        zg0.q2.b(this.f345057f, this.f345055d, null, false, 6, null);
        return jz5.f0.f302826a;
    }
}
