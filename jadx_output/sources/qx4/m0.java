package qx4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f367425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367426b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f367427c;

    /* renamed from: d, reason: collision with root package name */
    public av4.q f367428d;

    /* renamed from: e, reason: collision with root package name */
    public nw4.p2 f367429e;

    /* renamed from: f, reason: collision with root package name */
    public qx4.d0 f367430f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f367431g;

    public m0(java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f367425a = url;
        this.f367426b = i17;
        this.f367431g = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.net.Uri parse = android.net.Uri.parse(url);
        try {
            java.lang.String queryParameter = parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (queryParameter != null) {
                java.lang.Integer.parseInt(queryParameter);
            }
        } catch (java.lang.Exception unused) {
        }
        parse.getQueryParameter(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx4.m0)) {
            return false;
        }
        qx4.m0 m0Var = (qx4.m0) obj;
        return kotlin.jvm.internal.o.b(this.f367425a, m0Var.f367425a) && this.f367426b == m0Var.f367426b;
    }

    public int hashCode() {
        return (this.f367425a.hashCode() * 31) + java.lang.Integer.hashCode(this.f367426b);
    }

    public java.lang.String toString() {
        return "WebSearchPreloadObj(url=" + this.f367425a + ", preloadScene=" + this.f367426b + ')';
    }
}
