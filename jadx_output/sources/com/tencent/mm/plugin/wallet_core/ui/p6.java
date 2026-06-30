package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class p6 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180573a;

    public p6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI) {
        this.f180573a = walletOrderInfoOldUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = this.f180573a;
        walletOrderInfoOldUI.C = false;
        walletOrderInfoOldUI.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI2 = this.f180573a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletOrderInfoOldUI2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletOrderInfoOldUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletOrderInfoOldUI2, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
