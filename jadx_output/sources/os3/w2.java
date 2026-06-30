package os3;

/* loaded from: classes8.dex */
public class w2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI f348242d;

    public w2(com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI mailImageDownloadUI) {
        this.f348242d = mailImageDownloadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI mailImageDownloadUI = this.f348242d;
        r1Var.d((com.tencent.mm.modelbase.m1) mailImageDownloadUI.f154901n);
        mailImageDownloadUI.finish();
        return true;
    }
}
