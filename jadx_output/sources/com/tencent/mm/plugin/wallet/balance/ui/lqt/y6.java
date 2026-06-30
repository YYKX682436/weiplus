package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class y6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.na5 f178456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178459e;

    public y6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, r45.na5 na5Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, long j17) {
        this.f178459e = walletLqtSaveFetchUI;
        this.f178455a = z2Var;
        this.f178456b = na5Var;
        this.f178457c = g0Var;
        this.f178458d = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178459e;
        walletLqtSaveFetchUI.f178074x1 = false;
        r45.na5 na5Var = this.f178456b;
        r45.bq bqVar = na5Var.f381204i;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f178455a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.W6(walletLqtSaveFetchUI, z2Var, bqVar);
        if (this.f178457c.f177636b == 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 32, java.lang.Long.valueOf(this.f178458d));
            walletLqtSaveFetchUI.f178058l1 = true;
            walletLqtSaveFetchUI.V = true;
            z2Var.B();
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.X6(walletLqtSaveFetchUI, na5Var, 2, na5Var.f381204i);
    }
}
