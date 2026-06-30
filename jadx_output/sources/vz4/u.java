package vz4;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f441748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz4.x f441749e;

    public u(vz4.x xVar, com.tencent.xweb.WebView webView) {
        this.f441749e = xVar;
        this.f441748d = webView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.xweb.WebView webView = this.f441748d;
        if (webView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "injectGameJs, webview == null");
            return;
        }
        vz4.x xVar = this.f441749e;
        java.lang.String format = java.lang.String.format("javascript:(function() {window.__usewepkg__=%s;})();", java.lang.String.valueOf(xVar.d(xVar.f441753a)));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__usewepkg__: %s", format);
        webView.evaluateJavascript(format, null);
        java.lang.String format2 = java.lang.String.format("javascript:(function() {window.__lowPowerMode__=%s;})();", java.lang.String.valueOf(com.tencent.mm.plugin.game.commlib.util.c.a()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__lowPowerMode__: %s", format2);
        webView.evaluateJavascript(format2, null);
        java.lang.String format3 = java.lang.String.format("javascript:(function() {window.__lowPower__=%s;})();", java.lang.String.valueOf(com.tencent.mm.plugin.game.commlib.util.c.f139400a));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__lowPower__: %s", format3);
        webView.evaluateJavascript(format3, null);
        java.lang.String format4 = java.lang.String.format("javascript:(function() {window.__game_center_preload__=%s;})();", java.lang.String.valueOf(xVar.f441772t));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__game_center_preload__: %s", format4);
        webView.evaluateJavascript(format4, null);
        java.lang.String format5 = java.lang.String.format("javascript:(function() {window.__is_game_center_preload_page__=%s;})();", java.lang.String.valueOf(xVar.f441772t));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__is_game_center_preload_page__: %s", format5);
        webView.evaluateJavascript(format5, null);
    }
}
