package qw3;

/* loaded from: classes9.dex */
public class x0 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367222a;

    public x0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        this.f367222a = bankRemitMoneyInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        int i17;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367222a;
        if (!z17) {
            bankRemitMoneyInputUI.f156518i.scrollTo(0, 0);
            return;
        }
        if (bankRemitMoneyInputUI.f156518i != null) {
            int[] iArr = new int[2];
            bankRemitMoneyInputUI.f156525s.getLocationInWindow(iArr);
            int k17 = (i65.a.k(bankRemitMoneyInputUI) - (iArr[1] + bankRemitMoneyInputUI.f156525s.getHeight())) - i65.a.b(bankRemitMoneyInputUI, 30);
            if (k17 <= 0 || k17 >= (i17 = bankRemitMoneyInputUI.f156514e)) {
                return;
            }
            bankRemitMoneyInputUI.f156518i.post(new qw3.s0(bankRemitMoneyInputUI, i17 - k17));
        }
    }
}
