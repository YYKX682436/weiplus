package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class x1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152759d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152759d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click change_bankcard_layout() card：%s", walletOfflineCoinPurseUI.f152532s);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14515, 1);
        walletOfflineCoinPurseUI.f152507f2 = true;
        walletOfflineCoinPurseUI.j7(false);
    }
}
