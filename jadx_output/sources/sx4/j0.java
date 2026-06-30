package sx4;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx4.l f413619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413620e;

    public j0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI, tx4.l lVar) {
        this.f413620e = gameWebViewUI;
        this.f413619d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413620e;
        if (gameWebViewUI.isFinishing() || gameWebViewUI.f183816f2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
        } else {
            this.f413619d.c();
        }
    }
}
