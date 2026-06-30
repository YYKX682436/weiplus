package qw3;

/* loaded from: classes9.dex */
public class w0 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367219e;

    public w0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        this.f367219e = bankRemitMoneyInputUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367219e;
        double c17 = pw3.a.c(bankRemitMoneyInputUI.f156519m.getText(), "100");
        if (c17 > 0.0d) {
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.Y6(bankRemitMoneyInputUI);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitMoneyInputUI", "illegal money: %s", java.lang.Double.valueOf(c17));
            dp.a.makeText(bankRemitMoneyInputUI, com.tencent.mm.R.string.aeb, 1).show();
        }
    }
}
