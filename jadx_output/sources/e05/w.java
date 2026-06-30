package e05;

/* loaded from: classes9.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI f246194d;

    public w(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI walletWXCreditOpenNotifyUI) {
        this.f246194d = walletWXCreditOpenNotifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI walletWXCreditOpenNotifyUI = this.f246194d;
        walletWXCreditOpenNotifyUI.setResult(-1);
        walletWXCreditOpenNotifyUI.finish();
        return true;
    }
}
