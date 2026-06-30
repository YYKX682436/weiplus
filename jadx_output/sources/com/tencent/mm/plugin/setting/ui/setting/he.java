package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class he implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f161110d;

    public he(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f161110d = settingsHearingAidTestEnvironmentUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.f160436z;
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f161110d;
        settingsHearingAidTestEnvironmentUI.V6("noise_detect_end", 21);
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_noise_detect_page_back");
        settingsHearingAidTestEnvironmentUI.setResult(0);
        settingsHearingAidTestEnvironmentUI.finish();
        return false;
    }
}
