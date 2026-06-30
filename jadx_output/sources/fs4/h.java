package fs4;

/* loaded from: classes9.dex */
public class h extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public fs4.g f266341d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.s f266342e;

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        this.f213801c.putBoolean("key_is_oversea", !vr4.f1.wi().Ai().t());
        this.f213801c.putInt("key_support_bankcard", vr4.f1.wi().Ai().t() ? 1 : 2);
        this.f213801c.putBoolean("key_is_forgot_process", true);
        boolean z17 = bundle.getBoolean("isFromKinda");
        boolean z18 = bundle.getBoolean("isDomesticUser");
        if (vr4.f1.wi().Ai().t() || (z17 && z18)) {
            B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.class, bundle);
        } else {
            B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.class, bundle);
        }
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "ForgotPwdProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (vr4.f1.wi().Ai().t()) {
            i(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.class, -1, false);
            fs4.g gVar = this.f266341d;
            if (gVar != null) {
                gVar.run(0);
                return;
            }
            return;
        }
        i(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.class, -1, false);
        fs4.g gVar2 = this.f266341d;
        if (gVar2 != null) {
            gVar2.run(-1);
        }
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI) {
            if (bundle.containsKey("key_is_force_bind") && bundle.getBoolean("key_is_force_bind")) {
                B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) {
            if (r()) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            f(activity, bundle);
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI)) {
            a("startActivity2", activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.class, bundle, "flag: 67108864");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.class);
            intent.putExtra("process_id", fs4.h.class.hashCode());
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (bundle != null) {
                this.f213801c.putAll(bundle);
            }
            this.f213801c.getInt("key_support_bankcard", 1);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI) {
            if (!bundle.containsKey("key_is_support_face") || bundle.getInt("key_is_support_face") != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "forward not support face");
                B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.class, bundle);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "forward support face");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15774, java.lang.Integer.valueOf(this.f213801c.getInt("key_forgot_scene", 1)), 1);
                B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI) {
            if (bundle.containsKey("key_select_bank_card") && bundle.getBoolean("key_select_bank_card")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "forward select bankcard");
                B(activity, com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.class, bundle);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "forward after face check");
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI) {
            return new fs4.a(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI) {
            return new fs4.b(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) {
            return new fs4.c(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new fs4.d(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new fs4.e(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.f493529km1;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public boolean w(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, java.lang.String str) {
        if (i17 != 404) {
            return false;
        }
        db5.e1.E(walletBaseUI, str, null, walletBaseUI.getString(com.tencent.mm.R.string.f493529km1), false, new fs4.f(this, walletBaseUI));
        return true;
    }
}
