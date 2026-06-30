package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f148490d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetUserInfoEvent f148491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148492f;

    public t1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent) {
        this.f148492f = mallIndexUIv2;
        this.f148491e = walletGetUserInfoEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148492f;
        if (mallIndexUIv2.isFinishing() || mallIndexUIv2.hasFinish() || mallIndexUIv2.isDestroyed()) {
            return;
        }
        boolean z17 = mallIndexUIv2.f148292y.f7294c;
        if (mallIndexUIv2.f148291x || mallIndexUIv2.getContext().isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexUIv2", "error for callback ac finish");
            return;
        }
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = this.f148491e;
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", java.lang.Boolean.valueOf(walletGetUserInfoEvent.f54959h.f7311t), java.lang.Boolean.valueOf(this.f148490d));
        am.m10 m10Var = walletGetUserInfoEvent.f54959h;
        mallIndexUIv2.f148292y = m10Var;
        com.tencent.mm.modelbase.m1 m1Var = m10Var.f7312u;
        if ((m1Var != null) & (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.o)) {
            com.tencent.mm.wallet_core.tenpay.model.o oVar = (com.tencent.mm.wallet_core.tenpay.model.o) m1Var;
            if (oVar.isJumpRemind()) {
                com.tencent.mm.wallet_core.model.p0 jumpRemind = oVar.getJumpRemind();
                jumpRemind.a();
                com.tencent.mm.wallet_core.model.o0 o0Var = jumpRemind.f213967f;
                if (!jumpRemind.f213963b && jumpRemind.f213962a == 2 && o0Var.f213955a == 1) {
                    mallIndexUIv2.G = false;
                    mallIndexUIv2.T.alive();
                    r45.yt5 yt5Var = new r45.yt5();
                    yt5Var.f391354d = 1;
                    yt5Var.f391355e = o0Var.f213956b;
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    try {
                        create.putBinary("route_info", yt5Var.toByteArray());
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, new com.tencent.mm.plugin.mall.ui.r1(this));
                    } catch (java.io.IOException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                } else {
                    jumpRemind.g(mallIndexUIv2, new com.tencent.mm.plugin.mall.ui.s1(this));
                }
            }
        }
        am.m10 m10Var2 = mallIndexUIv2.f148292y;
        if (m10Var2.f7295d == 0) {
            if (m10Var2.f7311t) {
                mallIndexUIv2.m7();
            }
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip call");
            am.m10 m10Var3 = mallIndexUIv2.f148292y;
            if (m10Var3 == null || !(m10Var3.f7293b || m10Var3.f7296e)) {
                com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexUIv2", "user is not reg or simplereg，should not show this dialog");
            } else {
                boolean e18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
                boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e18);
                if (!booleanValue && e18) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.wallet_core.ui.x4.b(mallIndexUIv2);
                }
            }
            if (!this.f148490d) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "query wechat wallet");
                ef3.q.a(null, false, false, 0);
            }
            am.m10 m10Var4 = mallIndexUIv2.f148292y;
            if (mallIndexUIv2.W) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "isDoRealname bye bye");
            } else if ("1".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "need realname verify");
            } else if ("2".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "need upload credit");
                mallIndexUIv2.W = true;
                if (com.tencent.mm.sdk.platformtools.t8.K0(m10Var4.f7315x)) {
                    com.tencent.mm.plugin.wallet_core.ui.x4.c(mallIndexUIv2, m10Var4.f7306o, m10Var4.f7305n, m10Var4.f7307p, m10Var4.f7299h, m10Var4.f7300i, m10Var4.f7301j, m10Var4.f7304m, m10Var4.f7303l, m10Var4.f7302k);
                } else {
                    mallIndexUIv2.q7(m10Var4.f7315x);
                }
            } else if ("3".equals(m10Var4.f7298g)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "need increase the balance amount");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo a17 = com.tencent.mm.plugin.wallet_core.model.ECardInfo.a();
                if (a17 != null && mallIndexUIv2.F == null && !mallIndexUIv2.E) {
                    android.app.Dialog a18 = com.tencent.mm.plugin.wallet_core.ui.x4.a(mallIndexUIv2, a17, 0);
                    mallIndexUIv2.F = a18;
                    a18.setOnDismissListener(new com.tencent.mm.plugin.mall.ui.q1(mallIndexUIv2));
                    mallIndexUIv2.E = true;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "realnameGuideFlag =  " + m10Var4.f7298g);
            }
            mallIndexUIv2.W6();
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", java.lang.Integer.valueOf(mallIndexUIv2.f148292y.f7308q), java.lang.Boolean.valueOf(mallIndexUIv2.f148292y.f7309r), mallIndexUIv2.f148292y.f7310s);
            am.m10 m10Var5 = mallIndexUIv2.f148292y;
            int i17 = m10Var5.f7308q;
            java.lang.String str = m10Var5.f7310s;
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
            gm0.j1.i();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
            com.tencent.mm.plugin.mall.ui.u1 u1Var = new com.tencent.mm.plugin.mall.ui.u1(mallIndexUIv2);
            boolean z18 = (2097152 & intValue) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(intValue));
            mallIndexUIv2.A.d(u1Var, z18);
        }
        if (m10Var.f7311t && this.f148490d) {
            mallIndexUIv2.M = mallIndexUIv2.f148292y.f7313v;
            mallIndexUIv2.n7();
        }
        am.m10 m10Var6 = mallIndexUIv2.f148292y;
        com.tencent.mm.modelbase.m1 m1Var2 = m10Var6.f7312u;
        if ((m1Var2 instanceof ss4.e0) & (m1Var2 != null)) {
            mallIndexUIv2.q7(m10Var6.f7314w);
        }
        this.f148490d = true;
    }
}
