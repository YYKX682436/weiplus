package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class u5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180636a;

    public u5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f180636a = walletOrderInfoNewUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180636a;
        walletOrderInfoNewUI.Y1 = null;
        walletOrderInfoNewUI.G1.setVisibility(8);
        walletOrderInfoNewUI.E1.setVisibility(0);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(((r45.or6) fVar.f70618d).f382472d), ((r45.or6) fVar.f70618d).f382473e);
            if (((r45.or6) fVar.f70618d).f382472d == 0) {
                walletOrderInfoNewUI.P1 = false;
                walletOrderInfoNewUI.f180024a2 = 1;
                walletOrderInfoNewUI.k7();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 2, 1, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 2, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 2, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return null;
    }
}
