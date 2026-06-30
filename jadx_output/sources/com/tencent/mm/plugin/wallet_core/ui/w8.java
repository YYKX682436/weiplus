package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w8 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI f180772a;

    public w8(com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI) {
        this.f180772a = walletSetPasswordUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI = this.f180772a;
            java.lang.String md5Value = walletSetPasswordUI.f180096d.getMd5Value();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_new_pwd1", md5Value);
            walletSetPasswordUI.f180096d.a();
            com.tencent.mm.wallet_core.a.d(walletSetPasswordUI, bundle);
        }
    }
}
