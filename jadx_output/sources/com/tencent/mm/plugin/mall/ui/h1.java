package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f148387d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetUserInfoEvent f148388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148389f;

    public h1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent) {
        this.f148389f = mallIndexUI;
        this.f148388e = walletGetUserInfoEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI = this.f148389f;
        if (mallIndexUI.isFinishing() || mallIndexUI.hasFinish() || mallIndexUI.isDestroyed()) {
            return;
        }
        boolean z17 = mallIndexUI.f148285w.f7294c;
        if (mallIndexUI.f148284v || mallIndexUI.getContext().isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexUI", "error for callback ac finish");
            return;
        }
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = this.f148388e;
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", java.lang.Boolean.valueOf(walletGetUserInfoEvent.f54959h.f7311t), java.lang.Boolean.valueOf(this.f148387d));
        am.m10 m10Var = walletGetUserInfoEvent.f54959h;
        mallIndexUI.f148285w = m10Var;
        com.tencent.mm.modelbase.m1 m1Var = m10Var.f7312u;
        if ((m1Var != null) & (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.o)) {
            com.tencent.mm.wallet_core.tenpay.model.o oVar = (com.tencent.mm.wallet_core.tenpay.model.o) m1Var;
            if (oVar.isJumpRemind()) {
                oVar.getJumpRemind().g(mallIndexUI, new com.tencent.mm.plugin.mall.ui.g1(this));
            }
        }
        am.m10 m10Var2 = mallIndexUI.f148285w;
        if (m10Var2.f7295d == 0) {
            if (m10Var2.f7311t) {
                mallIndexUI.j7();
            }
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
            am.m10 m10Var3 = mallIndexUI.f148285w;
            if (m10Var3 == null || !(m10Var3.f7293b || m10Var3.f7296e)) {
                com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
            } else {
                boolean e17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
                boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e17);
                if (!booleanValue && e17) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.wallet_core.ui.x4.b(mallIndexUI);
                }
            }
            if (!this.f148387d) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "query wechat wallet");
                ef3.q.a(null, false, false, 0);
            }
            am.m10 m10Var4 = mallIndexUI.f148285w;
            if (mallIndexUI.L) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "isDoRealname bye bye");
            } else if ("1".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "need realname verify");
            } else if ("2".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "need upload credit");
                mallIndexUI.L = true;
                com.tencent.mm.plugin.wallet_core.ui.x4.c(mallIndexUI, m10Var4.f7306o, m10Var4.f7305n, m10Var4.f7307p, m10Var4.f7299h, m10Var4.f7300i, m10Var4.f7301j, m10Var4.f7304m, m10Var4.f7303l, m10Var4.f7302k);
            } else if ("3".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "need increase the balance amount");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo a17 = com.tencent.mm.plugin.wallet_core.model.ECardInfo.a();
                if (a17 != null && mallIndexUI.C == null && !mallIndexUI.B) {
                    android.app.Dialog a18 = com.tencent.mm.plugin.wallet_core.ui.x4.a(mallIndexUI, a17, 0);
                    mallIndexUI.C = a18;
                    a18.setOnDismissListener(new com.tencent.mm.plugin.mall.ui.f1(mallIndexUI));
                    mallIndexUI.B = true;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "realnameGuideFlag =  " + m10Var4.f7298g);
            }
            mallIndexUI.U6();
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", java.lang.Integer.valueOf(mallIndexUI.f148285w.f7308q), java.lang.Boolean.valueOf(mallIndexUI.f148285w.f7309r), mallIndexUI.f148285w.f7310s);
            am.m10 m10Var5 = mallIndexUI.f148285w;
            int i17 = m10Var5.f7308q;
            java.lang.String str = m10Var5.f7310s;
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
            gm0.j1.i();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
            com.tencent.mm.plugin.mall.ui.w0 w0Var = new com.tencent.mm.plugin.mall.ui.w0(mallIndexUI);
            boolean z18 = (2097152 & intValue) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(intValue));
            mallIndexUI.f148286x.d(w0Var, z18);
        }
        if (m10Var.f7311t && this.f148387d) {
            mallIndexUI.k7();
        }
        this.f148387d = true;
    }
}
