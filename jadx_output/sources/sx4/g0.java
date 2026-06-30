package sx4;

/* loaded from: classes8.dex */
public class g0 extends com.tencent.mm.plugin.wepkg.event.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413609b;

    public g0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI, java.lang.String str) {
        this.f413609b = gameWebViewUI;
        this.f413608a = str;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413609b;
        if (gameWebViewUI.N3) {
            return;
        }
        gameWebViewUI.N3 = true;
        gameWebViewUI.Q2.postDelayed(new sx4.e0(this), 1000L);
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void b(boolean z17) {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.S3;
        this.f413609b.Q2.post(new sx4.f0(this, z17));
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onReload");
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413609b;
        gameWebViewUI.R3 = true;
        if (gameWebViewUI.Q3) {
            gameWebViewUI.Q3 = false;
            gameWebViewUI.R3 = false;
            com.tencent.mm.sdk.platformtools.u3.i(new sx4.m0(gameWebViewUI), 100L);
        }
    }
}
