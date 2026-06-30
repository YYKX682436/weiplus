package qs4;

/* loaded from: classes9.dex */
public class j extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public qs4.i f366420d;

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            boolean z17 = bundle.getBoolean("key_bind_card_can_pass_pwd", false);
            java.lang.String string = bundle.getString("key_bind_card_user_token", null);
            if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
            }
            return this;
        }
        if (bundle != null) {
            com.tencent.mm.plugin.wallet_core.utils.b1.b(activity, bundle.getInt("key_bind_scene", 0), 1);
        }
        if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
            super.A(activity, bundle);
            return this;
        }
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.class, bundle);
        return this;
    }

    public void F(np5.b0 b0Var) {
        b0Var.d(new ys4.l(this.f213801c.getString("key_country_code", ""), this.f213801c.getString("key_province_code", ""), this.f213801c.getString("key_city_code", ""), (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) this.f213801c.getParcelable("key_profession"), this.f213801c.getString("key_country_iso")), false);
    }

    public int G() {
        return !r() ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 2 : 1 : ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 5 : 4;
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "BindCardProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.Class<?> cls;
        a("end", activity, bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
        com.tencent.mm.wallet_core.model.i1.a();
        n();
        boolean z17 = bundle.getBoolean("intent_bind_end", false);
        android.os.Bundle bundle2 = this.f213801c;
        if (bundle2 != null && bundle2.getBoolean("is_from_new_cashier", false)) {
            try {
                cls = java.lang.Class.forName(bundle2.getString("start_activity_class", ""));
            } catch (java.lang.Exception unused) {
                cls = null;
            }
            java.lang.Class<?> cls2 = cls;
            if (cls2 != null) {
                h(activity, cls2, -1, null, true);
                qs4.i iVar = this.f366420d;
                if (iVar != null) {
                    iVar.run(z17 ? -1 : 0);
                    return;
                }
                return;
            }
        }
        if (!bundle.getBoolean("key_need_bind_response", false)) {
            j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        k(activity, "wallet", ".bind.ui.WalletBindUI", -1, intent, false);
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        a("forward", activity, java.lang.Integer.valueOf(i17), bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            if (bundle.getBoolean("key_is_import_bind", false)) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
                return;
            }
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI)) {
            if (!r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            } else if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "bind bank card success!!");
                bundle.putBoolean("intent_bind_end", true);
                db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.kft));
                f(activity, bundle);
                return;
            }
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) && ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "end process after verify!");
            int i18 = this.f213801c.getInt("key_bind_scene", -1);
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = (com.tencent.mm.plugin.wallet_core.model.BindCardOrder) this.f213801c.getParcelable("key_bindcard_value_result");
            if (bindCardOrder == null || i18 != 15) {
                bundle.putBoolean("intent_bind_end", true);
                db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.kft));
                f(activity, bundle);
                return;
            }
            java.lang.String string = this.f213801c.getString("key_bind_card_type");
            java.lang.String string2 = this.f213801c.getString("key_bind_card_show1");
            java.lang.String string3 = this.f213801c.getString("key_bind_card_show2");
            int i19 = this.f213801c.getInt("key_bind_scene");
            int i27 = this.f213801c.getInt("realname_scene");
            com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string, string2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            bindCardOrder.f179614h = string;
            bindCardOrder.f179615i = string2;
            bindCardOrder.f179616m = string3;
            bindCardOrder.f179618o = i19;
            bindCardOrder.f179619p = i27;
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.class, bundle);
            return;
        }
        if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI)) {
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI) {
                f(activity, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "super forward!");
                super.o(activity, 0, bundle);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
        com.tencent.mm.plugin.wallet_core.utils.b1.b(activity, this.f213801c.getInt("key_bind_scene", 0), 7);
        bundle.putBoolean("intent_bind_end", true);
        db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.kft));
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder2 = (com.tencent.mm.plugin.wallet_core.model.BindCardOrder) this.f213801c.getParcelable("key_bindcard_value_result");
        int i28 = this.f213801c.getInt("key_bind_scene", -1);
        if (bindCardOrder2 == null || i28 != 15) {
            f(activity, bundle);
            return;
        }
        java.lang.String string4 = this.f213801c.getString("key_bind_card_type");
        java.lang.String string5 = this.f213801c.getString("key_bind_card_show1");
        java.lang.String string6 = this.f213801c.getString("key_bind_card_show2");
        int i29 = this.f213801c.getInt("key_bind_scene");
        int i37 = this.f213801c.getInt("realname_scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string4, string5, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        bindCardOrder2.f179614h = string4;
        bindCardOrder2.f179615i = string5;
        bindCardOrder2.f179616m = string6;
        bindCardOrder2.f179618o = i29;
        bindCardOrder2.f179619p = i37;
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.class, bundle);
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new qs4.c(this, mMActivity, b0Var);
        }
        if ((mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) || (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI)) {
            return new qs4.f(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new qs4.g(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new qs4.h(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) && r()) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) : activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
    }
}
