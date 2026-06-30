package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class de implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f160943a;

    public de(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f160943a = settingsHearingAidTestEnvironmentUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f160943a;
        if (!z17) {
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.f160436z;
            settingsHearingAidTestEnvironmentUI.V6("noise_detect_end", 21);
            settingsHearingAidTestEnvironmentUI.setResult(0);
            settingsHearingAidTestEnvironmentUI.finish();
            return;
        }
        k14.t tVar = k14.t.f303377a;
        if (tVar.c()) {
            tVar.e();
        } else {
            tVar.a(v65.m.b(settingsHearingAidTestEnvironmentUI));
        }
        settingsHearingAidTestEnvironmentUI.f160445o = false;
    }
}
