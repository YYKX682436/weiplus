package p61;

/* loaded from: classes14.dex */
public class l5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.VerifyQQUI f352311d;

    public l5(com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI) {
        this.f352311d = verifyQQUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI = this.f352311d;
        verifyQQUI.hideVKB();
        int i17 = com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.f73097q;
        verifyQQUI.W6(1);
        return true;
    }
}
