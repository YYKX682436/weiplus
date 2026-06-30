package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class f3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152617d;

    public f3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152617d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152617d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", java.lang.Boolean.valueOf(walletOfflineCoinPurseUI.Q1));
        if (walletOfflineCoinPurseUI.Q1) {
            com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent consumedCardByOfflinePayEvent = new com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent();
            consumedCardByOfflinePayEvent.f54073g.getClass();
            consumedCardByOfflinePayEvent.e();
        }
        walletOfflineCoinPurseUI.finish();
        return false;
    }
}
