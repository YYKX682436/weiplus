package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class pj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161446d;

    public pj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161446d = settingsNotificationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161446d;
        settingsNotificationUI.hideVKB();
        settingsNotificationUI.finish();
        return true;
    }
}
