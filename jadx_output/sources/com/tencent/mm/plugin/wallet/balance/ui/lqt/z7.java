package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class z7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.c70 f178473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178475c;

    public z7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.c70 c70Var, int i17) {
        this.f178475c = walletLqtSaveFetchUI;
        this.f178473a = c70Var;
        this.f178474b = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        r45.c70 c70Var = this.f178473a;
        int i17 = c70Var.f371345f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178475c;
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(walletLqtSaveFetchUI.getContext(), c70Var.f371346g, true);
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(c70Var.f371347h, c70Var.f371346g, 0, 1000);
        } else {
            if (i17 != 4) {
                return;
            }
            new com.tencent.mm.plugin.wallet.balance.model.lqt.g(com.tencent.mm.wallet_core.ui.r1.j0(walletLqtSaveFetchUI.f178077y1 + "", "100"), this.f178474b).l().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.y7(this));
        }
    }
}
