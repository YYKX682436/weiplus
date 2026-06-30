package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class a1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f177864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        super(false);
        this.f177864d = walletBalanceManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f177864d;
        android.content.Intent intent = new android.content.Intent(walletBalanceManagerUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.class);
        intent.putExtra("key_account_type", 1);
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(walletBalanceManagerUI.getContext())) {
            return;
        }
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI2 = this.f177864d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletBalanceManagerUI2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$8", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletBalanceManagerUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletBalanceManagerUI2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$8", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
