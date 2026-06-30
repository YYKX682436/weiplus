package e05;

/* loaded from: classes9.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI f246175d;

    public d(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI walletWXCreditChangeAmountResultUI) {
        this.f246175d = walletWXCreditChangeAmountResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI walletWXCreditChangeAmountResultUI = this.f246175d;
        walletWXCreditChangeAmountResultUI.getProcess().o(walletWXCreditChangeAmountResultUI.getContext(), 0, walletWXCreditChangeAmountResultUI.getInput());
        return true;
    }
}
