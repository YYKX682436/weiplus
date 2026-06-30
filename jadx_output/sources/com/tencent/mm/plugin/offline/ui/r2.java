package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152700d;

    public r2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152700d = walletOfflineCoinPurseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152700d;
        walletOfflineCoinPurseUI.getClass();
        if (com.tencent.mm.wallet_core.b.a().b()) {
            walletOfflineCoinPurseUI.A2.alive();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            yo3.m.x(walletOfflineCoinPurseUI, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL, -1, walletOfflineCoinPurseUI.getInput());
        } else {
            yo3.m.w(walletOfflineCoinPurseUI.P1.f152577a, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL, -1);
        }
        walletOfflineCoinPurseUI.f152522o = true;
    }
}
