package qz2;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f367840d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f367841e = true;

    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess start,forward to WalletCheckPwdUI");
        this.f367841e = bundle.getBoolean("key_show_succ_toast");
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        f(activity, new android.os.Bundle());
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "FingerprintAuth";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess end");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f367840d)) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putString("token", this.f367840d);
        }
        if (this.f213801c.getInt("open_scene", 0) == 1) {
            k(activity, "wallet", ".pwd.ui.WalletBiometricPaySettingsUI", 0, intent, true);
        } else {
            l(activity, 0, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI)) {
            if (activity instanceof com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI) {
                f(activity, bundle);
                return;
            } else {
                if (activity instanceof com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI) {
                    f(activity, bundle);
                    return;
                }
                return;
            }
        }
        if (bundle != null) {
            this.f367840d = bundle.getString("key_bind_card_user_token", "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthProcess", "forward to FingerPrintAuthUI");
        if (this.f213801c.getInt("key_open_biometric_type") != 1) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("key_scene", 0);
            bundle2.putBoolean("key_show_succ_toast", this.f367841e);
            C(activity, com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.class, bundle, bundle2);
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthProcess", "use biometric prompt: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            B(activity, com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI.class, bundle);
            return;
        }
        if (bundle != null) {
            bundle.putBoolean("key_show_succ_toast", this.f367841e);
        }
        B(activity, com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.class, bundle);
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new qz2.a(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
