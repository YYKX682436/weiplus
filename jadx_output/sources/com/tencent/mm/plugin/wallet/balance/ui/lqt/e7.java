package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.c70 f178161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178162c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178165f;

    public e7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i17, r45.c70 c70Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var2, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f178165f = walletLqtSaveFetchUI;
        this.f178160a = i17;
        this.f178161b = c70Var;
        this.f178162c = g0Var;
        this.f178163d = g0Var2;
        this.f178164e = z2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        int i17 = this.f178160a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        r45.c70 c70Var = this.f178161b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showCommonPromptText, scene: %s, promptInfo.jump_type: %s", valueOf, java.lang.Integer.valueOf(c70Var.f371345f));
        if (i17 >= 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, java.lang.Integer.valueOf(i17));
        }
        int i18 = c70Var.f371345f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178165f;
        if (i18 != 1) {
            if (i18 == 2) {
                com.tencent.mm.wallet_core.ui.r1.V(walletLqtSaveFetchUI.getContext(), c70Var.f371346g, true);
                return;
            } else {
                if (i18 != 3) {
                    return;
                }
                com.tencent.mm.wallet_core.ui.r1.b0(c70Var.f371347h, c70Var.f371346g, 0, 1000);
                return;
            }
        }
        int i19 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var = this.f178162c;
        com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var2 = this.f178163d;
        com.tencent.mm.ui.widget.dialog.z2 o76 = walletLqtSaveFetchUI.o7(g0Var, g0Var2, null);
        walletLqtSaveFetchUI.b7(o76, g0Var2);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f178164e;
        if (z2Var != null) {
            z2Var.B();
        }
        if (o76 == null || o76.h()) {
            return;
        }
        o76.C();
    }
}
