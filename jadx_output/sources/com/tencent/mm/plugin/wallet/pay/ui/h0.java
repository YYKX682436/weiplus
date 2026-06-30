package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class h0 implements et4.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178767a;

    public h0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178767a = walletPayUI;
    }

    @Override // et4.g0
    public void a() {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178767a;
        com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "click add new bankcard");
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(walletPayUI.getContext(), a17.f13902b, walletPayUI.getString(com.tencent.mm.R.string.f490573yv));
            return;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 14, "");
        walletPayUI.K.dismiss();
        walletPayUI.K = null;
        walletPayUI.Z6();
    }

    @Override // et4.g0
    public void b(java.lang.String str, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178767a;
        if (walletPayUI.B1) {
            com.tencent.mars.xlog.Log.w(walletPayUI.f178712d, "has received canceled");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        walletPayUI.setAuthState(true);
        walletPayUI.hideVKB();
        walletPayUI.f178720n = favorPayInfo;
        walletPayUI.f178719m = bankcard;
        java.lang.String str2 = walletPayUI.f178712d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = favorPayInfo == null ? "" : favorPayInfo.toString();
        com.tencent.mars.xlog.Log.i(str2, "WalletPwdDialog showAlert with favinfo %s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = walletPayUI.f178729u;
            com.tencent.mm.wallet_core.model.a2.a(payInfo2 == null ? 0 : payInfo2.f192109e, payInfo2 == null ? "" : payInfo2.f192114m, 9, "");
        }
        walletPayUI.f178716h = str;
        walletPayUI.c7(false);
        com.tencent.mm.plugin.wallet_core.utils.b1.e();
    }

    @Override // et4.g0
    public void onCancel() {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178767a;
        com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "cashier dialog canceled");
        walletPayUI.B1 = true;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 10, "");
        if (walletPayUI.isTransparent()) {
            walletPayUI.finish();
        }
    }
}
