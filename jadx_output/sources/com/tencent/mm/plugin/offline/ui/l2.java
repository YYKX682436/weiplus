package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class l2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152667d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        yo3.m.a();
        to3.c0.Ai().Vi(196648, "0");
        int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152667d;
        db5.e1.K(walletOfflineCoinPurseUI, false, walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.l19), "", walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.l1g), walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.offline.ui.j2(walletOfflineCoinPurseUI), new com.tencent.mm.plugin.offline.ui.k2(walletOfflineCoinPurseUI));
    }
}
