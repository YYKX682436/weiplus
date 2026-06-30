package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class n5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo f180515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo) {
        super(false);
        this.f180516e = walletOrderInfoNewUI;
        this.f180515d = showInfo;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = this.f180515d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onClick jump tinyApp, linkWeApp:%s, linkAddr:%s", showInfo.f179810i, showInfo.f179811m);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str = showInfo.f179810i;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = showInfo.f179811m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = ad1.d.CTRL_INDEX;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180516e;
        nxVar.f7470e = walletOrderInfoNewUI.f180029m;
        nxVar.f7468c = 0;
        nxVar.f7471f = walletOrderInfoNewUI;
        startAppBrandUIFromOuterEvent.e();
    }
}
