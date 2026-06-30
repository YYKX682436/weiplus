package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178776d;

    public k0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178776d = walletPayUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178776d;
        java.lang.String str = walletPayUI.f178712d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "WalletPwdDialog event2 %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletPayUI).mPayResultType = 4;
        walletPayUI.B1 = true;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 10, "");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        walletPayUI.f178716h = null;
        walletPayUI.K = null;
        if (walletPayUI.isTransparent()) {
            walletPayUI.finish();
        }
        walletPayUI.L = null;
    }
}
