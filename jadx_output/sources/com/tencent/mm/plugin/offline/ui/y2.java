package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class y2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f152765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152766e;

    public y2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, java.util.List list) {
        this.f152766e = walletOfflineCoinPurseUI;
        this.f152765d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152766e;
        if (walletOfflineCoinPurseUI.H1 != null) {
            walletOfflineCoinPurseUI.f152511h2 = null;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
            walletOfflineCoinPurseUI.u7();
            final com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f152765d.get(i17);
            if (bankcard.field_bindSerial.equals(walletOfflineCoinPurseUI.f152532s)) {
                walletOfflineCoinPurseUI.H1.c();
            } else {
                walletOfflineCoinPurseUI.b7(bankcard, true, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.offline.ui.y2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = com.tencent.mm.plugin.offline.ui.y2.this.f152766e;
                        walletOfflineCoinPurseUI2.H1.c();
                        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = bankcard;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click mmBottomSheet card：%s,status：%s", bankcard2.field_bindSerial, java.lang.Integer.valueOf(bankcard2.field_defaultCardState));
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.d(14515, 3);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard2.field_forbid_title) || !com.tencent.mm.sdk.platformtools.t8.K0(bankcard2.field_forbidWord) || !bankcard2.field_support_micropay) {
                            g0Var.d(14515, 4);
                        }
                        if (bankcard2.z0()) {
                            walletOfflineCoinPurseUI2.E1 = false;
                            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.f7(3);
                        }
                    }
                });
            }
        }
    }
}
