package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class wi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI f161708d;

    public wi(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI) {
        this.f161708d = settingsMusicAiCoverModelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI = this.f161708d;
        settingsMusicAiCoverModelUI.hideVKB();
        settingsMusicAiCoverModelUI.finish();
        return true;
    }
}
