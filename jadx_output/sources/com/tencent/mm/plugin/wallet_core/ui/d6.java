package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        super(false);
        this.f180238d = walletOrderInfoNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        a36.c cVar;
        a36.c cVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "click card mch subscribe");
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180238d;
        if (walletOrderInfoNewUI.P1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "do uncheck mch service pos");
            if (walletOrderInfoNewUI.Y1 != null || (cVar2 = walletOrderInfoNewUI.M1) == null || cVar2.f1115r == null) {
                return;
            }
            walletOrderInfoNewUI.G1.setVisibility(0);
            walletOrderInfoNewUI.E1.setVisibility(8);
            walletOrderInfoNewUI.O1 = 0;
            ss4.c cVar3 = new ss4.c(walletOrderInfoNewUI.M1.f1115r.f1121i);
            walletOrderInfoNewUI.Y1 = cVar3;
            cVar3.l().h(new com.tencent.mm.plugin.wallet_core.ui.u5(walletOrderInfoNewUI));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "do check mch service pos");
        if (walletOrderInfoNewUI.X1 != null || (cVar = walletOrderInfoNewUI.M1) == null || cVar.f1115r == null) {
            return;
        }
        walletOrderInfoNewUI.G1.setVisibility(0);
        walletOrderInfoNewUI.E1.setVisibility(8);
        walletOrderInfoNewUI.O1 = 1;
        ss4.a aVar = new ss4.a(walletOrderInfoNewUI.M1.f1115r.f1121i);
        walletOrderInfoNewUI.X1 = aVar;
        aVar.l().h(new com.tencent.mm.plugin.wallet_core.ui.t5(walletOrderInfoNewUI));
    }
}
