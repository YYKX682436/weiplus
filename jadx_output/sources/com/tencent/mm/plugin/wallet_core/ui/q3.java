package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q3 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI f180583a;

    public q3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI) {
        this.f180583a = walletCheckPwdNewUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCheckPwdNewUI", "input isValid: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = this.f180583a;
            walletCheckPwdNewUI.f179975d.a(walletCheckPwdNewUI.f179978g.getText());
        }
    }
}
