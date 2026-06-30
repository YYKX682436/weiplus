package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class d2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152602d;

    public d2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152602d = walletOfflineCoinPurseUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152602d;
        g4Var.f(0, walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.f493633l23));
        g4Var.d(1, walletOfflineCoinPurseUI.getResources().getColor(com.tencent.mm.R.color.f478532ac), walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.l1h));
    }
}
