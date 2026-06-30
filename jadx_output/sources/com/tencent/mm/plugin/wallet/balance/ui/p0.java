package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class p0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        super(false);
        this.f178491d = walletBalanceManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "click action entry");
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178491d;
        at4.s sVar = walletBalanceManagerUI.f177814r;
        int i17 = sVar.f13942b;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.wallet_core.ui.r1.X(walletBalanceManagerUI.getContext(), walletBalanceManagerUI.f177814r.f13944d, true);
                return;
            } else if (i17 == 3) {
                com.tencent.mm.wallet_core.ui.r1.b0(sVar.f13945e, sVar.f13946f, 0, 1061);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletBalanceManagerUI", "unknown type: %s", java.lang.Integer.valueOf(i17));
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(sVar.f13943c)) {
            return;
        }
        if (walletBalanceManagerUI.f177814r.f13943c.startsWith("weixin://wcpay/lqt/detail")) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(walletBalanceManagerUI.f177814r.f13943c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_account_type", 1);
            if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(walletBalanceManagerUI.getContext())) {
                return;
            }
            j45.l.j(walletBalanceManagerUI.getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, null);
            return;
        }
        if (walletBalanceManagerUI.f177814r.f13943c.startsWith("weixin://wcpay/lqt/save")) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(walletBalanceManagerUI.f177814r.f13943c);
            java.lang.String a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(walletBalanceManagerUI.f177814r.f13943c);
            new com.tencent.mm.plugin.wallet.balance.model.lqt.z().l().h(new com.tencent.mm.plugin.wallet.balance.ui.o0(this, com.tencent.mm.wallet_core.ui.b2.e(walletBalanceManagerUI.getContext(), false, false, null), a17));
        }
    }
}
