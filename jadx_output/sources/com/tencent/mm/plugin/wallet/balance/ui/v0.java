package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class v0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178519a;

    public v0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f178519a = walletBalanceManagerUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "errCode: %s, errType: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178519a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.v1 v1Var = ((r45.ja3) fVar.f70618d).f377677d;
            int i18 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.A;
            walletBalanceManagerUI.getClass();
            walletBalanceManagerUI.V6();
        }
        walletBalanceManagerUI.f177815s = null;
        return null;
    }
}
