package qw3;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        super(false);
        this.f367149d = bankRemitBankcardInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367149d;
        bankRemitBankcardInputUI.hideVKB();
        bankRemitBankcardInputUI.f156479f.e();
        java.lang.String text = bankRemitBankcardInputUI.f156479f.getText();
        if (!bankRemitBankcardInputUI.N || com.tencent.mm.sdk.platformtools.t8.K0(text)) {
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.V6(bankRemitBankcardInputUI);
            return;
        }
        java.lang.String mD5Value = bankRemitBankcardInputUI.f156479f.getMD5Value();
        bankRemitBankcardInputUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by cardNo");
        if (bankRemitBankcardInputUI.K != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "cancel pre scene");
            bankRemitBankcardInputUI.cancelNetScene(bankRemitBankcardInputUI.K);
        }
        bankRemitBankcardInputUI.N = false;
        ow3.f fVar = new ow3.f(text, mD5Value);
        bankRemitBankcardInputUI.K = fVar;
        bankRemitBankcardInputUI.doSceneProgress(fVar, true);
    }
}
