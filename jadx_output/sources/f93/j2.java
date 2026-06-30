package f93;

/* loaded from: classes11.dex */
public class j2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260363d;

    public j2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260363d = contactLabelManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260363d;
        if (contactLabelManagerUI.f143255v) {
            contactLabelManagerUI.c7();
            return true;
        }
        contactLabelManagerUI.finish();
        return false;
    }
}
