package q93;

/* loaded from: classes8.dex */
public class d implements q80.j0 {

    /* renamed from: a, reason: collision with root package name */
    public nw4.n f360913a;

    /* renamed from: b, reason: collision with root package name */
    public long f360914b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f360915c = 0;

    public d() {
        if (this.f360913a != null) {
            return;
        }
        try {
            this.f360913a = a(this, "liteapp", "wxaliteapp", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public nw4.n a(q93.d dVar, java.lang.String str, java.lang.String str2, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        int hashCode = hashCode();
        if (q93.j.f360927c == null) {
            q93.j.f360927c = new q93.j();
        }
        nw4.n nVar = new nw4.n((com.tencent.mm.ui.widget.MMWebView) null, (com.tencent.mm.plugin.webview.permission.w) null, hashCode, q93.j.f360927c);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        bundle.putString("appId", str2);
        nVar.H = jsapiPermissionWrapper;
        nVar.I = bundle;
        nVar.f340886J = true;
        com.tencent.mm.plugin.webview.core.m3 m3Var = com.tencent.mm.plugin.webview.core.m3.f181886a;
        int i17 = com.tencent.mm.plugin.webview.stub.WebViewStubService.B;
        m3Var.a(true, com.tencent.mm.plugin.webview.stub.WebViewStubService.class, new q93.b(this, nVar, dVar, hashCode));
        return nVar;
    }

    public final void b(com.tencent.mm.plugin.lite.api.p pVar, nw4.y2 y2Var) {
        if (com.tencent.mm.plugin.appbrand.jsapi.media.z3.NAME.equals(pVar.f299023d)) {
            if (pVar.c() instanceof com.tencent.liteapp.ui.WxaLiteAppUI) {
                y2Var.f340790a.put("liteAppNavigationBarHeight", java.lang.Integer.valueOf(((com.tencent.liteapp.ui.WxaLiteAppUI) pVar.c()).F));
            } else {
                com.tencent.mars.xlog.Log.w("LiteAppJsApiBridgeWebViewHandler", "appBridgeWebViewJsApi.getContext(): " + pVar.c());
            }
        }
    }
}
