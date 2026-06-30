package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class j2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152655d;

    public j2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152655d = walletOfflineCoinPurseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17;
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152655d;
        walletOfflineCoinPurseUI.getClass();
        if (com.tencent.mm.wallet_core.b.a().b()) {
            walletOfflineCoinPurseUI.A2.alive();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            yo3.m.x(walletOfflineCoinPurseUI, 0, walletOfflineCoinPurseUI.f152510h, walletOfflineCoinPurseUI.getInput());
        } else {
            yo3.m.w(walletOfflineCoinPurseUI, 0, walletOfflineCoinPurseUI.f152510h);
        }
        walletOfflineCoinPurseUI.f152522o = true;
    }
}
