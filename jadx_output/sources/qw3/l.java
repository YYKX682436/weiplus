package qw3;

/* loaded from: classes4.dex */
public class l implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.d f367174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367175b;

    public l(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.d dVar) {
        this.f367175b = bankRemitBankcardInputUI;
        this.f367174a = dVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sz szVar = this.f367174a.f349397s;
        java.lang.String str2 = szVar.f386029i;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367175b;
        bankRemitBankcardInputUI.f156494x = str2;
        bankRemitBankcardInputUI.B = szVar.f386028h;
        bankRemitBankcardInputUI.f156496z = szVar.f386026f;
        bankRemitBankcardInputUI.A = szVar.f386027g;
        bankRemitBankcardInputUI.Q = szVar.f386030m;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.Y6(bankRemitBankcardInputUI);
    }
}
