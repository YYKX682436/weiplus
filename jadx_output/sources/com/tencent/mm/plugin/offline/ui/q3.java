package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class q3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.r3 f152696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.offline.ui.r3 r3Var) {
        super(false);
        this.f152696d = r3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        np5.b0 b0Var;
        com.tencent.mm.plugin.offline.ui.r3 r3Var = this.f152696d;
        r3Var.f152701g.f152500b2 = false;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(17);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            r3Var.f152635d.setVisibility(8);
            r3Var.f152636e.setVisibility(8);
            r3Var.f152637f.setVisibility(8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14396, 3);
        }
        boolean w17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = r3Var.f152701g;
        if (w17) {
            walletOfflineCoinPurseUI.getClass();
            com.tencent.mm.wallet_core.ui.r1.q0(32, 1);
            h45.a0.k(walletOfflineCoinPurseUI, walletOfflineCoinPurseUI.T1);
        } else {
            pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
            b0Var = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletOfflineCoinPurseUI).mNetSceneMgr;
            a3Var.f353966t.f(walletOfflineCoinPurseUI, 4, b0Var, new com.tencent.mm.plugin.offline.ui.p3(this), false, 1006, false);
            walletOfflineCoinPurseUI.doSceneForceProgress(new ys4.j(1, "collect"));
        }
    }
}
