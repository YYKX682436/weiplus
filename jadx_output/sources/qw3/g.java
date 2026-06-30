package qw3;

/* loaded from: classes9.dex */
public class g implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.k f367157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367158b;

    public g(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.k kVar) {
        this.f367158b = bankRemitBankcardInputUI;
        this.f367157a = kVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ow3.k kVar = this.f367157a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", java.lang.Integer.valueOf(kVar.f349422s.f384001d), kVar.f349422s.f384002e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(kVar.f349422s.f384002e);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367158b;
        if (!K0) {
            db5.e1.G(bankRemitBankcardInputUI.getContext(), kVar.f349422s.f384002e, null, false, new qw3.f(this));
        }
        bankRemitBankcardInputUI.L = true;
    }
}
