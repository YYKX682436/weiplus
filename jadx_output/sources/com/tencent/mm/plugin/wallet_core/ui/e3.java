package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class e3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI f180246d;

    public e3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
        this.f180246d = walletCardSelectUI;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI = this.f180246d;
        com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) walletCardSelectUI.f179972q.f180401e.get(i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(elementQuery.f179665y)) {
            db5.e1.G(walletCardSelectUI, elementQuery.f179665y, null, true, null);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (elementQuery.b()) {
            walletCardSelectUI.f179969n = i17;
        } else {
            walletCardSelectUI.f179970o = i17;
        }
        walletCardSelectUI.enableOptionMenu(true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
