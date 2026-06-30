package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI f181037d;

    public a(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI) {
        this.f181037d = walletECardBindCardListUI;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "position: %d", java.lang.Integer.valueOf(i17));
        int itemViewType = adapterView.getAdapter().getItemViewType(i17);
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI = this.f181037d;
        java.util.Objects.requireNonNull(walletECardBindCardListUI.f181013g);
        if (itemViewType == 1) {
            int i18 = walletECardBindCardListUI.f181014h;
            walletECardBindCardListUI.U6();
        } else {
            r45.od odVar = (r45.od) adapterView.getAdapter().getItem(i17);
            if (odVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletECardBindCardListUI", "empty item");
                yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            walletECardBindCardListUI.getNetController().d(odVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
