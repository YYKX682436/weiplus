package r02;

/* loaded from: classes8.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368311d;

    public l(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI) {
        this.f368311d = downloadMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368311d;
        android.content.Intent intent = new android.content.Intent(this.f368311d, (java.lang.Class<?>) com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(downloadMainUI, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        downloadMainUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(downloadMainUI, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        o02.a.b(10, 1001, 1, 2, "", "", "");
        return true;
    }
}
