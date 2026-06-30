package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class x1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148513d;

    public x1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148513d = mallIndexUIv2;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148513d;
        at4.x0 x0Var = (at4.x0) mallIndexUIv2.M.get(menuItem.getItemId());
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "selected pay manga label, jump type = " + x0Var.f13988b);
        int i18 = x0Var.f13988b;
        if (i18 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(x0Var.f13989c)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.X(mallIndexUIv2.getContext(), x0Var.f13989c, false);
            return;
        }
        if (i18 != 2) {
            if (i18 == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23388, 2, 2);
                j45.l.m(mallIndexUIv2.getContext(), "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
                return;
            } else {
                if (i18 != 9) {
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23388, 2, 1);
                j45.l.h(mallIndexUIv2.getContext(), "mall", ".ui.MallFunctionSettingsUI");
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(x0Var.f13990d)) {
            return;
        }
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str = x0Var.f13990d;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = x0Var.f13991e;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1066;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
    }
}
