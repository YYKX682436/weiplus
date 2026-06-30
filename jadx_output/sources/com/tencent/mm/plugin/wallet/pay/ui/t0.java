package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178809e;

    public t0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, int i17) {
        this.f178809e = walletPayUI;
        this.f178808d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178809e;
        if (walletPayUI.getProcess() != null) {
            com.tencent.mm.wallet_core.a.c(walletPayUI.getContext(), walletPayUI.getInput(), this.f178808d);
        }
        if (walletPayUI.isTransparent()) {
            walletPayUI.finish();
        }
    }
}
