package qw3;

/* loaded from: classes9.dex */
public class l1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.e f367176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367177b;

    public l1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI, ow3.e eVar) {
        this.f367177b = bankRemitSelectPayeeUI;
        this.f367176a = eVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f367176a.f349402u;
        int i19 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.f156538q;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367177b;
        bankRemitSelectPayeeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do remove record");
        int size = ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(size)).f156470d.equals(str2)) {
                ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).remove(size);
                break;
            }
        }
        bankRemitSelectPayeeUI.f156541g.notifyDataSetChanged();
        if (bankRemitSelectPayeeUI.f156544m == null) {
            bankRemitSelectPayeeUI.f156544m = new java.util.ArrayList();
        }
        bankRemitSelectPayeeUI.f156544m.add(str2);
        bankRemitSelectPayeeUI.f156547p.putStringArrayListExtra("key_delete_seq_no_list", bankRemitSelectPayeeUI.f156544m);
        bankRemitSelectPayeeUI.setResult(0, bankRemitSelectPayeeUI.f156547p);
    }
}
