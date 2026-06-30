package sx4;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final sx4.o0 f413653b = new sx4.o0(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413654c;

    public q0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI, sx4.g0 g0Var) {
        this.f413654c = gameWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f413653b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return new sx4.p0(this, null);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        if (x0Var == null || x0Var.getUrl() == null) {
            return null;
        }
        return ((vz4.x) this.f413654c.C3).i(webView, x0Var.getUrl().toString(), x0Var);
    }
}
