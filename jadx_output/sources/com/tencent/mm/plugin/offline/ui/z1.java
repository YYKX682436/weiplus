package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class z1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152771d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.f7(2);
        java.lang.String str = (view.getTag() == null || !(view.getTag() instanceof java.lang.String)) ? "" : (java.lang.String) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "mOfflineGuideButtonTv click! bindSerial:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152771d;
        walletOfflineCoinPurseUI.E1 = false;
        walletOfflineCoinPurseUI.f152509g2 = true;
        walletOfflineCoinPurseUI.b7(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().e(str), false, null);
    }
}
