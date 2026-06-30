package qr4;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.model.i1.b(14);
        if (!(activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI)) {
            B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.class, bundle);
        } else if (!vr4.f1.wi().Ai().w()) {
            this.f213801c.putInt("key_pay_flag", 1);
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
        } else if (((com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f213801c.getParcelable("key_bankcard")) != null) {
            this.f213801c.putInt("key_pay_flag", 3);
            this.f213801c.putString("key_pwd_cash_title", activity.getString(com.tencent.mm.R.string.ket));
            com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) this.f213801c.getParcelable("key_orders");
            if (orders != null) {
                this.f213801c.putString("key_pwd_cash_money", com.tencent.mm.wallet_core.ui.r1.m(orders.f179678h));
            }
            B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI.class, bundle);
        } else {
            this.f213801c.putInt("key_pay_flag", 2);
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, null, i17);
        } else if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI) {
            com.tencent.mm.wallet_core.model.i1.a();
            f(activity, this.f213801c);
        } else {
            com.tencent.mm.wallet_core.model.i1.a();
            m(activity);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "BalanceFetchProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f213801c.getInt("key_balance_fetch_scene", 0) == 0) {
            i(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.class, -1, true);
        } else {
            i(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.class, -1, false);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI) {
            if (!vr4.f1.wi().Ai().w()) {
                this.f213801c.putInt("key_pay_flag", 1);
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
                return;
            } else {
                if (((com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f213801c.getParcelable("key_bankcard")) == null) {
                    this.f213801c.putInt("key_pay_flag", 2);
                    B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
                    return;
                }
                this.f213801c.putInt("key_pay_flag", 3);
                this.f213801c.putString("key_pwd_cash_title", activity.getString(com.tencent.mm.R.string.ket));
                com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) this.f213801c.getParcelable("key_orders");
                if (orders != null) {
                    this.f213801c.putString("key_pwd_cash_money", com.tencent.mm.wallet_core.ui.r1.m(orders.f179678h));
                }
                B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI) {
            if (bundle.getBoolean("key_need_verify_sms", false)) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI)) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            if (vr4.f1.wi().Ai().w()) {
                B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI) {
            return new qr4.b(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI) {
            return new qr4.c(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) {
            return new qr4.d(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new qr4.e(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI) {
            return new qr4.f(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new qr4.g(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.kep;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
