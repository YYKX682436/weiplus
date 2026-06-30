package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI f180665d;

    public v2(com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI) {
        this.f180665d = walletCardImportUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = this.f180665d;
        bundle.putInt("key_support_bankcard", walletCardImportUI.getInput().getInt("key_support_bankcard", 3));
        bundle.putString("key_bank_type", walletCardImportUI.f179960z.f179659s);
        bundle.putInt("key_bankcard_type", walletCardImportUI.f179960z.f179658r);
        com.tencent.mm.wallet_core.a.g(walletCardImportUI).E(walletCardImportUI, com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.class, bundle, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
