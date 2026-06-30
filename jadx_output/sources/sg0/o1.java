package sg0;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f407766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f407767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(org.json.JSONObject jSONObject, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView) {
        super(0);
        this.f407766d = jSONObject;
        this.f407767e = baseWebSearchWebView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCallLiteAppConnectEvent, event->");
        org.json.JSONObject jSONObject = this.f407766d;
        sb6.append(jSONObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", sb6.toString());
        av4.y0 y0Var = av4.y0.f14350a;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView it = this.f407767e;
        kotlin.jvm.internal.o.f(it, "$it");
        y0Var.a(it, "onCallLiteAppConnectEvent", jSONObject);
        return jz5.f0.f302826a;
    }
}
