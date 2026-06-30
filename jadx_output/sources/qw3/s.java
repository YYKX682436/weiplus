package qw3;

/* loaded from: classes9.dex */
public class s implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367200d;

    public s(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367200d = bankRemitBankcardInputUI;
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
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "name_remind_list click: %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367200d;
        bankRemitBankcardInputUI.H = false;
        bankRemitBankcardInputUI.G = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) adapterView.getAdapter().getItem(i17);
        bankRemitBankcardInputUI.h7();
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = bankRemitBankcardInputUI.G;
        java.lang.String str = transferRecordParcel.f156470d;
        java.lang.String str2 = bankRemitBankcardInputUI.f156495y;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", str);
        bankRemitBankcardInputUI.doSceneProgress(new ow3.a(str, str2, transferRecordParcel.f156474h), false);
        com.tencent.mm.sdk.platformtools.u3.i(new qw3.r(this), 500L);
        bankRemitBankcardInputUI.f156486p.setVisibility(8);
        bankRemitBankcardInputUI.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
