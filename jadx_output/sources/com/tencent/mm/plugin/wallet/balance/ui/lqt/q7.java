package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class q7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.if0 f178343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178345c;

    public q7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.if0 if0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f178345c = walletLqtSaveFetchUI;
        this.f178343a = if0Var;
        this.f178344b = z2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.W(this.f178345c.getContext(), this.f178343a.f376983f, true, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 7);
        this.f178344b.B();
    }
}
