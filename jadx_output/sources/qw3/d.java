package qw3;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.a f367147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367148b;

    public d(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.a aVar) {
        this.f367148b = bankRemitBankcardInputUI;
        this.f367147a = aVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ow3.a aVar = this.f367147a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "appoint reponse error: %s, msg: %s", java.lang.Integer.valueOf(aVar.f349390s.f385591d), aVar.f349390s.f385592e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f349390s.f385592e)) {
            return;
        }
        db5.e1.G(this.f367148b.getContext(), aVar.f349390s.f385592e, null, false, new qw3.c(this));
    }
}
