package qx4;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f367450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f367452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f367454h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.os.Bundle bundle, java.lang.String str, qx4.d0 d0Var, java.lang.String str2, boolean z17) {
        super(0);
        this.f367450d = bundle;
        this.f367451e = str;
        this.f367452f = d0Var;
        this.f367453g = str2;
        this.f367454h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject f17;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        org.json.JSONObject f18;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView2;
        java.lang.String str = this.f367453g;
        java.lang.String str2 = this.f367451e;
        qx4.d0 d0Var = this.f367452f;
        android.os.Bundle bundle = this.f367450d;
        if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
            if (str2 != null && (r26.n0.N(str2) ^ true)) {
                f17 = d0Var.g();
                f17.put("json", str2);
            } else {
                f17 = d0Var.f();
            }
            f17.put("requestId", str);
            f17.put("newQuery", this.f367454h);
            av4.j jVar = d0Var.f14326a;
            if (jVar != null && (webView = jVar.getWebView()) != null) {
                java.lang.String jSONObject = f17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchDataReady", jSONObject);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchDataReady", "onSearchDataReady", jSONObject}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        } else {
            if (str2 != null && (r26.n0.N(str2) ^ true)) {
                f18 = d0Var.g();
                f18.put("widgetId", bundle.getString("widgetId", ""));
                f18.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
            } else {
                f18 = d0Var.f();
            }
            f18.put("requestId", str);
            av4.j jVar2 = d0Var.f14326a;
            if (jVar2 != null && (webView2 = jVar2.getWebView()) != null) {
                java.lang.String jSONObject2 = f18.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchWAWidgetReloadDataFinish", jSONObject2);
                    java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchWAWidgetReloadDataFinish", "onSearchWAWidgetReloadDataFinish", jSONObject2}, 3));
                    kotlin.jvm.internal.o.f(format2, "format(...)");
                    pm0.v.X(new av4.t0(webView2, format2));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
