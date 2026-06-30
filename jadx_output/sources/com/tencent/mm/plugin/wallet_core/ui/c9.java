package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class c9 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI f180178d;

    public c9(com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI walletSwitchWalletCurrencyUI) {
        this.f180178d = walletSwitchWalletCurrencyUI;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI walletSwitchWalletCurrencyUI = this.f180178d;
        at4.j1 item = walletSwitchWalletCurrencyUI.f180108f.getItem(i17);
        at4.j1 j1Var = walletSwitchWalletCurrencyUI.f180108f.f180277f;
        walletSwitchWalletCurrencyUI.getClass();
        if (item != null && (j1Var == null || !j1Var.field_wallet_tpa_country.equals(item.field_wallet_tpa_country))) {
            walletSwitchWalletCurrencyUI.f180109g = item;
            java.lang.String str = item.field_wallet_tpa_country;
            walletSwitchWalletCurrencyUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doSetUserWallet walletid = " + str);
            walletSwitchWalletCurrencyUI.doSceneForceProgress(new ss4.v(str));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
