package os3;

/* loaded from: classes8.dex */
public class d3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348058d;

    public d3(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI) {
        this.f348058d = mailWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f348058d.finish();
        return true;
    }
}
