package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class m3 implements wd0.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161311b;

    public m3(boolean z17, com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI) {
        this.f161310a = z17;
        this.f161311b = settingFingerprintHomeUI;
    }

    @Override // wd0.c2
    public void a(com.tencent.mm.feature.setting.api.BindFingerprintCallback param) {
        kotlin.jvm.internal.o.g(param, "param");
        int i17 = param.f67814e;
        boolean z17 = this.f161310a;
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161311b;
        if (i17 != 0 || !z17) {
            settingFingerprintHomeUI.runOnUiThread(new com.tencent.mm.plugin.setting.ui.setting.l3(settingFingerprintHomeUI, param, z17));
        } else {
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI.f160206o;
            kotlinx.coroutines.l.d(settingFingerprintHomeUI.getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.setting.ui.setting.k3(settingFingerprintHomeUI, null), 3, null);
        }
    }
}
