package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g7 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI f180289a;

    public g7(com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI) {
        this.f180289a = walletPwdConfirmUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = this.f180289a;
        if (!z17) {
            walletPwdConfirmUI.f180076e.setEnabled(z17);
            walletPwdConfirmUI.f180076e.setClickable(z17);
            return;
        }
        java.lang.String string = walletPwdConfirmUI.getInput().getString("key_new_pwd1");
        java.lang.String md5Value = walletPwdConfirmUI.f180075d.getMd5Value();
        if (string == null || !string.equals(md5Value)) {
            com.tencent.mm.wallet_core.a.b(walletPwdConfirmUI, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR);
        } else {
            walletPwdConfirmUI.f180076e.setEnabled(z17);
            walletPwdConfirmUI.f180076e.setClickable(z17);
        }
    }
}
