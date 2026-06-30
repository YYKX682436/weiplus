package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class o3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161375a;

    public o3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI) {
        this.f161375a = settingFingerprintHomeUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            try {
                android.content.Intent intent = new android.content.Intent("android.settings.FINGERPRINT_ENROLL");
                if (com.tencent.mm.sdk.platformtools.t8.I0(this.f161375a.getContext(), intent, true, false)) {
                    com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161375a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(settingFingerprintHomeUI, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    settingFingerprintHomeUI.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(settingFingerprintHomeUI, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI2 = this.f161375a;
                    android.content.Intent intent2 = new android.content.Intent("android.settings.BIOMETRIC_ENROLL");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(settingFingerprintHomeUI2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    settingFingerprintHomeUI2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(settingFingerprintHomeUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (java.lang.Exception e17) {
                rk0.c.b("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] error in goto fingerprint settings, errMsg is " + e17, new java.lang.Object[0]);
            }
        }
    }
}
