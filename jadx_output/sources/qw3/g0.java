package qw3;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367159e;

    public g0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367159e = bankRemitBankcardInputUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "click next btn");
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367159e;
        bankRemitBankcardInputUI.hideVKB();
        bankRemitBankcardInputUI.hideTenpayKB();
        if (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.W6(bankRemitBankcardInputUI)) {
            return;
        }
        java.lang.String text = bankRemitBankcardInputUI.f156478e.getText();
        java.lang.String text2 = bankRemitBankcardInputUI.f156479f.getText();
        if (com.tencent.mm.sdk.platformtools.t8.K0(text) || text.trim().isEmpty() || com.tencent.mm.sdk.platformtools.t8.K0(text2) || text2.trim().isEmpty() || bankRemitBankcardInputUI.F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitBankcardInputUI", "args is empty, payeeName: %s, bankCardNo: %s, bankcard: %s", text, text2, bankRemitBankcardInputUI.F);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "onRealClick() ifGetOperation:%s waitingGetOperation:%s ifAutoNext:%s", java.lang.Boolean.valueOf(bankRemitBankcardInputUI.R), java.lang.Boolean.valueOf(bankRemitBankcardInputUI.S), java.lang.Boolean.valueOf(bankRemitBankcardInputUI.T));
        if (bankRemitBankcardInputUI.R) {
            if (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.X6(bankRemitBankcardInputUI)) {
                if (bankRemitBankcardInputUI.I) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "from record goto next direct");
                    com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.Y6(bankRemitBankcardInputUI);
                    return;
                }
                com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.F;
                java.lang.String str = bankcardElemParcel.f156455e;
                java.lang.String str2 = bankcardElemParcel.f156454d;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", str, str2);
                bankRemitBankcardInputUI.doSceneProgress(new ow3.d(text, text2, str, str2));
                return;
            }
            return;
        }
        bankRemitBankcardInputUI.T = true;
        bankRemitBankcardInputUI.U = text;
        bankRemitBankcardInputUI.V = text2;
        android.app.Dialog dialog = bankRemitBankcardInputUI.D;
        if (dialog != null) {
            dialog.show();
        } else {
            bankRemitBankcardInputUI.D = db5.e1.Q(bankRemitBankcardInputUI, bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.f490386tj), bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.kvq), true, true, new qw3.f0(this));
        }
        if (bankRemitBankcardInputUI.S) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
        bankRemitBankcardInputUI.S = true;
        bankRemitBankcardInputUI.doSceneProgress(new ow3.i(), false);
    }
}
