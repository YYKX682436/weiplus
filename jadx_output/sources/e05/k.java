package e05;

/* loaded from: classes9.dex */
public class k implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246182d;

    public k(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246182d = walletWXCreditChangeAmountUI;
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
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246182d;
        walletWXCreditChangeAmountUI.dismissDialog(1);
        if (walletWXCreditChangeAmountUI.f188529i) {
            walletWXCreditChangeAmountUI.f188526f.f225609a = 0;
            walletWXCreditChangeAmountUI.f188526f = (d05.l) ((java.util.ArrayList) walletWXCreditChangeAmountUI.f188525e).get(i17);
            walletWXCreditChangeAmountUI.f188526f.f225609a = 1;
        } else {
            walletWXCreditChangeAmountUI.f188527g.f225609a = 0;
            walletWXCreditChangeAmountUI.f188527g = (d05.l) ((java.util.ArrayList) walletWXCreditChangeAmountUI.f188525e).get(i17);
            walletWXCreditChangeAmountUI.f188527g.f225609a = 2;
        }
        walletWXCreditChangeAmountUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
