package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class m2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        super(false);
        this.f147162e = luckyMoneyDetailUI;
        this.f147161d = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.model.lqt.u0 u0Var;
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.f146047p3;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147162e;
        luckyMoneyDetailUI.getClass();
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f147161d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "onClick tips, jumpChangeType: %s, url: %s", java.lang.Integer.valueOf(e1Var.R), e1Var.N);
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.N)) {
            int i18 = e1Var.R;
            if (i18 != 1) {
                if (i18 == 2) {
                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyDetailUI.getContext(), e1Var.N, true);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 1, e1Var.N);
                } else if (i18 == 3) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(e1Var.N);
                        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
                        java.lang.String optString2 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                        nxVar.f7466a = optString;
                        if (optString2 == null) {
                            optString2 = "";
                        }
                        nxVar.f7467b = optString2;
                        nxVar.f7469d = 1100;
                        nxVar.f7468c = 0;
                        nxVar.f7471f = luckyMoneyDetailUI;
                        startAppBrandUIFromOuterEvent.e();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 1, e1Var.N);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyDetailUI", e17, "handle jump weapp error: %s", e17.getMessage());
                    }
                }
            } else if (e1Var.N.startsWith("weixin://wcpay/lqtdetail") || e1Var.N.startsWith("weixin://wcpay/lqt/detail")) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(e1Var.N);
                if (!((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(luckyMoneyDetailUI.getContext())) {
                    j45.l.h(luckyMoneyDetailUI.getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 1, e1Var.N);
            } else if (e1Var.N.startsWith("weixin://wcpay/lqt/save")) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(e1Var.N);
                java.lang.String a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(e1Var.N);
                boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[isKindaRouteEnabled] enable: %s", java.lang.Boolean.valueOf(l17));
                if (l17) {
                    com.tencent.mm.plugin.luckymoney.model.l4.a(luckyMoneyDetailUI, a17);
                } else {
                    com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var = (com.tencent.mm.plugin.wallet.balance.model.lqt.z0) new em5.i().a(luckyMoneyDetailUI, com.tencent.mm.plugin.wallet.balance.model.lqt.z0.class);
                    if (z0Var == null || (u0Var = z0Var.f177755b) == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetchLqtDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                    } else {
                        android.app.Dialog e18 = com.tencent.mm.wallet_core.ui.b2.e(luckyMoneyDetailUI, false, false, null);
                        ((km5.q) u0Var.b().h(new com.tencent.mm.plugin.luckymoney.ui.p2(luckyMoneyDetailUI, z0Var, e18, a17))).s(new com.tencent.mm.plugin.luckymoney.ui.n2(luckyMoneyDetailUI, e18));
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 1, e1Var.N);
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (android.text.TextUtils.isEmpty(e1Var.N)) {
            com.tencent.mm.wallet_core.ui.r1.q0(12, 1);
            h45.a0.b(luckyMoneyDetailUI.getContext(), 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 0, "");
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + e1Var.N);
        if (e1Var.N.startsWith("weixin://wxpay")) {
            com.tencent.mm.wallet_core.ui.r1.q0(12, 1);
            h45.a0.b(luckyMoneyDetailUI.getContext(), 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 0, e1Var.N);
        } else {
            com.tencent.mm.wallet_core.ui.r1.q0(7, 1);
            com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyDetailUI.getContext(), e1Var.N, true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13184, 1, e1Var.N);
        }
    }
}
