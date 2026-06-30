package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes8.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI f177882d;

    public e(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI walletBalanceFetchResultUI) {
        this.f177882d = walletBalanceFetchResultUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI walletBalanceFetchResultUI = this.f177882d;
        walletBalanceFetchResultUI.getProcess().o(walletBalanceFetchResultUI, 0, walletBalanceFetchResultUI.getInput());
    }
}
