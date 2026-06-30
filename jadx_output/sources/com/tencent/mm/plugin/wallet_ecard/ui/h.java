package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI f181046d;

    public h(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI walletECardElementInputUI) {
        this.f181046d = walletECardElementInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI walletECardElementInputUI = this.f181046d;
        bundle.putInt("key_support_bankcard", walletECardElementInputUI.getInput().getInt("key_support_bankcard", 3));
        bundle.putInt("key_bind_scene", walletECardElementInputUI.getInput().getInt("key_bind_scene", -1));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(walletECardElementInputUI.f181023d.getText())) {
            bundle.putString("key_bank_type", walletECardElementInputUI.f181024e.f179659s);
            bundle.putInt("key_bankcard_type", walletECardElementInputUI.f181024e.f179658r);
        }
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletECardElementInputUI);
        if (g17 != null) {
            g17.E(walletECardElementInputUI, com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
