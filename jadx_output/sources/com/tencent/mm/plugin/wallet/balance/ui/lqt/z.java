package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class z implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f178461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178462b;

    public z(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f178462b = walletLqtBalanceAutoTransferUI;
        this.f178461a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f178461a;
        c0Var.d();
        if (!z17 || c0Var.b() < 0) {
            return;
        }
        int b17 = c0Var.b();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178462b;
        if (b17 < walletLqtBalanceAutoTransferUI.f177943q.f384696f.size()) {
            walletLqtBalanceAutoTransferUI.f177941o = c0Var.b();
            walletLqtBalanceAutoTransferUI.f177942p = (r45.dm6) walletLqtBalanceAutoTransferUI.f177943q.f384696f.get(walletLqtBalanceAutoTransferUI.f177941o);
            walletLqtBalanceAutoTransferUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do modify time");
            new com.tencent.mm.plugin.wallet.balance.model.lqt.c(walletLqtBalanceAutoTransferUI.f177942p).l().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.d0(walletLqtBalanceAutoTransferUI, com.tencent.mm.wallet_core.ui.b2.e(walletLqtBalanceAutoTransferUI.getContext(), false, false, null)));
        }
    }
}
