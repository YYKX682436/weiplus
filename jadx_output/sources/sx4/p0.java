package sx4;

/* loaded from: classes8.dex */
public class p0 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sx4.q0 f413636b;

    public p0(sx4.q0 q0Var, sx4.g0 g0Var) {
        this.f413636b = q0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void a(int i17, java.lang.String str) {
        sx4.q0 q0Var = this.f413636b;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = q0Var.f413654c.J3;
        if (gameWebPerformanceInfo.H == 0) {
            gameWebPerformanceInfo.H = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = q0Var.f413654c;
        sx4.d0 d0Var = gameWebViewUI.L3;
        if (d0Var.f413588g == 0) {
            d0Var.f413588g = java.lang.System.currentTimeMillis();
        }
        gameWebViewUI.Q3 = true;
        if (gameWebViewUI.R3) {
            gameWebViewUI.Q3 = false;
            gameWebViewUI.R3 = false;
            com.tencent.mm.sdk.platformtools.u3.i(new sx4.m0(gameWebViewUI), 100L);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void c(int i17, java.lang.String str) {
        sx4.q0 q0Var = this.f413636b;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = q0Var.f413654c.J3;
        if (gameWebPerformanceInfo.G == 0) {
            gameWebPerformanceInfo.G = java.lang.System.currentTimeMillis();
        }
        sx4.d0 d0Var = q0Var.f413654c.L3;
        if (d0Var.f413587f == 0) {
            d0Var.f413587f = java.lang.System.currentTimeMillis();
        }
    }
}
