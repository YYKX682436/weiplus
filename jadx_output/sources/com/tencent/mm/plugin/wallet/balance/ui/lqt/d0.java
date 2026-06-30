package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178130b;

    public d0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, android.app.Dialog dialog) {
        this.f178130b = walletLqtBalanceAutoTransferUI;
        this.f178129a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "modify back: %s, %s, %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70615a));
        android.app.Dialog dialog = this.f178129a;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178130b;
        if (i17 != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletLqtBalanceAutoTransferUI.getContext(), fVar.f70617c);
            return null;
        }
        if (((r45.wp4) fVar.f70618d).f389375d != 0) {
            com.tencent.mm.wallet_core.ui.r1.M(walletLqtBalanceAutoTransferUI.getContext(), ((r45.wp4) fVar.f70618d).f389376e);
            return null;
        }
        r45.dm6 dm6Var = walletLqtBalanceAutoTransferUI.f177942p;
        walletLqtBalanceAutoTransferUI.getClass();
        if (dm6Var != null) {
            walletLqtBalanceAutoTransferUI.f177936g.setText(walletLqtBalanceAutoTransferUI.V6(dm6Var, com.tencent.mm.R.string.kop));
            return null;
        }
        walletLqtBalanceAutoTransferUI.f177936g.setText("");
        return null;
    }
}
