package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class rk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI f161513d;

    public rk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI) {
        this.f161513d = settingsPersonalInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI = this.f161513d;
        settingsPersonalInfoUI.hideVKB();
        settingsPersonalInfoUI.finish();
        return true;
    }
}
