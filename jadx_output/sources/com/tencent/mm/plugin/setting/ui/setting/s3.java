package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class s3 implements wd0.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f161528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI f161529b;

    public s3(com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI) {
        this.f161528a = f4Var;
        this.f161529b = settingFingerprintVerifyUI;
    }

    @Override // wd0.c2
    public void a(com.tencent.mm.feature.setting.api.BindFingerprintCallback param) {
        kotlin.jvm.internal.o.g(param, "param");
        this.f161528a.dismiss();
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] bind result(callback) is errType: " + param.f67813d + ", errCode: " + param.f67814e + ", errMsg: " + param.f67815f + ",res is " + param.f67816g, new java.lang.Object[0]);
        int i17 = param.f67814e;
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI = this.f161529b;
        if (i17 == 0) {
            settingFingerprintVerifyUI.getIntent().putExtra("bind_result", param);
            settingFingerprintVerifyUI.setResult(-1, settingFingerprintVerifyUI.getIntent());
        } else {
            settingFingerprintVerifyUI.getIntent().putExtra("bind_result", param);
            settingFingerprintVerifyUI.setResult(0, settingFingerprintVerifyUI.getIntent());
        }
        settingFingerprintVerifyUI.finish();
    }
}
