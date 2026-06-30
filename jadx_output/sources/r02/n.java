package r02;

/* loaded from: classes8.dex */
public class n implements r02.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368314a;

    public n(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI) {
        this.f368314a = downloadMainUI;
    }

    public boolean a(android.view.View view, int i17) {
        boolean a17 = com.tencent.mm.plugin.webview.luggage.util.a.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadMainUI", "onOnItemButtonClick isTeenMode: %s", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            return false;
        }
        com.tencent.mm.plugin.webview.luggage.util.a.b(this.f368314a);
        return true;
    }
}
