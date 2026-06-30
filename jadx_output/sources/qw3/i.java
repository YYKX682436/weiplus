package qw3;

/* loaded from: classes3.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367166d;

    public i(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367166d = bankRemitBankcardInputUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367166d;
        bankRemitBankcardInputUI.f156484n = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) bankRemitBankcardInputUI.getContext(), 1, false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = bankRemitBankcardInputUI.f156484n;
        k0Var.f211872n = new qw3.a(this);
        k0Var.f211881s = new qw3.b(this);
        bankRemitBankcardInputUI.hideTenpayKB();
        bankRemitBankcardInputUI.f156484n.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 2);
        return false;
    }
}
