package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI f180171d;

    public c3(com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI) {
        this.f180171d = walletCardImportUI;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = this.f180171d;
        walletCardImportUI.dismissDialog(1);
        int intValue = ((java.lang.Integer) walletCardImportUI.f179960z.a().get(i17)).intValue();
        if (walletCardImportUI.f179940J != intValue) {
            walletCardImportUI.f179940J = intValue;
            walletCardImportUI.f179947m.setText(((android.widget.CheckedTextView) view).getText().toString());
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = walletCardImportUI.f179948n;
            int i18 = walletCardImportUI.f179940J;
            walletCardImportUI.getClass();
            rp5.b logicDelegate = walletFormView.getLogicDelegate();
            if (logicDelegate instanceof qp5.n) {
                ((qp5.n) logicDelegate).f(i18);
            }
            walletCardImportUI.f179948n.d();
            walletCardImportUI.X6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
