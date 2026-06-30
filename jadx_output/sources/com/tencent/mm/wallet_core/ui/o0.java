package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214211d;

    public o0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214211d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214211d;
        walletBaseUI.cancelQRPay();
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletBaseUI);
        walletBaseUI.mPayResultType = 4;
        if (g17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUI", "[onCreateDialog] onclick finish");
            walletBaseUI.finish();
        } else {
            if (g17.v(walletBaseUI, walletBaseUI.getInput())) {
                return;
            }
            g17.f(walletBaseUI, walletBaseUI.getInput());
        }
    }
}
