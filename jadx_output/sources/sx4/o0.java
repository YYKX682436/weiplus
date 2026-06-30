package sx4;

/* loaded from: classes8.dex */
public class o0 extends sx4.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sx4.q0 f413635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(sx4.q0 q0Var, sx4.g0 g0Var) {
        super(q0Var.f413654c);
        this.f413635b = q0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        sx4.q0 q0Var = this.f413635b;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = q0Var.f413654c.J3;
        if (gameWebPerformanceInfo.F == 0) {
            gameWebPerformanceInfo.F = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = q0Var.f413654c;
        sx4.d0 d0Var = gameWebViewUI.L3;
        if (d0Var.f413586e == 0) {
            d0Var.f413586e = java.lang.System.currentTimeMillis();
        }
        android.widget.ProgressBar progressBar = gameWebViewUI.f183843p;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ((vz4.x) gameWebViewUI.C3).h(webView, str);
        sx4.u uVar = this.f413578a.B3.f413666f;
        uVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f413660a;
        vVar.f413663c = currentTimeMillis;
        vVar.f413664d = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        sx4.q0 q0Var = this.f413635b;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = q0Var.f413654c.J3;
        if (gameWebPerformanceInfo.E == 0) {
            gameWebPerformanceInfo.E = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = q0Var.f413654c;
        sx4.d0 d0Var = gameWebViewUI.L3;
        if (d0Var.f413585d == 0) {
            d0Var.f413585d = java.lang.System.currentTimeMillis();
        }
        vz4.x xVar = (vz4.x) gameWebViewUI.C3;
        xVar.getClass();
        xVar.f441754b = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413635b.f413654c;
        int i18 = com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.S3;
        android.widget.ProgressBar progressBar = gameWebViewUI.f183843p;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
