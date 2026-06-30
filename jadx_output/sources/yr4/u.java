package yr4;

/* loaded from: classes9.dex */
public class u extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f465110d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public as4.b f465111e;

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info");
        bundle.putInt("key_pay_scene", payInfo.f192109e);
        bundle.putInt("key_pay_channel", payInfo.f192111g);
        if (F(activity, bundle)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PayProcess", "hy: has err. return");
            return this;
        }
        int i17 = bundle.getInt("key_pay_flag", 0);
        if ((i17 == 2 || i17 == 1) && payInfo.f192109e == 11) {
            com.tencent.mm.wallet_core.model.i1.b(13);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "start pay_flag : " + bundle.getInt("key_pay_flag", 0));
        int i18 = bundle.getInt("key_pay_flag", 0);
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "start Process : PayRegBindProcess");
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "start Process : PayBindProcess");
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        } else if (i18 == 3) {
            if (!bundle.getBoolean("key_need_verify_sms", false) || r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "jump to result ui!");
                G(activity, bundle);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "domestic and verify sms!");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
            }
        }
        return this;
    }

    public final boolean F(android.app.Activity activity, android.os.Bundle bundle) {
        int i17 = bundle.getInt("key_err_code", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "dealwithErr(), errCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == -1004) {
            this.f213801c.putInt("key_pay_flag", 3);
            this.f213801c.putInt("key_err_code", 0);
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, 0)).intValue();
            if (z65.c.a()) {
                intValue = 1;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) this.f213801c.getParcelable("key_orders");
            if (intValue == 1 || (orders != null && orders.A1 == 1)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("direc_change_bankcard", true);
                bundle2.putBoolean("send_cancel_event", false);
                d(activity, com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.class, bundle2, 0);
            } else {
                B(activity, com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.class, bundle);
            }
            return true;
        }
        if (i17 == -1003) {
            if (vr4.f1.wi().Ai().w()) {
                bundle.putInt("key_pay_flag", 2);
                bundle.putInt("key_err_code", 0);
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
            } else {
                bundle.putInt("key_pay_flag", 1);
                bundle.putInt("key_err_code", 0);
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
            }
            return true;
        }
        if (i17 != 402 && i17 != 403 && i17 != 408) {
            if (i17 == 417) {
                bundle.putInt("key_err_code", 0);
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI.class, bundle);
                return true;
            }
            if (i17 != 418) {
                return false;
            }
            bundle.putInt("key_err_code", 0);
            B(activity, com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI.class, bundle);
            return true;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f213801c.get("key_bankcard");
        if (bankcard == null || !bankcard.v0()) {
            B(activity, com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI.class, bundle);
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h() == null || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h().size() <= 0) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "hy: go to select bankcard ui");
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putBoolean("key_is_show_new_bankcard", true);
            bundle3.putInt("key_scene", 0);
            bundle3.putParcelableArrayList("key_showing_bankcards", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h());
            bundle3.putString("key_top_tips", activity.getString(com.tencent.mm.R.string.f493617kz5));
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.class, bundle3);
        }
        return true;
    }

    public final void G(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = this.f213801c;
        if (bundle2 != null && bundle2.containsKey("key_realname_guide_helper")) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putParcelable("key_realname_guide_helper", this.f213801c.getParcelable("key_realname_guide_helper"));
        }
        int i17 = bundle.getInt("key_pay_scene", 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "jumpToResultUI() payScene:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 11 || i17 == 21) {
            B(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI.class, bundle);
            return;
        }
        if (i17 == 5 || i17 == 31 || i17 == 32 || i17 == 33 || i17 == 48) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info");
            if (payInfo == null || payInfo.L != 1) {
                D(activity, "remittance", ".ui.RemittanceResultUI", bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "is busi f2f");
                f(activity, bundle);
                return;
            }
        }
        if (i17 == 37 || i17 == 39 || i17 == 42 || i17 == 45 || i17 == 52 || i17 == 49) {
            f(activity, bundle);
        } else if (i17 == 56) {
            D(activity, "remittance", ".mobile.ui.MobileRemitResultUI", bundle);
        } else {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI.class, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void b(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        ((java.util.ArrayList) this.f465110d).add(new java.lang.ref.WeakReference(walletBaseUI));
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "back pay_flag : " + this.f213801c.getInt("key_pay_flag", 0));
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, null, i17);
        } else {
            com.tencent.mm.wallet_core.model.i1.a();
            m(activity);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "PayProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "end pay_flag : " + this.f213801c.getInt("key_pay_flag", 0));
        com.tencent.mm.wallet_core.model.i1.a();
        int i17 = this.f213801c.getBoolean("intent_pay_end", false) ? -1 : 0;
        android.content.Intent intent = new android.content.Intent();
        if (bundle != null) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = (com.tencent.mm.pluginsdk.wallet.PayInfo) this.f213801c.getParcelable("key_pay_info");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("intent_pay_end_errcode", this.f213801c.getInt("intent_pay_end_errcode"));
            bundle2.putString("intent_pay_app_url", this.f213801c.getString("intent_pay_app_url"));
            bundle2.putBoolean("intent_pay_end", this.f213801c.getBoolean("intent_pay_end"));
            bundle2.putString("intent_wap_pay_jump_url", this.f213801c.getString("intent_wap_pay_jump_url"));
            bundle2.putParcelable("key_realname_guide_helper", this.f213801c.getParcelable("key_realname_guide_helper"));
            if (payInfo3 != null) {
                bundle2.putInt("pay_channel", payInfo3.f192111g);
            }
            intent.putExtras(bundle2);
        }
        intent.putExtra("key_orders", (com.tencent.mm.plugin.wallet_core.model.Orders) this.f213801c.getParcelable("key_orders"));
        intent.putExtra("key_is_clear_failure", this.f213801c.getInt("key_is_clear_failure", -1));
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
        am.s10 s10Var = walletPayResultEvent.f54965g;
        s10Var.f7861a = intent;
        android.os.Bundle bundle3 = this.f213801c;
        java.lang.String str = "";
        if (bundle3 != null && (payInfo2 = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle3.getParcelable("key_pay_info")) != null) {
            str = payInfo2.f192114m;
        }
        s10Var.f7864d = str;
        int i18 = this.f213801c.getBoolean("intent_pay_end", false) ? -1 : 0;
        s10Var.f7863c = i18;
        if (i18 == 0 && bundle != null && (payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info")) != null) {
            bs4.b.a(payInfo.f192114m, payInfo.f192109e, payInfo.f192111g);
        }
        walletPayResultEvent.e();
        k(activity, "wallet", ".pay.ui.WalletPayUI", i17, intent, false);
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (F(activity, bundle)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "deal with the err!");
            return;
        }
        boolean z17 = activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI;
        if (z17) {
            if (this.f213801c.getBoolean("key_forward_to_id_verify", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "go to verify id tail");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI.class, this.f213801c);
                return;
            }
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI) {
            G(activity, bundle);
        }
        int i18 = bundle.containsKey("key_pay_flag") ? bundle.getInt("key_pay_flag", 0) : this.f213801c.getInt("key_pay_flag", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "forward pay_flag : " + i18);
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "forwardUnreg()");
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
                return;
            }
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
                G(activity, bundle);
                return;
            }
            if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI)) {
                if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI) {
                    h(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.class, -1, null, true);
                    return;
                } else {
                    super.o(activity, 0, bundle);
                    return;
                }
            }
            if (r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "oversea, set pwd");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "domestic, verify code");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            }
        }
        if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "forwardBind()");
            if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI) || z17) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
                return;
            }
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
                G(activity, bundle);
                return;
            }
            if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI)) {
                if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI) {
                    h(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.class, -1, null, true);
                    return;
                } else {
                    super.o(activity, 0, bundle);
                    return;
                }
            }
            if (r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "oversea, jump to result ui!");
                G(activity, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "domestic, verify code!");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            }
        }
        if (i18 != 3) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "forwardBound()");
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            G(activity, bundle);
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI) || (activity instanceof com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI)) {
            if ((!bundle.getBoolean("key_need_verify_sms", false) || r()) && !bundle.getBoolean("key_is_changing_balance_phone_num")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "jump to result ui!");
                G(activity, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "need verify code after reset info or change bank card info!");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI) {
            h(activity, com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.class, -1, null, true);
        } else if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI) && !z17) {
            super.o(activity, 0, bundle);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "need verify code after select bank card!");
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI) {
            return new yr4.l(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new yr4.m(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI) {
            return new yr4.n(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) {
            return new yr4.o(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new yr4.p(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI) {
            return new yr4.q(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new yr4.r(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI) {
            return new yr4.s(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI) {
            return new yr4.b(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI) {
            return new yr4.c(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI) {
            return new yr4.d(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI) {
            return new yr4.e(this, (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.kvo;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        this.f213801c.getInt("key_pay_flag", 0);
        int i17 = this.f213801c.getInt("key_pay_flag", 0);
        if (i17 == 1 || i17 == 2) {
            return activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public boolean w(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "onReceiveErr(), errCode %d", java.lang.Integer.valueOf(i17));
        if (i17 != 408) {
            switch (i17) {
                case 402:
                case 403:
                    break;
                case 404:
                    com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "404 pay error, cancel pay or change!");
                    java.util.ArrayList h17 = vr4.f1.wi().Ai().h();
                    if (h17 == null || h17.isEmpty()) {
                        db5.e1.A(walletBaseUI, str, "", walletBaseUI.getString(com.tencent.mm.R.string.f493589kv1), walletBaseUI.getString(com.tencent.mm.R.string.kgy), new yr4.g(this, walletBaseUI), new yr4.h(this, walletBaseUI));
                    } else {
                        db5.e1.A(walletBaseUI, str, "", walletBaseUI.getString(com.tencent.mm.R.string.kvg), walletBaseUI.getString(com.tencent.mm.R.string.kgy), new yr4.i(this, walletBaseUI), new yr4.j(this, walletBaseUI));
                    }
                    return true;
                default:
                    return false;
            }
        }
        if ((this.f213801c.getInt("key_pay_flag", 0) == 3) && this.f213801c.getParcelable("key_bankcard") != null) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f213801c.getParcelable("key_bankcard");
            db5.e1.A(walletBaseUI, com.tencent.mm.sdk.platformtools.t8.K0(str) ? walletBaseUI.getString(com.tencent.mm.R.string.kvx, bankcard.field_desc, bankcard.field_mobile) : str, "", walletBaseUI.getString(com.tencent.mm.R.string.kvw), walletBaseUI.getString(com.tencent.mm.R.string.f490347sg), new yr4.f(this, i17, walletBaseUI), null);
            return true;
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void x() {
        com.tencent.mm.sdk.platformtools.u3.i(new yr4.k(this), 200L);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void y(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        java.util.List list = this.f465110d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == walletBaseUI) {
                ((java.util.ArrayList) list).remove(weakReference);
                return;
            }
        }
    }
}
