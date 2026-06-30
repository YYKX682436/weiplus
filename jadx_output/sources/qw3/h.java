package qw3;

/* loaded from: classes9.dex */
public class h implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.k f367161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367162b;

    public h(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, ow3.k kVar) {
        this.f367162b = bankRemitBankcardInputUI;
        this.f367161a = kVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367162b;
        bankRemitBankcardInputUI.L = false;
        ow3.k kVar = this.f367161a;
        r45.qh5 qh5Var = kVar.f349422s;
        bankRemitBankcardInputUI.f156495y = qh5Var.f384005h;
        bankRemitBankcardInputUI.f156489s = com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel.a(qh5Var.f384004g);
        bankRemitBankcardInputUI.f156490t = com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel.a(kVar.f349422s.f384003f);
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "selfList: %d, freqList: %d", java.lang.Integer.valueOf(bankRemitBankcardInputUI.f156489s.size()), java.lang.Integer.valueOf(bankRemitBankcardInputUI.f156490t.size()));
        bankRemitBankcardInputUI.f156486p = (android.widget.ListView) bankRemitBankcardInputUI.findViewById(com.tencent.mm.R.id.k3p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = bankRemitBankcardInputUI.f156489s;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        java.util.ArrayList arrayList3 = bankRemitBankcardInputUI.f156490t;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        bankRemitBankcardInputUI.f156486p.setOnItemClickListener(new qw3.s(bankRemitBankcardInputUI));
        bankRemitBankcardInputUI.f156488r = new qw3.t(bankRemitBankcardInputUI);
        pw3.h hVar = new pw3.h(bankRemitBankcardInputUI, arrayList);
        bankRemitBankcardInputUI.f156487q = hVar;
        bankRemitBankcardInputUI.f156486p.setAdapter((android.widget.ListAdapter) hVar);
    }
}
