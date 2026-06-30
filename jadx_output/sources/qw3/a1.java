package qw3;

/* loaded from: classes9.dex */
public class a1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367140b;

    public a1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, int i17) {
        this.f367140b = bankRemitMoneyInputUI;
        this.f367139a = i17;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367140b;
        if (bankRemitMoneyInputUI.P == null) {
            bankRemitMoneyInputUI.P = new com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage(bankRemitMoneyInputUI, 10, "", com.tencent.mm.plugin.remittance.ui.l7.f157808e);
        }
        bankRemitMoneyInputUI.P.a(bankRemitMoneyInputUI.G, bankRemitMoneyInputUI.getString(com.tencent.mm.R.string.f490705af2, "" + this.f367139a), new qw3.z0(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 4);
    }
}
