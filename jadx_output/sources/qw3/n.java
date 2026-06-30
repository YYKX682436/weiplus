package qw3;

/* loaded from: classes9.dex */
public class n implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.i f367179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367180b;

    public n(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.i iVar) {
        this.f367180b = bankRemitBankcardInputUI;
        this.f367179a = iVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ow3.i iVar = this.f367179a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "operation response error: %s, %s", java.lang.Integer.valueOf(iVar.f349416s.f373943d), iVar.f349416s.f373944e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(iVar.f349416s.f373944e);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367180b;
        if (!K0) {
            db5.e1.G(bankRemitBankcardInputUI.getContext(), iVar.f349416s.f373944e, null, false, new qw3.m(this));
        }
        bankRemitBankcardInputUI.finish();
    }
}
