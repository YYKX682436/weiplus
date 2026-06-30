package qw3;

/* loaded from: classes4.dex */
public class k implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.d f367170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367171b;

    public k(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.d dVar) {
        this.f367171b = bankRemitBankcardInputUI;
        this.f367170a = dVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ow3.d dVar = this.f367170a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "check response error: %s, %s", java.lang.Integer.valueOf(dVar.f349397s.f386024d), dVar.f349397s.f386025e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.f349397s.f386025e)) {
            return;
        }
        db5.e1.G(this.f367171b.getContext(), dVar.f349397s.f386025e, null, false, new qw3.j(this));
    }
}
