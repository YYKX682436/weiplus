package qx4;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f367443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qx4.d0 d0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f367443d = d0Var;
        this.f367444e = str;
        this.f367445f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        qx4.b l17 = this.f367443d.l();
        if (l17 != null && (webView = l17.getWebView()) != null) {
            java.lang.String funcName = this.f367444e;
            kotlin.jvm.internal.o.g(funcName, "funcName");
            java.lang.String params = this.f367445f;
            kotlin.jvm.internal.o.g(params, "params");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", funcName, params);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{funcName, funcName, params}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
