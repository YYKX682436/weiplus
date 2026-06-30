package sx4;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx4.l f413623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413624e;

    public k0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI, tx4.l lVar) {
        this.f413624e = gameWebViewUI;
        this.f413623d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413624e;
        if (gameWebViewUI.isFinishing() || gameWebViewUI.f183816f2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
        } else {
            this.f413623d.c();
        }
    }
}
