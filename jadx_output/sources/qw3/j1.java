package qw3;

/* loaded from: classes9.dex */
public class j1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI f367169d;

    public j1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI bankRemitSelectBankUI) {
        this.f367169d = bankRemitSelectBankUI;
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
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        r45.qd qdVar = (r45.qd) ((fb5.n) adapterView.getAdapter().getItem(i17)).f260898b;
        if (qdVar != null) {
            com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel(qdVar);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_bank_card_elem_parcel", bankcardElemParcel);
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI bankRemitSelectBankUI = this.f367169d;
            bankRemitSelectBankUI.setResult(-1, intent);
            bankRemitSelectBankUI.finish();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitSelectBankUI", "bankcardelem is null, : %s", java.lang.Integer.valueOf(i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
