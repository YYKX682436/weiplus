package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class d1 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI f178986a;

    public d1(com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI walletLockCheckPwdUI) {
        this.f178986a = walletLockCheckPwdUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI walletLockCheckPwdUI;
        java.lang.String str;
        if (!z17 || (str = (walletLockCheckPwdUI = this.f178986a).f178911m) == null) {
            return;
        }
        if (str.equals("action.close_wallet_lock")) {
            walletLockCheckPwdUI.getClass();
            walletLockCheckPwdUI.doSceneForceProgress(new gs4.e(walletLockCheckPwdUI.f178906e.getText()));
            return;
        }
        if (walletLockCheckPwdUI.f178911m.equals("action.verify_paypwd")) {
            int i17 = walletLockCheckPwdUI.f178910i;
            if (i17 == 1) {
                r1 = 6;
            } else if (i17 != 2) {
                r1 = -1;
            }
            walletLockCheckPwdUI.f178907f = new ss4.x(walletLockCheckPwdUI.f178906e.getText(), r1, walletLockCheckPwdUI.getPayReqKey());
            walletLockCheckPwdUI.doSceneForceProgress(walletLockCheckPwdUI.f178907f);
            return;
        }
        if (walletLockCheckPwdUI.f178911m.equals("action.touchlock_verify_by_paypwd")) {
            walletLockCheckPwdUI.doSceneForceProgress(new gs4.v(walletLockCheckPwdUI.f178906e.getText()));
        } else if (walletLockCheckPwdUI.f178911m.equals("action.touchlock_need_verify_paypwd")) {
            walletLockCheckPwdUI.f178907f = new ss4.x(walletLockCheckPwdUI.f178906e.getText(), walletLockCheckPwdUI.f178910i != 2 ? -1 : 8, walletLockCheckPwdUI.getPayReqKey());
            walletLockCheckPwdUI.doSceneForceProgress(walletLockCheckPwdUI.f178907f);
        }
    }
}
