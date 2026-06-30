package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181179d;

    public k(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181179d = walletBrandUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181179d;
        r1Var.d(walletBrandUI.f181085g);
        walletBrandUI.finish();
    }
}
