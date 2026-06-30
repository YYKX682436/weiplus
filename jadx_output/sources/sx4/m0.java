package sx4;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413631d;

    public m0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI) {
        this.f413631d = gameWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.S3;
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413631d;
        if (gameWebViewUI.f183815f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "home page, reload url:%s from net", gameWebViewUI.f183807c2);
            gameWebViewUI.f183815f.stopLoading();
            gameWebViewUI.f183815f.loadUrl(gameWebViewUI.f183807c2);
        }
    }
}
