package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class g2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152626d;

    public g2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152626d = walletOfflineCoinPurseUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152626d;
        if (walletOfflineCoinPurseUI.C1) {
            walletOfflineCoinPurseUI.f152548y1 = false;
            walletOfflineCoinPurseUI.C1 = false;
            walletOfflineCoinPurseUI.r7(0, false);
            walletOfflineCoinPurseUI.Z6(true);
        }
    }
}
