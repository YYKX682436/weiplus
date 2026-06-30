package qw3;

/* loaded from: classes9.dex */
public class k1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.g f367172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI f367173b;

    public k1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI bankRemitSelectBankUI, ow3.g gVar) {
        this.f367173b = bankRemitSelectBankUI;
        this.f367172a = gVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.pa3 pa3Var = this.f367172a.f349408s;
        java.util.LinkedList<r45.qd> linkedList = pa3Var.f382912g;
        java.util.LinkedList<r45.qd> linkedList2 = pa3Var.f382911f;
        pw3.b bVar = new pw3.b();
        if (linkedList != null && !linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectBankUI", "freq card count: %s", java.lang.Integer.valueOf(linkedList2.size()));
            for (r45.qd qdVar : linkedList) {
                fb5.n nVar = new fb5.n();
                nVar.f260897a = "☆";
                nVar.f260898b = qdVar;
                arrayList.add(nVar);
            }
        }
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectBankUI", "card count: %s", java.lang.Integer.valueOf(linkedList2.size()));
            java.util.Collections.sort(linkedList2, bVar);
            for (r45.qd qdVar2 : linkedList2) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(qdVar2.f383839e)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(qdVar2.f383847p)) {
                        str2 = "" + pw3.a.b(qdVar2.f383839e, '#', true);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectBankUI", "use sort pingyin: %s", qdVar2.f383847p);
                        str2 = "" + qdVar2.f383847p.toUpperCase().charAt(0);
                    }
                    fb5.n nVar2 = new fb5.n();
                    nVar2.f260897a = str2;
                    nVar2.f260898b = qdVar2;
                    arrayList.add(nVar2);
                }
            }
        }
        this.f367173b.f156537e.e(arrayList);
    }
}
