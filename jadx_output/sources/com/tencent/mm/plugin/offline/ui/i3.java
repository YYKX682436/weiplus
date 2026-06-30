package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class i3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.j3 f152649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.offline.ui.j3 j3Var) {
        super(false);
        this.f152649d = j3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(16);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.offline.ui.j3 j3Var = this.f152649d;
        g0Var.d(14021, 3, java.lang.Integer.valueOf(j3Var.f152656g.T1));
        android.content.Intent intent = new android.content.Intent();
        int i17 = j3Var.f152656g.A1;
        if (i17 == 1) {
            intent.putExtra("enter_scene", 2);
        } else if (i17 == 2) {
            intent.putExtra("enter_scene", 4);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", java.lang.Integer.valueOf(i17));
        }
        j45.l.j(j3Var.f152656g.getContext(), "aa", ".ui.AAEntranceUI", intent, null);
        j3Var.f152656g.f152500b2 = false;
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            j3Var.f152635d.setVisibility(8);
            g0Var.d(14396, 4);
        }
    }
}
