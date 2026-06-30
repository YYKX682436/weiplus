package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class u0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.a1 f178513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI, at4.a1 a1Var) {
        super(false);
        this.f178514e = walletBalanceManagerUI;
        this.f178513d = a1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "click freeze layout");
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178514e;
        com.tencent.mm.wallet_core.ui.r1.X(walletBalanceManagerUI.getContext(), this.f178513d.f13803e, true);
        at4.a1.c("");
        walletBalanceManagerUI.f177816t.setVisibility(8);
    }
}
