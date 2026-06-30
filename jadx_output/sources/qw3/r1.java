package qw3;

/* loaded from: classes9.dex */
public class r1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.h f367198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367199b;

    public r1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI, ow3.h hVar) {
        this.f367199b = bankRemitSelectPayeeUI;
        this.f367198a = hVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "modify success");
        ow3.h hVar = this.f367198a;
        java.lang.String str2 = hVar.f349413u;
        java.lang.String str3 = hVar.f349414v;
        int i19 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.f156538q;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367199b;
        bankRemitSelectPayeeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do modify record");
        if (bankRemitSelectPayeeUI.f156543i == null) {
            bankRemitSelectPayeeUI.f156543i = new java.util.ArrayList();
        }
        int size = ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(size);
            if (transferRecordParcel.f156470d.equals(str2)) {
                transferRecordParcel.f156476m = str3;
                bankRemitSelectPayeeUI.f156543i.add(transferRecordParcel);
                break;
            }
        }
        bankRemitSelectPayeeUI.f156541g.notifyDataSetChanged();
        bankRemitSelectPayeeUI.f156547p.putParcelableArrayListExtra("key_modified_record_list", bankRemitSelectPayeeUI.f156543i);
        bankRemitSelectPayeeUI.setResult(0, bankRemitSelectPayeeUI.f156547p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 5);
    }
}
