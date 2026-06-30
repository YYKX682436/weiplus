package e05;

/* loaded from: classes9.dex */
public class l implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246183d;

    public l(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246183d = walletWXCreditChangeAmountUI;
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
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246183d;
        walletWXCreditChangeAmountUI.dismissDialog(2);
        if (walletWXCreditChangeAmountUI.f188530m) {
            if (i17 == 0) {
                walletWXCreditChangeAmountUI.f188526f.f225611c = "Y";
            } else {
                walletWXCreditChangeAmountUI.f188526f.f225611c = "N";
            }
        } else if (i17 == 0) {
            walletWXCreditChangeAmountUI.f188527g.f225611c = "Y";
        } else {
            walletWXCreditChangeAmountUI.f188527g.f225611c = "N";
        }
        walletWXCreditChangeAmountUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
