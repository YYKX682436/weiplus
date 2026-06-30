package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class s5 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180614a;

    public s5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f180614a = walletOrderInfoNewUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.f180022b2;
        this.f180614a.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180614a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletOrderInfoNewUI, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletOrderInfoNewUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletOrderInfoNewUI, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
