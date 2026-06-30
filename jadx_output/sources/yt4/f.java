package yt4;

/* loaded from: classes9.dex */
public abstract class f extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (activity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI.class, null, i17);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f213801c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.makeText(activity, com.tencent.mm.R.string.kst, 0).show();
        } else {
            db5.t7.makeText(activity, com.tencent.mm.R.string.klj, 0).show();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayUBaseChangePwdProcess", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j(activity, "mall", ".ui.MallIndexUIv2");
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI.class, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI) {
            return new yt4.e(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
