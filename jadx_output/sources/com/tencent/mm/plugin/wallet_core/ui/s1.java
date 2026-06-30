package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class s1 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180608a;

    public s1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        this.f180608a = walletBindCardResultUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.G;
        this.f180608a.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI = this.f180608a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletBindCardResultUI, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletBindCardResultUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletBindCardResultUI, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
