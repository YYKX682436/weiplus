package yu4;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.n f465891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f465892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f465893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yu4.n nVar, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, kotlin.jvm.internal.c0 c0Var) {
        super(0);
        this.f465891d = nVar;
        this.f465892e = baseWebSearchWebView;
        this.f465893f = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yu4.n nVar = this.f465891d;
        android.widget.FrameLayout frameLayout = nVar.f465899h;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = this.f465892e;
        frameLayout.addView(baseWebSearchWebView);
        if (!this.f465893f.f310112d) {
            r45.xi0 xi0Var = nVar.f465896e;
            com.tencent.mars.xlog.Log.i(nVar.f465898g, "start to load url %s", xi0Var.f390118g);
            baseWebSearchWebView.addJavascriptInterface(nVar.f465901m, "emojiWebSearchJSApi");
            baseWebSearchWebView.loadUrl(xi0Var.f390118g);
        }
        return jz5.f0.f302826a;
    }
}
