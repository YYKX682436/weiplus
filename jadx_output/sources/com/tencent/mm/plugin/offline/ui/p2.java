package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class p2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152690d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        yo3.m.a();
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152690d;
        yo3.m.b(walletOfflineCoinPurseUI, walletOfflineCoinPurseUI.f152510h);
        walletOfflineCoinPurseUI.getWindow().getDecorView().postDelayed(new com.tencent.mm.plugin.offline.ui.o2(this), 300L);
    }
}
