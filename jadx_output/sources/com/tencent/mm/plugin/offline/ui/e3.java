package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class e3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152608d;

    public e3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152608d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152608d;
        walletOfflineCoinPurseUI.f152548y1 = false;
        android.app.Dialog dialog = walletOfflineCoinPurseUI.f152547y0;
        if (dialog != null && dialog.isShowing()) {
            walletOfflineCoinPurseUI.f152547y0.dismiss();
        }
        to3.q.e();
        android.app.Dialog dialog2 = walletOfflineCoinPurseUI.f152547y0;
        if (dialog2 != null && dialog2.isShowing()) {
            walletOfflineCoinPurseUI.f152547y0.dismiss();
        }
        walletOfflineCoinPurseUI.s7();
        return false;
    }
}
