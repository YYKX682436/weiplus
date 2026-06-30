package qs4;

/* loaded from: classes9.dex */
public abstract class b extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            bundle.putBoolean("key_is_bind_reg_process", true);
        }
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        a("back", activity, java.lang.Integer.valueOf(i17));
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, null, i17);
        } else {
            m(activity);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        a("forward", activity, java.lang.Integer.valueOf(i17), bundle);
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI)) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.kn6;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean w(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, java.lang.String str) {
        if (i17 != 404) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
        db5.e1.E(walletBaseUI, str, null, walletBaseUI.getString(com.tencent.mm.R.string.kgx), false, new qs4.a(this, walletBaseUI));
        return true;
    }
}
