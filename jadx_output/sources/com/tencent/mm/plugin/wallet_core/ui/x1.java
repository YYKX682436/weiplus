package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180786d;

    public x1(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180786d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180786d;
        intent.setClassName(walletCardElementUI.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
        intent.putExtra("exclude_countries_iso", walletCardElementUI.L1);
        intent.putExtra("CountryCodeUI_isShowCountryCode", false);
        intent.putExtra("ui_title", walletCardElementUI.getString(com.tencent.mm.R.string.kzf));
        walletCardElementUI.startActivityForResult(intent, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
