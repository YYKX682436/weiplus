package kt4;

/* loaded from: classes9.dex */
public class r extends com.tencent.mm.wallet_core.h {
    public static java.lang.String F(kt4.r rVar) {
        java.lang.String string = rVar.f213801c.getString("key_ecard_type");
        return com.tencent.mm.sdk.platformtools.t8.K0(string) ? "WEB_DEBIT" : string;
    }

    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI.class, bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "start open ecard: %s", java.lang.Integer.valueOf(G()));
        return this;
    }

    public final int G() {
        return this.f213801c.getInt("key_open_scene");
    }

    public final java.lang.String H() {
        return this.f213801c.getString("key_req_serial");
    }

    public final void I(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.OpenECardProcess", "gotoFinishUI, openScene: %s", java.lang.Integer.valueOf(G()));
        if (G() != 3) {
            B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI.class, null);
            return;
        }
        bundle.putInt("key_open_scene", 3);
        bundle.putString("key_open_extra_data", this.f213801c.getString("key_open_extra_data", ""));
        B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI.class, bundle);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (i17 != 100) {
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
                if (this.f213801c.getInt("key_select_card_action") == 1) {
                    d(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.class, null, 0);
                    return;
                } else {
                    d(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI.class, null, 0);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "back to card list");
        int G = G();
        java.lang.String H = H();
        java.lang.String str = (java.lang.String) this.f213801c.get("key_pwd1");
        this.f213801c.clear();
        this.f213801c.putInt("key_open_scene", G);
        this.f213801c.putString("key_req_serial", H);
        this.f213801c.putString("key_pwd1", str);
        d(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.class, null, 0);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "OpenECardProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "end process: %s", activity);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI.class);
        intent.putExtras(bundle);
        h(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI.class, bundle.containsKey("key_process_result_code") ? bundle.getInt("key_process_result_code", 0) : 0, intent, true);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            if (!bundle.getBoolean("key_is_reuse_existing_ecard", false)) {
                B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.class, null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "forward, is reuse exist card");
            this.f213801c.putBoolean("key_is_reuse_existing_ecard", true);
            B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI.class, bundle);
            activity.finish();
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI) {
            if (this.f213801c.getInt("key_select_card_action", 1) != 1) {
                B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI.class, null);
                return;
            } else if (!bundle.getBoolean("key_need_verify_sms")) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            I(activity, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI) {
            boolean z17 = bundle.getBoolean("key_check_other_card_need_input_card_elem", false);
            boolean z18 = bundle.getBoolean("key_need_verify_sms");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "input card elem: %s, verify sms: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            if (z17) {
                B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI.class, null);
                return;
            } else if (!z18) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI) {
            if (!bundle.getBoolean("key_need_verify_sms")) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI) {
            boolean z19 = bundle.getBoolean("key_is_token_invalid", false);
            this.f213801c.putBoolean("key_is_token_invalid", z19);
            java.lang.String string = this.f213801c.getString("key_open_token");
            int G = G();
            int i18 = bundle.getInt("key_ecard_proxy_action", 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "forward openScene: %s, token==null: %s, isTokenInvalid: %s, action: %s", java.lang.Integer.valueOf(G), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(string)), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i18));
            if (i18 != 1) {
                if (!bundle.getBoolean("key_need_verify_sms")) {
                    I(activity, bundle);
                    return;
                } else {
                    bundle.putBoolean("key_need_confirm_finish", true);
                    C(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, null, bundle);
                    return;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                E(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle, 1);
            } else if (z19) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
            } else if (G == 3) {
                B(activity, com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.class, null);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new kt4.e(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new kt4.q(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI) {
            return new kt4.n(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI) {
            return new kt4.b(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI) {
            return new kt4.o(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI) {
            return new kt4.j(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI) {
            return new kt4.p(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean v(android.app.Activity activity, android.os.Bundle bundle) {
        bundle.putInt("key_process_result_code", 0);
        return false;
    }
}
