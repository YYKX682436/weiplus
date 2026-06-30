package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178500d;

    public s(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f178500d = walletBalanceFetchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f178500d;
        intent.putExtra("rawUrl", walletBalanceFetchUI.getString(com.tencent.mm.R.string.klr));
        intent.putExtra("showShare", false);
        com.tencent.mm.wallet_core.ui.r1.T(walletBalanceFetchUI.getContext(), intent);
        dialogInterface.dismiss();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16398, walletBalanceFetchUI.L, 3, "", "");
    }
}
