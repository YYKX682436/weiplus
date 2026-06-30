package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class zi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI f161829d;

    public zi(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI) {
        this.f161829d = settingsMusicAiCreateModelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI = this.f161829d;
        settingsMusicAiCreateModelUI.hideVKB();
        settingsMusicAiCreateModelUI.finish();
        return true;
    }
}
