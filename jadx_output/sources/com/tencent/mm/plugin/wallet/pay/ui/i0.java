package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class i0 implements com.tencent.mm.plugin.wallet_core.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178770a;

    public i0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178770a = walletPayUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.m8
    public void a(java.lang.String str, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, boolean z17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178770a;
        if (walletPayUI.B1) {
            com.tencent.mars.xlog.Log.w(walletPayUI.f178712d, "has received canceled");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        walletPayUI.setAuthState(true);
        walletPayUI.hideVKB();
        walletPayUI.f178720n = favorPayInfo;
        java.lang.String str2 = walletPayUI.f178712d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = favorPayInfo == null ? "" : favorPayInfo.toString();
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i(str2, "WalletPwdDialog showAlert with favinfo %s isNeedChangeBankcard %s", objArr);
        if (walletPayUI.f178720n != null && z17) {
            walletPayUI.i7(-100, true);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
            com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 9, "");
        }
        walletPayUI.f178716h = str;
        walletPayUI.c7(false);
        com.tencent.mm.plugin.wallet_core.utils.b1.e();
        walletPayUI.L = null;
    }
}
