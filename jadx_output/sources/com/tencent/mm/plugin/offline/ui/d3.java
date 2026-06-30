package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class d3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152603d;

    public d3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152603d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152603d;
        if (!walletOfflineCoinPurseUI.f152548y1) {
            walletOfflineCoinPurseUI.r7(0, false);
            walletOfflineCoinPurseUI.Z6(true);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = walletOfflineCoinPurseUI.f152545x2;
        long j17 = walletOfflineCoinPurseUI.f152541w2;
        b4Var.c(j17, j17);
        return false;
    }
}
