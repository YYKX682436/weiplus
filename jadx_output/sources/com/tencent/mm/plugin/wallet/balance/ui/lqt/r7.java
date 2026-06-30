package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class r7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.if0 f178359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178360b;

    public r7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.if0 if0Var) {
        this.f178360b = walletLqtSaveFetchUI;
        this.f178359a = if0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.X(this.f178360b.getContext(), this.f178359a.f376983f, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 7);
    }
}
