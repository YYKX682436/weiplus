package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class y1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(false);
        this.f152764d = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView;
        if (view.getId() == com.tencent.mm.R.id.peu || view.getId() == com.tencent.mm.R.id.pau || view.getId() == com.tencent.mm.R.id.paw) {
            int id6 = view.getId();
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152764d;
            if (id6 == com.tencent.mm.R.id.peu && (offlineAlertView = walletOfflineCoinPurseUI.R1) != null && offlineAlertView.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView2 = walletOfflineCoinPurseUI.R1;
            if ((offlineAlertView2 == null || !offlineAlertView2.e()) && currentTimeMillis - walletOfflineCoinPurseUI.f152502d >= 400 && yo3.m.k()) {
                int i17 = walletOfflineCoinPurseUI.f152504e;
                if (i17 == 2 || i17 == 1 || i17 == 7) {
                    return;
                }
                if (view.getId() == com.tencent.mm.R.id.peu) {
                    walletOfflineCoinPurseUI.f152544x1 = false;
                } else if (view.getId() == com.tencent.mm.R.id.pau || view.getId() == com.tencent.mm.R.id.paw) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13958, 4);
                    walletOfflineCoinPurseUI.f152544x1 = true;
                }
                com.tencent.mm.wallet_core.ui.w wVar = walletOfflineCoinPurseUI.O1;
                if (wVar != null) {
                    if (wVar != null) {
                        wVar.f214249e = walletOfflineCoinPurseUI.f152526p1;
                        wVar.f214246b = walletOfflineCoinPurseUI.f152512i;
                        wVar.f214247c = walletOfflineCoinPurseUI.f152518m;
                        db5.d5 d5Var = wVar.f214252h;
                        if (d5Var != null && d5Var.isShowing()) {
                            wVar.d();
                        }
                    }
                    walletOfflineCoinPurseUI.O1.c(view, walletOfflineCoinPurseUI.f152544x1);
                }
                walletOfflineCoinPurseUI.f152502d = currentTimeMillis;
            }
        }
    }
}
