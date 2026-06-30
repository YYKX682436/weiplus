package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class w3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.x3 f152753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.offline.ui.x3 x3Var) {
        super(false);
        this.f152753d = x3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        np5.b0 b0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
        com.tencent.mm.plugin.offline.ui.x3 x3Var = this.f152753d;
        x3Var.f152762g.f152500b2 = false;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(19);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = x3Var.f152762g;
        g0Var.d(14021, 5, java.lang.Integer.valueOf(walletOfflineCoinPurseUI.T1));
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            x3Var.f152635d.setVisibility(8);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            j45.l.h(walletOfflineCoinPurseUI.getContext(), "collect", ".reward.ui.QrRewardMainUI");
            return;
        }
        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
        b0Var = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletOfflineCoinPurseUI).mNetSceneMgr;
        a3Var.f353966t.f(walletOfflineCoinPurseUI, 4, b0Var, new com.tencent.mm.plugin.offline.ui.v3(this), false, 1006, false);
        walletOfflineCoinPurseUI.doSceneForceProgress(new ys4.j(1, "reward"));
    }
}
