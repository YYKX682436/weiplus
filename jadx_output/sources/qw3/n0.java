package qw3;

/* loaded from: classes9.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI f367181d;

    public n0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI bankRemitBaseUI) {
        this.f367181d = bankRemitBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI.f156497d;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI bankRemitBaseUI = this.f367181d;
        if (!bankRemitBaseUI.needConfirmFinish()) {
            bankRemitBaseUI.finish();
            return true;
        }
        bankRemitBaseUI.hideVKB();
        bankRemitBaseUI.showDialog(1000);
        return true;
    }
}
