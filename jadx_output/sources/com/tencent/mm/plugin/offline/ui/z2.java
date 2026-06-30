package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class z2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f152772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152773b;

    public z2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, java.util.List list) {
        this.f152773b = walletOfflineCoinPurseUI;
        this.f152772a = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152773b;
        if (walletOfflineCoinPurseUI.H1 != null) {
            walletOfflineCoinPurseUI.f152511h2 = null;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
            walletOfflineCoinPurseUI.u7();
            final com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f152772a.get(walletOfflineCoinPurseUI.H1.f284628m);
            if (bankcard.field_bindSerial.equals(walletOfflineCoinPurseUI.f152532s)) {
                walletOfflineCoinPurseUI.H1.c();
            } else {
                walletOfflineCoinPurseUI.b7(bankcard, true, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.offline.ui.z2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = com.tencent.mm.plugin.offline.ui.z2.this.f152773b;
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
