package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class o7 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178309b;

    public o7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f178309b = walletLqtSaveFetchUI;
        this.f178308a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        r45.kd kdVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch");
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178309b;
        walletLqtSaveFetchUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "beginSlowRedeemProcess()");
        int i76 = walletLqtSaveFetchUI.i7(walletLqtSaveFetchUI.f178056h.getText(), "100");
        if (i76 > 0) {
            walletLqtSaveFetchUI.hideWcKb();
            if (walletLqtSaveFetchUI.S == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (!walletLqtSaveFetchUI.q7(com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.f177684m)) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletLqtSaveFetchUI.U;
                    if (bankcard == null || bankcard.v0()) {
                        kdVar = null;
                    } else {
                        kdVar = new r45.kd();
                        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletLqtSaveFetchUI.U;
                        kdVar.f378596f = bankcard2.field_bankName;
                        kdVar.f378595e = bankcard2.field_bankcardType;
                        kdVar.f378594d = bankcard2.field_bindSerial;
                        kdVar.f378597g = bankcard2.field_bankcardTail;
                    }
                    com.tencent.mm.plugin.wallet.balance.model.lqt.x2 x2Var = walletLqtSaveFetchUI.f178054f.f177620c;
                    int i18 = walletLqtSaveFetchUI.Z;
                    x2Var.getClass();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i76);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                    km5.q qVar = new km5.q();
                    qVar.y(valueOf, valueOf2, 1, kdVar);
                    qVar.n(x2Var);
                    ((km5.q) qVar.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.u7(walletLqtSaveFetchUI, i76))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t7(walletLqtSaveFetchUI));
                }
            }
        }
        this.f178308a.B();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 6);
    }
}
