package qw3;

/* loaded from: classes2.dex */
public class q0 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.j f367192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI f367193b;

    public q0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI bankRemitDetailUI, ow3.j jVar) {
        this.f367193b = bankRemitDetailUI;
        this.f367192a = jVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ow3.j jVar = this.f367192a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", java.lang.Integer.valueOf(jVar.f349419s.f376161d), jVar.f349419s.f376162e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(jVar.f349419s.f376162e);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI bankRemitDetailUI = this.f367193b;
        if (K0) {
            dp.a.makeText(bankRemitDetailUI, com.tencent.mm.R.string.adu, 1).show();
        } else {
            dp.a.makeText(bankRemitDetailUI, jVar.f349419s.f376162e, 1).show();
        }
    }
}
