package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes11.dex */
public class j5 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k5 f180360a;

    public j5(com.tencent.mm.plugin.wallet_core.ui.k5 k5Var) {
        this.f180360a = k5Var;
    }

    @Override // bi4.l1
    public void onFinishAction(int i17, java.lang.String str, pj4.r0 r0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction result :%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.wallet_core.ui.k5 k5Var = this.f180360a;
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click error");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 4, k5Var.f180379m.f180032p);
                db5.e1.y(k5Var.f180379m.getContext(), k5Var.f180379m.getContext().getString(com.tencent.mm.R.string.ksj), "", k5Var.f180379m.getContext().getString(com.tencent.mm.R.string.ke6), new com.tencent.mm.plugin.wallet_core.ui.i5(this));
                return;
            } else if (i17 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction default");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click cancel");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 2, k5Var.f180379m.f180032p);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click ok");
        if (r0Var == null || r0Var.f355272d != 2) {
            return;
        }
        if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(k5Var.f180376g)) {
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = k5Var.f180379m.f180044x1;
            java.lang.String str2 = k5Var.f180378i;
            int i18 = k5Var.f180377h;
            cdnImageView.b(str2, i18, i18, -1);
        } else {
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = k5Var.f180379m.f180044x1;
            java.lang.String str3 = k5Var.f180376g;
            int i19 = k5Var.f180377h;
            cdnImageView2.b(str3, i19, i19, -1);
        }
        java.lang.String str4 = r0Var.f355273e.f355311d;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = k5Var.f180379m;
        walletOrderInfoNewUI.f180047y1.setText(walletOrderInfoNewUI.getString(com.tencent.mm.R.string.ksi, str4));
        k5Var.f180379m.f180049z1.setVisibility(8);
        k5Var.f180379m.f180034p1.setOnClickListener(null);
        k5Var.f180379m.f180034p1.setBackground(null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 3, k5Var.f180379m.f180032p);
    }
}
