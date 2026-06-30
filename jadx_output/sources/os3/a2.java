package os3;

/* loaded from: classes3.dex */
public class a2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348032d;

    public a2(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI) {
        this.f348032d = mailAddrListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348032d;
        mailAddrListUI.setResult(0);
        mailAddrListUI.finish();
        return true;
    }
}
