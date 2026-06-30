package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI f177862d;

    public a(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI walletBalanceFetchPwdInputUI) {
        this.f177862d = walletBalanceFetchPwdInputUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f177862d.finish();
    }
}
