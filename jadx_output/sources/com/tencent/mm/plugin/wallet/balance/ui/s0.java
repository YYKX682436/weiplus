package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class s0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.c1 f178501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI, com.tencent.mm.plugin.wallet.balance.ui.c1 c1Var) {
        super(false);
        this.f178502e = walletBalanceManagerUI;
        this.f178501d = c1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.ui.c1 c1Var = this.f178501d;
        int i17 = c1Var.f177872a;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178502e;
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c1Var.f177873b);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(walletBalanceManagerUI.getContext(), intent);
        } else if (i17 == 2) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = c1Var.f177874c;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            nxVar.f7467b = c1Var.f177875d;
            nxVar.f7469d = 1034;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "unknown entrance type");
        } else if (c1Var.f177873b.equals("wxpay://lqp/balanceQuotaState")) {
            j45.l.j(walletBalanceManagerUI.getContext(), "wallet_ecard", ".ui.WalletECardLogoutUI", new android.content.Intent(), null);
        }
        com.tencent.mm.wallet_core.ui.r1.q0(46, 1);
    }
}
