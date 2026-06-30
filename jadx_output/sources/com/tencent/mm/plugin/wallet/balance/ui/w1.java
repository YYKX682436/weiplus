package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class w1 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178526b;

    public w1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, android.app.Dialog dialog) {
        this.f178526b = walletBalanceSaveUI;
        this.f178525a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        android.app.Dialog dialog = this.f178525a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178526b;
            dp.a.makeText(walletBalanceSaveUI.getContext(), z17 ? obj.toString() : walletBalanceSaveUI.getString(com.tencent.mm.R.string.kpu), 1).show();
        }
    }
}
