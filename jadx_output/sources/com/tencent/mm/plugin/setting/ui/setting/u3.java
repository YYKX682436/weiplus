package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class u3 implements wd0.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI f161595a;

    public u3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI) {
        this.f161595a = settingFingerprintVerifyUI;
    }

    @Override // wd0.g2
    public void a(wd0.m2 param) {
        kotlin.jvm.internal.o.g(param, "param");
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI = this.f161595a;
        settingFingerprintVerifyUI.getIntent().putExtra("verify_result", param.f444752a);
        android.content.Intent intent = settingFingerprintVerifyUI.getIntent();
        zt5.s sVar = param.f444754c;
        intent.putExtra("fingerprint_id", sVar != null ? sVar.f475621b : null);
        if (settingFingerprintVerifyUI.f160215d) {
            return;
        }
        settingFingerprintVerifyUI.f160215d = true;
        if (param.f444752a != 0 || param.f444754c == null) {
            settingFingerprintVerifyUI.setResult(0, settingFingerprintVerifyUI.getIntent());
            settingFingerprintVerifyUI.finish();
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = settingFingerprintVerifyUI.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = settingFingerprintVerifyUI.getString(com.tencent.mm.R.string.p9d);
        e4Var.f211780g = 2;
        e4Var.f211778e = false;
        kotlinx.coroutines.l.d(v65.m.b(settingFingerprintVerifyUI), kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.setting.ui.setting.t3(settingFingerprintVerifyUI, e4Var.c(), null), 2, null);
    }
}
