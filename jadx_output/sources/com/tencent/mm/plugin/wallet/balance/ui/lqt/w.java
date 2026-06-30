package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        super(false);
        this.f178415d = walletLqtBalanceAutoTransferUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.f177932t;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178415d;
        walletLqtBalanceAutoTransferUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show time panel");
        r45.ra5 ra5Var = walletLqtBalanceAutoTransferUI.f177943q;
        if (ra5Var == null) {
            return;
        }
        int size = ra5Var.f384696f.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i18 = 0; i18 < size; i18++) {
            strArr[i18] = walletLqtBalanceAutoTransferUI.V6((r45.dm6) walletLqtBalanceAutoTransferUI.f177943q.f384696f.get(i18), com.tencent.mm.R.string.kop);
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(walletLqtBalanceAutoTransferUI.getContext(), strArr);
        c0Var.i(walletLqtBalanceAutoTransferUI.f177941o);
        c0Var.f212259t = new com.tencent.mm.plugin.wallet.balance.ui.lqt.z(walletLqtBalanceAutoTransferUI, c0Var);
        c0Var.l();
    }
}
