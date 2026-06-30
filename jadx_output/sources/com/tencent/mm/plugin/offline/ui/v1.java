package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class v1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152740d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152740d;
        walletOfflineCoinPurseUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletOfflineCoinPurseUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.offline.ui.d2(walletOfflineCoinPurseUI);
        k0Var.f211881s = new com.tencent.mm.plugin.offline.ui.e2(walletOfflineCoinPurseUI);
        k0Var.v();
    }
}
