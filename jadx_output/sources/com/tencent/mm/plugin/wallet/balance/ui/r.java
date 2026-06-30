package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178498d;

    public r(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f178498d = walletBalanceFetchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16398, this.f178498d.L, 4, "", "");
    }
}
