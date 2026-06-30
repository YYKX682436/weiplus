package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class n0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178789d;

    public n0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178789d = walletPayUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178789d;
        if (walletPayUI.isTransparent()) {
            walletPayUI.finish();
        }
    }
}
