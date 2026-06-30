package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178478d;

    public m0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f178478d = walletBalanceManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178478d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletBalanceManagerUI.f177813q.S2)) {
            intent.putExtra("rawUrl", walletBalanceManagerUI.f177813q.R2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "carson: entry_url: %s", walletBalanceManagerUI.f177813q.S2);
            intent.putExtra("rawUrl", walletBalanceManagerUI.f177813q.S2);
        }
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("KPublisherId", "pay_blance_list");
        intent.putExtra("geta8key_scene", 33);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        com.tencent.mm.wallet_core.ui.r1.T(walletBalanceManagerUI.getContext(), intent);
        com.tencent.mm.wallet_core.ui.r1.q0(16, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16503, 1, "balanceBill");
        return true;
    }
}
