package of1;

/* loaded from: classes7.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.k f344987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(of1.v0 v0Var, com.tencent.mm.plugin.appbrand.jsapi.webview.k kVar) {
        super(0);
        this.f344986d = v0Var;
        this.f344987e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        of1.v0 v0Var = this.f344986d;
        com.tencent.mars.xlog.Log.i(v0Var.D1(), "startTrans");
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = v0Var.f345022a2;
        if (webViewTransHelper != null) {
            webViewTransHelper.h(new of1.o0(v0Var, this.f344987e));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("transHelper");
        throw null;
    }
}
