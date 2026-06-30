package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161179d;

    public j3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI) {
        this.f161179d = settingFingerprintHomeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161179d;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = settingFingerprintHomeUI.f160213m;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        settingFingerprintHomeUI.f160212i = false;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(settingFingerprintHomeUI, com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI.class);
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] jump into fingerprint verify", new java.lang.Object[0]);
        settingFingerprintHomeUI.startActivityForResult(intent);
    }
}
