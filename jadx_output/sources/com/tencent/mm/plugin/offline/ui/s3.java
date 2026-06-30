package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class s3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.t3 f152712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.offline.ui.t3 t3Var) {
        super(false);
        this.f152712d = t3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click f2f lucky");
        com.tencent.mm.plugin.offline.ui.t3 t3Var = this.f152712d;
        t3Var.f152724g.f152500b2 = false;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(18);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14021, 4, java.lang.Integer.valueOf(t3Var.f152724g.T1));
        j45.l.h(t3Var.f152724g.getContext(), "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            t3Var.f152635d.setVisibility(8);
            g0Var.d(14396, 5);
        }
    }
}
