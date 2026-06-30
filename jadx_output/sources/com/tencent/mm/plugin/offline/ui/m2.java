package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class m2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152674d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152674d;
        yo3.m.y(walletOfflineCoinPurseUI, "create", walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.l1o), 0, walletOfflineCoinPurseUI.f152510h);
    }
}
