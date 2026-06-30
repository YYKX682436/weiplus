package os3;

/* loaded from: classes8.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348056d;

    public d(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348056d = attachDownloadPage;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348056d;
        db5.e1.h(attachDownloadPage, "", new java.lang.String[]{attachDownloadPage.getString(com.tencent.mm.R.string.hjg)}, "", false, new os3.c(this));
        return true;
    }
}
