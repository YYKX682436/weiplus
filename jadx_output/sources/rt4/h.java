package rt4;

/* loaded from: classes9.dex */
public class h extends sr4.b {
    @Override // sr4.b
    public void F(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardDetailUI.class, bundle);
    }

    @Override // sr4.b, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f213801c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.makeText(activity, com.tencent.mm.R.string.kst, 0).show();
        } else {
            db5.t7.makeText(activity, com.tencent.mm.R.string.klj, 0).show();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayUUnbindProcess", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j(activity, "mall", ".ui.MallIndexUIv2");
    }

    @Override // sr4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI) {
            B(activity, com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI) {
            f(activity, bundle);
        }
    }

    @Override // sr4.b, com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        return mMActivity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI ? new rt4.g(this, mMActivity, b0Var) : super.p(mMActivity, b0Var);
    }

    @Override // sr4.b, com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
