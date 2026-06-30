package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180283d;

    public g2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180283d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180283d;
        bundle.putInt("key_support_bankcard", walletCardElementUI.getInput().getInt("key_support_bankcard", 3));
        bundle.putInt("key_bind_scene", walletCardElementUI.getInput().getInt("key_bind_scene", -1));
        walletCardElementUI.f179927t.getText();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        walletCardElementUI.hideTenpayKB();
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletCardElementUI);
        if (g17 != null) {
            g17.E(walletCardElementUI, com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
