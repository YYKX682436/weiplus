package qw3;

/* loaded from: classes9.dex */
public class m1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367178d;

    public m1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI) {
        this.f367178d = bankRemitSelectPayeeUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectPayeeUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) adapterView.getAdapter().getItem(i17);
        if (transferRecordParcel != null) {
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367178d;
            bankRemitSelectPayeeUI.f156547p.putExtra("key_bank_card_seqno", transferRecordParcel.f156470d);
            bankRemitSelectPayeeUI.setResult(-1, bankRemitSelectPayeeUI.f156547p);
            bankRemitSelectPayeeUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectPayeeUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
