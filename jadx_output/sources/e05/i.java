package e05;

/* loaded from: classes9.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246180d;

    public i(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246180d = walletWXCreditChangeAmountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246180d;
        walletWXCreditChangeAmountUI.hideVKB();
        walletWXCreditChangeAmountUI.showDialog(3);
        return true;
    }
}
