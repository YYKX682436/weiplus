package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class t1 implements rp5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179495a;

    public t1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179495a = wcPayRealnameVerifyCodeUI;
    }

    @Override // rp5.b
    public boolean a(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return false;
    }

    @Override // rp5.b
    public boolean b() {
        return false;
    }

    @Override // rp5.b
    public boolean c(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179495a;
        if (!"+86".equals(wcPayRealnameVerifyCodeUI.f179275o)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(wcPayRealnameVerifyCodeUI.f179275o) || com.tencent.mm.sdk.platformtools.t8.K0(wcPayRealnameVerifyCodeUI.f179267d.getText())) ? false : true;
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText == null) {
            return false;
        }
        return tenpaySecureEditText.isPhoneNum();
    }

    @Override // rp5.b
    public boolean d(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return false;
    }

    @Override // rp5.b
    public java.lang.String e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return null;
    }
}
