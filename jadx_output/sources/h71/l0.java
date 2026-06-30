package h71;

/* loaded from: classes14.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279400d;

    public l0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279400d = securityAccountVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str = com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.f73233s;
        com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI = this.f279400d;
        securityAccountVerifyUI.T6();
        securityAccountVerifyUI.W6(1);
        return true;
    }
}
