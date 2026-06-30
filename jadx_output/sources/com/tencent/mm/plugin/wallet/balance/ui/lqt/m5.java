package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class m5 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.c70 f178272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178273b;

    public m5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.c70 c70Var) {
        this.f178273b = walletLqtSaveFetchUI;
        this.f178272a = c70Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 26);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178273b;
        walletLqtSaveFetchUI.f178054f.f177622e.b(1, 0);
        r45.c70 c70Var = this.f178272a;
        int i17 = c70Var.f371345f;
        if (i17 == 1) {
            walletLqtSaveFetchUI.m7(null, 1);
        } else if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(walletLqtSaveFetchUI.getContext(), c70Var.f371346g, true);
        } else {
            if (i17 != 3) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.b0(c70Var.f371347h, c70Var.f371346g, 0, 1000);
        }
    }
}
