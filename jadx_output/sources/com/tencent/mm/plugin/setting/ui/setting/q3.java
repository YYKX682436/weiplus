package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class q3 implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI f161461a;

    public q3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI) {
        this.f161461a = settingFingerprintVerifyUI;
    }

    @Override // du5.d
    public void a() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationSucceed", new java.lang.Object[0]);
        android.widget.TextView textView = this.f161461a.f160218g;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            kotlin.jvm.internal.o.o("verifyDescErrorTv");
            throw null;
        }
    }

    @Override // du5.d
    public void b() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onStartAuthentication", new java.lang.Object[0]);
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationHelp helpCode: " + i17 + ", helpString: " + ((java.lang.Object) charSequence), new java.lang.Object[0]);
    }

    @Override // du5.d
    public void d() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationCancelled", new java.lang.Object[0]);
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationError errorCode: " + i17 + ", errorString: " + ((java.lang.Object) charSequence), new java.lang.Object[0]);
    }

    @Override // du5.d
    public void f() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationFailed", new java.lang.Object[0]);
        android.widget.TextView textView = this.f161461a.f160218g;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("verifyDescErrorTv");
            throw null;
        }
    }
}
