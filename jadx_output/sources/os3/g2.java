package os3;

/* loaded from: classes8.dex */
public class g2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI f348088d;

    public g2(com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI mailAddrProfileUI) {
        this.f348088d = mailAddrProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI mailAddrProfileUI = this.f348088d;
        mailAddrProfileUI.hideVKB();
        mailAddrProfileUI.finish();
        return true;
    }
}
