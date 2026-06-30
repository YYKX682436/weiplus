package os3;

/* loaded from: classes8.dex */
public class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348167d;

    public p(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348167d = composeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348167d;
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = composeUI.f154833e;
        if (mailAddrsViewControl != null) {
            mailAddrsViewControl.getAddrsString();
        }
        composeUI.f154838l1.onClick(null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 13);
        return false;
    }
}
