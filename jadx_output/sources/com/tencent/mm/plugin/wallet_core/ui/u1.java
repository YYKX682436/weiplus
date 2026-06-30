package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180632d;

    public u1(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180632d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180632d;
        android.content.Intent intent = new android.content.Intent(walletCardElementUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI.class);
        intent.putExtra("key_profession_list", walletCardElementUI.Q1);
        walletCardElementUI.startActivityForResult(intent, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
