package qw3;

/* loaded from: classes9.dex */
public class y0 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.m f367226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367227b;

    public y0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, ow3.m mVar) {
        this.f367227b = bankRemitMoneyInputUI;
        this.f367226a = mVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        ow3.m mVar = this.f367226a;
        r45.or5 or5Var = mVar.f349427s;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", or5Var.f382466f, or5Var.f382467g);
        r45.or5 or5Var2 = mVar.f349427s;
        java.lang.String str2 = or5Var2.f382469i;
        java.lang.String str3 = or5Var2.f382470m;
        java.lang.String str4 = or5Var2.f382467g;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367227b;
        bankRemitMoneyInputUI.f156513J = str4;
        if (!com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.a7(bankRemitMoneyInputUI, mVar)) {
            r45.or5 or5Var3 = mVar.f349427s;
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.V6(bankRemitMoneyInputUI, or5Var3.f382466f, or5Var3.f382469i, or5Var3.f382470m, or5Var3.f382468h);
        } else {
            z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) bankRemitMoneyInputUI).mKindaEnable;
            if (z17) {
                bankRemitMoneyInputUI.hideLoading();
            }
        }
    }
}
