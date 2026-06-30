package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders.Commodity f180585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity) {
        super(false);
        this.f180586e = walletOrderInfoNewUI;
        this.f180585d = commodity;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180586e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "click tiny app, userName: %s, path: %s, version: %s", walletOrderInfoNewUI.f180035q, walletOrderInfoNewUI.f180036r, java.lang.Integer.valueOf(walletOrderInfoNewUI.f180037s));
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str = walletOrderInfoNewUI.f180035q;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = walletOrderInfoNewUI.f180036r;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1034;
        boolean z18 = false;
        nxVar.f7468c = 0;
        int i17 = walletOrderInfoNewUI.f180037s;
        if (i17 > 0) {
            nxVar.f7474i = i17;
        }
        nxVar.f7471f = walletOrderInfoNewUI;
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = this.f180585d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(commodity.D.f179796i) && commodity.D.f179797m > 0) {
            z18 = true;
        }
        walletOrderInfoNewUI.K1 = z18;
        if (walletOrderInfoNewUI.K1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14118, walletOrderInfoNewUI.f180029m, walletOrderInfoNewUI.getPayReqKey(), 3);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14118, walletOrderInfoNewUI.f180029m, walletOrderInfoNewUI.getPayReqKey(), 1);
        }
    }
}
