package e05;

/* loaded from: classes9.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI f246188d;

    public q(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI) {
        this.f246188d = walletWXCreditDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI = this.f246188d;
        walletWXCreditDetailUI.hideVKB();
        walletWXCreditDetailUI.finish();
        return true;
    }
}
