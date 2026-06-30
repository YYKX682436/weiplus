package r02;

/* loaded from: classes8.dex */
public class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368309d;

    public k(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI) {
        this.f368309d = downloadMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var;
        int i17 = com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.f97371s;
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368309d;
        if ((downloadMainUI.f97380o == 2) && (m0Var = downloadMainUI.f97383r) != null && m0Var.m0(1)) {
            downloadMainUI.T6();
            return true;
        }
        downloadMainUI.finish();
        return true;
    }
}
