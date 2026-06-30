package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class r0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI f180594d;

    public r0(com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI) {
        this.f180594d = walletBankCardSelectUI;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBankCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f180594d.onItemSelect(((fb5.n) adapterView.getAdapter().getItem(i17)).f260898b, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
