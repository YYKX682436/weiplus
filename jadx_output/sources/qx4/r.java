package qx4;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f367439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f367441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qx4.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        super(0);
        this.f367439d = d0Var;
        this.f367440e = str;
        this.f367441f = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        qx4.b l17 = this.f367439d.l();
        if (l17 != null && (webView = l17.getWebView()) != null) {
            av4.y0.f14350a.a(webView, this.f367440e, this.f367441f);
        }
        return jz5.f0.f302826a;
    }
}
