package nw4;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f340860a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f340861b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.v0 f340862c;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.g f340863d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f340864e;

    public k(android.content.Context context, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.plugin.webview.stub.v0 v0Var, nw4.g jsApiHandler, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        this.f340860a = context;
        this.f340861b = jsapiPermissionWrapper;
        this.f340863d = jsApiHandler;
        this.f340862c = v0Var;
        this.f340864e = mMWebView;
    }

    public final zg0.q2 a() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        java.lang.Object obj = this.f340860a;
        com.tencent.mm.plugin.webview.core.v0 v0Var = obj instanceof com.tencent.mm.plugin.webview.core.v0 ? (com.tencent.mm.plugin.webview.core.v0) obj : null;
        if (v0Var != null && (e3Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) v0Var).L1) != null) {
            return e3Var;
        }
        nw4.g gVar = this.f340863d;
        zg0.v2 v2Var = gVar instanceof zg0.v2 ? (zg0.v2) gVar : null;
        if (v2Var != null) {
            return ((nw4.n) v2Var).f340901o;
        }
        return null;
    }

    public final com.tencent.mm.plugin.webview.stub.z0 b() {
        com.tencent.mm.plugin.webview.stub.z0 z0Var;
        java.lang.Object obj = this.f340860a;
        com.tencent.mm.plugin.webview.core.v0 v0Var = obj instanceof com.tencent.mm.plugin.webview.core.v0 ? (com.tencent.mm.plugin.webview.core.v0) obj : null;
        if (v0Var != null && (z0Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) v0Var).N2) != null) {
            return z0Var;
        }
        nw4.g gVar = this.f340863d;
        zg0.v2 v2Var = gVar instanceof zg0.v2 ? (zg0.v2) gVar : null;
        if (v2Var != null) {
            return ((nw4.n) v2Var).f340900n;
        }
        return null;
    }
}
