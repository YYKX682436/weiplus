package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180609d;

    public s2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180609d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("GetAddress", true);
        intent.putExtra("ShowSelectedLocation", false);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180609d;
        int i17 = walletCardElementUI.W.I;
        l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
        if (!((i17 & 2) > 0)) {
            intent.putExtra("IsRealNameVerifyScene", true);
            intent.putExtra("IsNeedShowSearchBar", true);
        }
        java.lang.String[] strArr = walletCardElementUI.L1;
        if (strArr != null && strArr.length > 0) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.addAll(java.util.Arrays.asList(walletCardElementUI.L1));
            arrayList2.remove("CN");
            arrayList2.remove("TW");
            arrayList2.remove("HK");
            arrayList2.remove("MO");
            intent.putStringArrayListExtra("BlockedCountries", arrayList2);
        }
        j45.l.v(walletCardElementUI.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
