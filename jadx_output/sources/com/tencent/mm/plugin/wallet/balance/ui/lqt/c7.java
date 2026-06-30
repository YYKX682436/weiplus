package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class c7 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.na5 f178122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.g0 f178124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178125h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, r45.na5 na5Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var2) {
        super(false);
        this.f178125h = walletLqtSaveFetchUI;
        this.f178121d = z2Var;
        this.f178122e = na5Var;
        this.f178123f = g0Var;
        this.f178124g = g0Var2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f178121d.B();
        if (this.f178122e.f381201f == 2) {
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178125h;
            com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var = this.f178123f;
            com.tencent.mm.ui.widget.dialog.z2 o76 = walletLqtSaveFetchUI.o7(null, g0Var, this.f178124g);
            walletLqtSaveFetchUI.b7(o76, g0Var);
            o76.C();
        }
    }
}
