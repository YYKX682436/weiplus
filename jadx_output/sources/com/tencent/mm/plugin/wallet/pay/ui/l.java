package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI f178780d;

    public l(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI) {
        this.f178780d = walletChangeBankcardUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "WalletPwdDialog event2 %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI = this.f178780d;
        walletChangeBankcardUI.f178670y = true;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        walletChangeBankcardUI.f178665t = null;
        if (walletChangeBankcardUI.getContentView().getVisibility() != 0) {
            walletChangeBankcardUI.cancelQRPay();
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletChangeBankcardUI);
            if (g17 != null) {
                g17.f(walletChangeBankcardUI, walletChangeBankcardUI.getInput());
            } else {
                walletChangeBankcardUI.finish();
            }
        }
        walletChangeBankcardUI.f178668w = null;
    }
}
