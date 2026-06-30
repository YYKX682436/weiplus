package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class p6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI f161425d;

    public p6(com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI settingsActiveTimeUI) {
        this.f161425d = settingsActiveTimeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI settingsActiveTimeUI = this.f161425d;
        settingsActiveTimeUI.hideVKB();
        settingsActiveTimeUI.finish();
        return true;
    }
}
