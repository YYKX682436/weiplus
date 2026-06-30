package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class c8 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI f178126a;

    public c8(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI walletLqtSimpleCheckPwdUI) {
        this.f178126a = walletLqtSimpleCheckPwdUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSimpleCheckPwdUI", "input isValid: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI walletLqtSimpleCheckPwdUI = this.f178126a;
            walletLqtSimpleCheckPwdUI.f178086g = new ss4.x(walletLqtSimpleCheckPwdUI.f178085f.getText(), 7, walletLqtSimpleCheckPwdUI.getPayReqKey());
            walletLqtSimpleCheckPwdUI.doSceneForceProgress(walletLqtSimpleCheckPwdUI.f178086g);
        }
    }
}
