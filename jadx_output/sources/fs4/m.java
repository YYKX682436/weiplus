package fs4;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, null, i17);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "ResetPwdProcessByToken";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI.class);
        intent.putExtra("RESET_PWD_USER_ACTION", bundle.getInt("RESET_PWD_USER_ACTION", 0));
        h(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI.class, -1, intent, false);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new fs4.i(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new fs4.k(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.kzn;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean w(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, java.lang.String str) {
        if (i17 != 404) {
            return false;
        }
        db5.e1.E(walletBaseUI, str, null, walletBaseUI.getString(com.tencent.mm.R.string.kzn), false, new fs4.l(this, walletBaseUI));
        return true;
    }
}
