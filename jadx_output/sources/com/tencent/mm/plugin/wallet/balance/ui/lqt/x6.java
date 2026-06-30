package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class x6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.na5 f178440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178443e;

    public x6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, r45.na5 na5Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, long j17) {
        this.f178443e = walletLqtSaveFetchUI;
        this.f178439a = z2Var;
        this.f178440b = na5Var;
        this.f178441c = g0Var;
        this.f178442d = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178443e;
        walletLqtSaveFetchUI.f178074x1 = false;
        r45.na5 na5Var = this.f178440b;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.W6(walletLqtSaveFetchUI, this.f178439a, na5Var.f381203h);
        if (this.f178441c.f177636b == 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 31, java.lang.Long.valueOf(this.f178442d));
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.X6(walletLqtSaveFetchUI, na5Var, 1, na5Var.f381203h);
    }
}
