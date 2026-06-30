package h71;

/* loaded from: classes14.dex */
public class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI f279388d;

    public f0(com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI) {
        this.f279388d = securityAccountIntroUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str = com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI.f73224p;
        com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI = this.f279388d;
        n71.a.e(securityAccountIntroUI.f73232o);
        securityAccountIntroUI.T6();
        securityAccountIntroUI.W6(1);
        return true;
    }
}
