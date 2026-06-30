package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class bl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI f160877d;

    public bl(com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI settingsPluginsUI) {
        this.f160877d = settingsPluginsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI settingsPluginsUI = this.f160877d;
        settingsPluginsUI.hideVKB();
        settingsPluginsUI.finish();
        return true;
    }
}
