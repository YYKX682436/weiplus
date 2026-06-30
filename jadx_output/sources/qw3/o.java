package qw3;

/* loaded from: classes9.dex */
public class o implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.i f367183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367184b;

    public o(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.i iVar) {
        this.f367184b = bankRemitBankcardInputUI;
        this.f367183a = iVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367184b;
        android.app.Dialog dialog = bankRemitBankcardInputUI.D;
        if (dialog != null && dialog.isShowing()) {
            bankRemitBankcardInputUI.D.dismiss();
        }
        bankRemitBankcardInputUI.R = true;
        bankRemitBankcardInputUI.S = false;
        ow3.i iVar = this.f367183a;
        r45.f25 f25Var = iVar.f349416s;
        bankRemitBankcardInputUI.C = f25Var.f373949m;
        java.lang.String str2 = f25Var.f373950n;
        bankRemitBankcardInputUI.f156491u = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "set uniqueId:%s", str2);
        r45.f25 f25Var2 = iVar.f349416s;
        bankRemitBankcardInputUI.f156492v = f25Var2.f373951o;
        bankRemitBankcardInputUI.f156493w = f25Var2.f373952p;
        bankRemitBankcardInputUI.f156485o.setBannerData(f25Var2.f373953q);
        if (!com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.X6(bankRemitBankcardInputUI)) {
            bankRemitBankcardInputUI.e7();
            return;
        }
        if (bankRemitBankcardInputUI.T) {
            if (bankRemitBankcardInputUI.I) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "NetSceneBankRemitOperation: from record goto next direct");
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.Y6(bankRemitBankcardInputUI);
            } else {
                com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.F;
                java.lang.String str3 = bankcardElemParcel.f156455e;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "doCheckBankBind()");
                java.lang.String str4 = bankRemitBankcardInputUI.U;
                java.lang.String str5 = bankRemitBankcardInputUI.V;
                java.lang.String str6 = bankcardElemParcel.f156454d;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", str3, str6);
                bankRemitBankcardInputUI.doSceneProgress(new ow3.d(str4, str5, str3, str6));
            }
            bankRemitBankcardInputUI.T = false;
        }
    }
}
