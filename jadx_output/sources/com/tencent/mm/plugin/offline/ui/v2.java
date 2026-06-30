package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class v2 extends com.tencent.mm.plugin.wallet_core.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f152741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.x2 f152742h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.offline.ui.x2 x2Var, android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(context);
        this.f152742h = x2Var;
        this.f152741g = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152741g;
        java.lang.String str = bankcard.field_forbid_url;
        boolean z07 = bankcard.z0();
        com.tencent.mm.plugin.offline.ui.x2 x2Var = this.f152742h;
        if (!z07 || !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("pay_channel", 1);
            com.tencent.mm.wallet_core.ui.r1.T(x2Var.f152761e.getContext(), intent);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand");
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str2 = bankcard.f179577p3;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str2;
        nxVar.f7467b = bankcard.f179578q3;
        nxVar.f7469d = 1137;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
        am.ox oxVar = startAppBrandUIFromOuterEvent.f54858h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand result:%s", java.lang.Boolean.valueOf(oxVar.f7581a));
        if (!oxVar.f7581a) {
            x2Var.f152761e.G1 = 0;
            return;
        }
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = x2Var.f152761e;
        walletOfflineCoinPurseUI.G1 = 1;
        walletOfflineCoinPurseUI.H1.c();
    }
}
