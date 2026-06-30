package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class y5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        super(false);
        this.f178454d = walletLqtSaveFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178454d;
        walletLqtSaveFetchUI.hideTenpayKB();
        if (walletLqtSaveFetchUI.S == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 28);
            i17 = 2;
        } else {
            i17 = -1;
        }
        if (walletLqtSaveFetchUI.S == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 3);
        }
        walletLqtSaveFetchUI.m7(null, i17);
        if (walletLqtSaveFetchUI.F) {
            walletLqtSaveFetchUI.f178054f.f177622e.b(1, 0);
        }
    }
}
