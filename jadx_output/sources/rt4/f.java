package rt4;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "PayUBindProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f213801c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.makeText(activity, com.tencent.mm.R.string.kst, 0).show();
            i(activity, com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI.class, -1, false);
        } else {
            db5.t7.makeText(activity, com.tencent.mm.R.string.klj, 0).show();
            i(activity, com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI.class, 0, false);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI) {
            B(activity, com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.class, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI) {
            return new rt4.d(this, mMActivity, b0Var, this.f213801c);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI) {
            return new rt4.e(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
