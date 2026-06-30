package ur4;

/* loaded from: classes9.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI f430434d;

    public b(com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI walletLoanCheckPwdUI) {
        this.f430434d = walletLoanCheckPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.a.b(this.f430434d, 0);
        return true;
    }
}
