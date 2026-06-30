package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.x1 f178417d;

    public w1(com.tencent.mm.plugin.wallet.balance.ui.lqt.x1 x1Var) {
        this.f178417d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.x1 x1Var = this.f178417d;
        android.app.Dialog dialog = x1Var.f178432a.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = x1Var.f178432a;
        dp.a.makeText(walletLqtDetailUI, walletLqtDetailUI.getString(com.tencent.mm.R.string.koy), 1).show();
    }
}
