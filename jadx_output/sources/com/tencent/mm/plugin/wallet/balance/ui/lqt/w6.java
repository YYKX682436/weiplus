package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class w6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.na5 f178426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178428c;

    public w6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.na5 na5Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f178428c = walletLqtSaveFetchUI;
        this.f178426a = na5Var;
        this.f178427b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178428c;
        walletLqtSaveFetchUI.f178074x1 = false;
        r45.na5 na5Var = this.f178426a;
        r45.bq bqVar = na5Var.f381203h;
        if (bqVar == null) {
            bqVar = na5Var.f381204i;
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.W6(walletLqtSaveFetchUI, this.f178427b, bqVar);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.X6(walletLqtSaveFetchUI, na5Var, 1, bqVar);
    }
}
