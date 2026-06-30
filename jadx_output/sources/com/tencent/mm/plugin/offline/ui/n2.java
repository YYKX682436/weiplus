package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class n2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152681d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", java.lang.Integer.valueOf(to3.c0.Ai().Ui().d(true)));
        int d17 = to3.c0.Ai().Ui().d(true);
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152681d;
        if (d17 > 0) {
            int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
            walletOfflineCoinPurseUI.e7(true, true);
        } else {
            walletOfflineCoinPurseUI.doSceneForceProgress(new wo3.l("" + ((int) (java.lang.System.currentTimeMillis() / 1000)), 10, 10));
        }
    }
}
