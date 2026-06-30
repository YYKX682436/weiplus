package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178112b;

    public c0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, android.app.Dialog dialog) {
        this.f178112b = walletLqtBalanceAutoTransferUI;
        this.f178111a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "close back: %s, %s, %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70615a));
        android.app.Dialog dialog = this.f178111a;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178112b;
        if (i17 != 0 || fVar.f70616b != 0) {
            walletLqtBalanceAutoTransferUI.f177933d.setCheck(true);
            com.tencent.mm.wallet_core.ui.r1.K(walletLqtBalanceAutoTransferUI.getContext(), fVar.f70617c);
            return null;
        }
        if (((r45.w40) fVar.f70618d).f388870d == 0) {
            walletLqtBalanceAutoTransferUI.f177933d.setCheck(false);
            walletLqtBalanceAutoTransferUI.U6();
            return null;
        }
        walletLqtBalanceAutoTransferUI.f177933d.setCheck(true);
        com.tencent.mm.wallet_core.ui.r1.M(walletLqtBalanceAutoTransferUI.getContext(), ((r45.w40) fVar.f70618d).f388871e);
        return null;
    }
}
