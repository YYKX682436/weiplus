package qw3;

/* loaded from: classes9.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367208d;

    public t0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        this.f367208d = bankRemitMoneyInputUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367208d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) bankRemitMoneyInputUI.f156527u.getLayoutParams();
        if (bankRemitMoneyInputUI.f156530x.isShown()) {
            layoutParams.width = bankRemitMoneyInputUI.f156530x.getRight() + i65.a.b(bankRemitMoneyInputUI.getContext(), 8);
        } else {
            layoutParams.width = bankRemitMoneyInputUI.f156528v.getRight() + i65.a.b(bankRemitMoneyInputUI.getContext(), 8);
        }
        layoutParams.height = i65.a.b(bankRemitMoneyInputUI.getContext(), 36);
        bankRemitMoneyInputUI.f156527u.setLayoutParams(layoutParams);
        if (bankRemitMoneyInputUI.f156530x.isShown()) {
            bankRemitMoneyInputUI.f156528v.setMaxWidth((((bankRemitMoneyInputUI.f156526t.getWidth() - i65.a.b(bankRemitMoneyInputUI.getContext(), 20)) - i65.a.b(bankRemitMoneyInputUI.getContext(), 8)) - i65.a.b(bankRemitMoneyInputUI.getContext(), 12)) - i65.a.b(bankRemitMoneyInputUI.getContext(), 16));
        } else {
            bankRemitMoneyInputUI.f156528v.setMaxWidth(((bankRemitMoneyInputUI.f156526t.getWidth() - i65.a.b(bankRemitMoneyInputUI.getContext(), 20)) - i65.a.b(bankRemitMoneyInputUI.getContext(), 8)) - i65.a.b(bankRemitMoneyInputUI.getContext(), 12));
        }
    }
}
