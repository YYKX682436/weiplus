package qw3;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.a f367152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367153b;

    public e(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.a aVar) {
        this.f367153b = bankRemitBankcardInputUI;
        this.f367152a = aVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sa saVar = this.f367152a.f349390s;
        java.lang.String str2 = saVar.f385594g;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367153b;
        bankRemitBankcardInputUI.f156494x = str2;
        bankRemitBankcardInputUI.F = new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel(saVar.f385593f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.F;
        objArr[0] = bankcardElemParcel != null ? bankcardElemParcel.f156455e : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "response bank: %s", objArr);
        bankRemitBankcardInputUI.f7();
        bankRemitBankcardInputUI.d7();
        bankRemitBankcardInputUI.g7();
        bankRemitBankcardInputUI.Z6();
        bankRemitBankcardInputUI.e7();
    }
}
