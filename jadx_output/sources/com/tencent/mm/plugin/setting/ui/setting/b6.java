package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class b6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f160860d;

    public b6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI) {
        this.f160860d = settingsAboutSystemUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI = this.f160860d;
        settingsAboutSystemUI.hideVKB();
        settingsAboutSystemUI.finish();
        return true;
    }
}
