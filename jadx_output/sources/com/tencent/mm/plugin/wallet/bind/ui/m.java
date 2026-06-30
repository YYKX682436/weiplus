package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes.dex */
public class m implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178636a;

    public m(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f178636a = walletBankcardDetailUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + this.f178636a.getString(com.tencent.mm.R.string.kfv)));
        intent.addFlags(268435456);
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI = this.f178636a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletBankcardDetailUI, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletBankcardDetailUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletBankcardDetailUI, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
